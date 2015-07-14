package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String usuario = getUsuario(req);		
		System.out.println("Usuario: " + usuario + " Acessando a URI " + req.getRequestURI());
		
		Cookie usuariologado = new Cookies(req.getCookies()).getUsuarioLogado();
		
		if(usuariologado != null){
			usuariologado.setMaxAge(60 * 5);
			resp.addCookie(usuariologado);
		}
		
		chain.doFilter(request, response);
		
	}

	private String getUsuario(HttpServletRequest req) {
		
		String usuario = "<deslogado>";
		Cookie cookie = new Cookies(req.getCookies()).getUsuarioLogado();
		
		if(cookie == null){
			return usuario;
		}else{
			return cookie.getValue();
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

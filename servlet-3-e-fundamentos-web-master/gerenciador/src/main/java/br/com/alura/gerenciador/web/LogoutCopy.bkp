package br.com.alura.gerenciador.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.web.Cookies;


@WebServlet(urlPatterns="/logout")
public class Logout extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {



		HttpSession session = req.getSession();		
		session.removeAttribute("usuarioLogado");
		
		 RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logout.html");
	     dispatcher.forward(req, resp);

		/*
		Cookie cookie = new Cookies(req.getCookies()).getUsuarioLogado();
		if(cookie != null){
			cookie.setMaxAge(0);
			resp.addCookie(cookie);
			writer.println("<html><body>Deslogado com sucesso</html></body>");
		}else{
			writer.println("<html><body>Não estava logado!</html></body>");
		}
		*/
	}

}

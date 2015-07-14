import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.web.Cookies;


@WebServlet(urlPatterns="/logout")
public class Logout extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Cookie cookie = new Cookies(req.getCookies()).getUsuarioLogado();

		PrintWriter writer = resp.getWriter();
		
		if(cookie != null){
			cookie.setMaxAge(0);
			resp.addCookie(cookie);
			writer.println("<html><body>Deslogado com sucesso</html></body>");
		}else{
			writer.println("<html><body>Não estava logado!</html></body>");
		}
	}

}

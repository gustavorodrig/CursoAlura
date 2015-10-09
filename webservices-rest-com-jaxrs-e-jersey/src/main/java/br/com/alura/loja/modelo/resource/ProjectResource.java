package br.com.alura.loja.modelo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.dao.ProjetoDAO;
import br.com.alura.loja.modelo.Projeto;

@Path("projetos")
public class ProjectResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String busca() {

		ProjetoDAO dao = new ProjetoDAO();
		Projeto projeto = dao.busca(1l);

		return projeto.toXML();

	}

}

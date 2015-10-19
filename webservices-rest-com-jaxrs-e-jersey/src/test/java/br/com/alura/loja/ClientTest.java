package br.com.alura.loja;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Projeto;
import junit.framework.Assert;

public class ClientTest {

	private HttpServer server;



	@Before
	public void startaServidor(){
		this.server = Servidor.startaServidor();
	}
	
	
	@After
	public void mataServidor(){
		this.server.stop();
	}
	
	
	@Test
	public void testaQueBuscarUmCarrinhoTrazOCarrinhoEsperado(){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8088");
		String conteudo = target.path("/carrinhos/1").request().get(String.class);
		
		System.out.println(conteudo);
		
		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		
		Assert.assertEquals("Rua Vergueiro 3185, 8 andar" , carrinho.getRua());
	}
	
	@Test
	public void testaProjetoId1(){
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8088");
		String conteudo = target.path("/projetos").request().get(String.class);
		
		System.out.println(conteudo);
		
		Projeto projeto = (Projeto) new XStream().fromXML(conteudo);
		
		Assert.assertEquals(1 , projeto.getId());
	}
	
	
	
}

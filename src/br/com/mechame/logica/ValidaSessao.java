package br.com.mechame.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mechame.interfac.LogicaString;
import br.com.model.Usuario;

public class ValidaSessao implements LogicaString {
	
	public boolean executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String telefone = req.getParameter("telefone");
		String senha = req.getParameter("senha");
		
		
		/*
		 * Cria a regra de requisi��o pro servidor solicitando valida��o de login e senha blas bla bla
		 * 
		 * 
		 * 
		 * Converter resultado do servidor de aplica��o pra um objeto do tipo usu�rio
		 * 		Se conseguir converter
		 * 			Cria-se as session com os dados do usu�rio
		 * 			Return "true"
		 * 		Se n�o conseguir converter
		 * 			Reseta as session
		 * 			Return "false"*/
		
		
		return false;
		
	}
	
}

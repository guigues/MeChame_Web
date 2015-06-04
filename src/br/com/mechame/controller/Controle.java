package br.com.mechame.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mechame.interfac.LogicaString;

@WebServlet("/mvcRet")
public class Controle extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String logica = req.getParameter("logica");
		String caminho = "br.com.logica." + logica;
		
		try
		{
			Class<?> classe = Class.forName(caminho);
			LogicaString logicaString = (LogicaString) classe.newInstance();

			// Recebe a String após a execução da lógica
			boolean logado = logicaString.executa(req, res);
			
			if (logado) {
				
				/*Redireciona para o painel_mechame*/
				req.getRequestDispatcher("painel_mechame/index.jsp").forward(req, res);
				
			}else{
				
				/*Estoura uma Exception*/
				
			}
			

		}
		catch (Exception e)
		{
			e.printStackTrace();
			req.setAttribute("erro", "Telefone ou Senha inválido.");
			req.getRequestDispatcher("erro.jsp").forward(req, res);
		}
		
	}
}

package br.com.mechame.interfac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaString {
	boolean executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
}

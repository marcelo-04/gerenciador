package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/acesso")
public class AloMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Alo mundo, meu primeiro servlets.");
        out.println("</body>");
        out.println("</html>");
        
        System.out.println("o servlet Alo Mundo foi chamado");
	}
}

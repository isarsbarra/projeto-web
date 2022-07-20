package br.com.sinqia.primeiroprojetoweb;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/cliente-servlet")
public class ClienteServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Iniciando Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Chamando Método GET");
        resp.setContentType("text/html");

        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<p>Cliente: " + nome + " </p>");
        writer.println("<p>CPF: " + cpf + " </p>");
        writer.println("</body>");
        writer.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Chamando Método POST");
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<p>POST</p>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
}

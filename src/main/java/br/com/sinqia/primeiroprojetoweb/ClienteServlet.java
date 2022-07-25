package br.com.sinqia.primeiroprojetoweb;

import br.com.sinqia.primeiroprojetoweb.bo.ClienteBusinessObject;
import br.com.sinqia.primeiroprojetoweb.dao.ClienteDAO;
import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/cliente-servlet")
public class ClienteServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Iniciando Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Chamando Método GET");

        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Chamando Método POST");

        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String idade = req.getParameter("idade");

        ClienteBusinessObject businessObject = new ClienteBusinessObject();

        Integer idadeCliente = null;
        if(!idade.isEmpty()){
            idadeCliente = Integer.parseInt(idade);
        }

        Cliente cliente = new Cliente(nome, cpf, email, idadeCliente);
        Cliente clienteSalvo = businessObject.save(cliente);

        req.setAttribute("idClienteSalvo", clienteSalvo.getId());

        List<Cliente> clientes = businessObject.findAll();

        req.setAttribute("clientes", clientes);

        RequestDispatcher dispatcher = req.getRequestDispatcher("lista-clientes.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
}

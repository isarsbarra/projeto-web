package br.com.sinqia.primeiroprojetoweb;

import br.com.sinqia.primeiroprojetoweb.bo.ClienteBusinessObjectI;
import br.com.sinqia.primeiroprojetoweb.injecao.email.EmailService;
import br.com.sinqia.primeiroprojetoweb.injecao.email.GmailServiceQualifier;
import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/cliente-servlet")
public class ClienteServlet extends HttpServlet {

    @Inject
    //@Named("servicoHotmail")
    @GmailServiceQualifier
    private EmailService emailService;

    private ClienteBusinessObjectI clienteBusinessObjectI;

    @Inject
    public ClienteServlet(ClienteBusinessObjectI clienteBusinessObjectI) {
        this.clienteBusinessObjectI = clienteBusinessObjectI;
    }

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

        Integer idadeCliente = null;
        if(!idade.isEmpty()){
            idadeCliente = Integer.parseInt(idade);
        }

        Cliente cliente = new Cliente(nome, cpf, email, idadeCliente);
        Cliente clienteSalvo = clienteBusinessObjectI.save(cliente);

        emailService.enviaEmailBoasVindas(cliente);

        req.setAttribute("idClienteSalvo", clienteSalvo.getId());

        List<Cliente> clientes = clienteBusinessObjectI.findAll();

        req.setAttribute("clientes", clientes);

        RequestDispatcher dispatcher = req.getRequestDispatcher("lista-clientes.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
}

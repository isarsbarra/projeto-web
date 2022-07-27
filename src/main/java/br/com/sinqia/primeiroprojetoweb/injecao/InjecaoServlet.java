package br.com.sinqia.primeiroprojetoweb.injecao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/teste-injecao")
public class InjecaoServlet extends HttpServlet {

//    Modo 1: injeção no parâmetro
    @Inject
    //@Named("amarela")
    @VermelhoQualifier
    private Cor cor;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Cor cor = new Amarela();
        System.out.println(cor.definirCor());
    }

//    Modo 2: injeção pelo construtor
//
//    private Cor cor;
//
//    @Inject
//    public InjecaoServlet(Cor cor){
//        this.cor = cor;
//    }
//
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //Cor cor = new Amarela();
//        new InjecaoServlet(this.cor);
//        System.out.println(cor.definirCor());

//    Modo 3: injeção pelo método set
//
//    private Cor cor;
//
//    @Inject
//
//    public void setCor(Cor cor) {
//        this.cor = cor;
//    }
//
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //Cor cor = new Amarela();
//        //setCor(this.cor);
//        System.out.println(cor.definirCor());
//    }
}

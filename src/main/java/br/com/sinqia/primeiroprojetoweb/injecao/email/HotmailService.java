package br.com.sinqia.primeiroprojetoweb.injecao.email;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

//@Alternative
//@Named("servicoHotmail")
@HotmailServiceQualifier
public class HotmailService implements EmailService {

    public void enviaEmailBoasVindas (Cliente cliente){
        System.out.println("HOTMAIL SERVICE: Enviando email de boas vindas para ".concat(cliente.getEmail()));
    }
}

package br.com.sinqia.primeiroprojetoweb.bo;

import br.com.sinqia.primeiroprojetoweb.dao.ClienteDAO;
import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.List;
import java.util.Objects;

public class ClienteBusinessObject {

    private ClienteDAO clienteDAO;

    public ClienteBusinessObject() {
        clienteDAO = new ClienteDAO(); //TODO rever isso, não é bacana
    }

    public Cliente save (Cliente cliente){
        valida(cliente);
        clienteDAO.save(cliente);
        return cliente;
    }

    private void valida(Cliente cliente) {
        if(Objects.isNull(cliente.getNome())){
            throw new IllegalArgumentException("Nome inválido!");
        }
    }

    public List<Cliente> findAll (){
        return clienteDAO.findAll();
    }
}

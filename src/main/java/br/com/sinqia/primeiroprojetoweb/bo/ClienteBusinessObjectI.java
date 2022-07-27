package br.com.sinqia.primeiroprojetoweb.bo;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.List;

public interface ClienteBusinessObjectI {

    public abstract Cliente save (Cliente cliente);

    public abstract List<Cliente> findAll ();
}

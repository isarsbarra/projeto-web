package br.com.sinqia.primeiroprojetoweb.dao;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.List;

public interface ClienteDAOI {

    public abstract Cliente save (Cliente cliente);

    public abstract List<Cliente> findAll ();
}

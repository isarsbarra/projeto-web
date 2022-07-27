package br.com.sinqia.primeiroprojetoweb.dao;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/** Classe que representa o acesso a base de dados
 * @author Isabella Barra
 * @since 24/07/2022
 * @version 1.0.0
 * Isso deve ser substituído pela nomenclatura repository
*/

public class ClienteDAOImpl implements ClienteDAOI{

    private static List<Cliente> bancoClientes = new ArrayList<>();
    private static long countCliente;

    @Override
    public Cliente save (Cliente cliente){
        countCliente++;
        cliente.setId(countCliente);
        bancoClientes.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> findAll (){
        return bancoClientes;
    }

}

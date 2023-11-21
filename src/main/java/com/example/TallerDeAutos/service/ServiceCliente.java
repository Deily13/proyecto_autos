package com.example.TallerDeAutos.service;

import com.example.TallerDeAutos.interfaceService.IClienteService;
import com.example.TallerDeAutos.model.Clientes;
import com.example.TallerDeAutos.repository.RepositoryClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceCliente implements IClienteService {

    @Autowired
    private RepositoryClientes repositoryClientes;
    @Override
    public List<Clientes> listar() {
        return (List<Clientes>) repositoryClientes.findAll() ;
    }

    @Override
    public Optional<Clientes> listId(int id) {
        return repositoryClientes.findById(id);
    }

    @Override
    public int save(Clientes c) {
        int res =0;
        Clientes clientes = repositoryClientes.save(c);
        if(!clientes.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) { repositoryClientes.deleteById(id);

    }
}

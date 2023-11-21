package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.Clientes;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Clientes> listar();
    public Optional<Clientes> listId(int id);
    public int save(Clientes c);
    public void delete(int id);
}


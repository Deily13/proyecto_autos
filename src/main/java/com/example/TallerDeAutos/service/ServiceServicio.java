package com.example.TallerDeAutos.service;

import com.example.TallerDeAutos.interfaceService.IServicioService;
import com.example.TallerDeAutos.model.Clientes;
import com.example.TallerDeAutos.model.Servicios;
import com.example.TallerDeAutos.repository.RepositoryServicios;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceServicio implements IServicioService {

    @Autowired
    private RepositoryServicios repositoryServicios;

    @Override
    public List<Servicios> listar() {
        return null;
    }

    @Override
    public Optional<Servicios> listservcios(int id_servic_cliente) {
        return repositoryServicios.findById(id_servic_cliente);
    }

    @Override
    public int save(Servicios s) {
        int res = 0;
        Clientes clientes = new Clientes();
        Servicios servicios = repositoryServicios.save(s);
        if (servicios.getClass().equals(!clientes.equals(null))) {

            res = 1;
        }
        return res;
    }
}

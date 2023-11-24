package com.example.TallerDeAutos.service;

import com.example.TallerDeAutos.interfaceService.IMarcaService;
import com.example.TallerDeAutos.model.Marcas;
import com.example.TallerDeAutos.model.Vehiculos;
import com.example.TallerDeAutos.repository.RepositoryMarcas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceMarca implements IMarcaService {
    @Autowired
    private RepositoryMarcas repositoryMarcas;

    @Override
    public List<Marcas> listar() {
        return (List<Marcas>) repositoryMarcas.findAll();
    }

    @Override
    public Optional<Marcas> listIdMarca(int IdMarca) {
        return Optional.empty();
    }

    @Override
    public int guardarMarca(Marcas m) {
        int res = 0;
        Vehiculos vehiculos = new Vehiculos();
        Marcas marcas = repositoryMarcas.save(m);
        if (marcas.getClass().equals(!vehiculos.equals(null))){
            res = 1;
        }
        return res;
    }


}

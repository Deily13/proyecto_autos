package com.example.TallerDeAutos.service;

import com.example.TallerDeAutos.interfaceService.IVehiculoService;
import com.example.TallerDeAutos.model.Clientes;
import com.example.TallerDeAutos.model.Vehiculos;
import com.example.TallerDeAutos.repository.RepositoryVehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceVehiculo implements IVehiculoService {
    @Autowired
    private RepositoryVehiculos repositoryVehiculos;
    @Override
    public List<Vehiculos> listar() {
        return(List<Vehiculos>) repositoryVehiculos.findAll();
    }

    @Override
    public Optional<Vehiculos> listplaca(String placa) {
        return repositoryVehiculos.findById(placa);
    }

    @Override
    public int guardarVehiculo(Vehiculos v) {
        int res=0;
        Clientes clientes = new Clientes();
        Vehiculos vehiculos =repositoryVehiculos.save(v);
        if(vehiculos.getClass().equals(!clientes.equals(null)) ){
            res=1;
        }

        return res;
    }
}

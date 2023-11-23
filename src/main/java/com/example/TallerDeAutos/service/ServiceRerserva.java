package com.example.TallerDeAutos.service;

import com.example.TallerDeAutos.interfaceService.IReservaService;
import com.example.TallerDeAutos.model.Clientes;
import com.example.TallerDeAutos.model.Reservas;
import com.example.TallerDeAutos.repository.RepositoryReservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceRerserva implements IReservaService {
    @Autowired
    private RepositoryReservas repositoryReservas;

    @Override
    public List<Reservas> listar() {
        return (List<Reservas>) repositoryReservas.findAll();
    }
    @Override
    public Optional<Reservas> listidRes(int idRes) {
        return Optional.empty();
    }

    @Override
    public int save(Reservas r) {
        int res = 0;
        Clientes clientes = new Clientes();
        Reservas reservas = repositoryReservas.save(r);
        if (reservas.getClass().equals(!clientes.equals(null))){
            res = 1;
        }
        return  res;
    }
}

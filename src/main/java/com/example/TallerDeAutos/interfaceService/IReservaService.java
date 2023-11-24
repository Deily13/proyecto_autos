package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.Reservas;

import java.util.List;
import java.util.Optional;

public interface IReservaService {
    public List<Reservas> listar();
    public Optional<Reservas> listidRes(int idRes);
    public int guardarReserva (Reservas r);

}

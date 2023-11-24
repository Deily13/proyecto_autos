package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.Servicios;

import java.util.List;
import java.util.Optional;

public interface IServicioService {
    public List<Servicios> listar();
    public Optional<Servicios> listservicios(int servicio);
    public int guardarServicio (Servicios s);

}

package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.Vehiculos;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    public List<Vehiculos> listar();
    public Optional<Vehiculos> listplaca(String placa);
    public int guardarVehiculo (Vehiculos v);
}

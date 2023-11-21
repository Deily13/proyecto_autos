package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.ServiciosC;

import java.util.List;
import java.util.Optional;

public interface IServicioCService {
    public List<ServiciosC> listar();
    public Optional<ServiciosC> listServiciosC(int id_servic_cliente);
    public int save (ServiciosC c);
}

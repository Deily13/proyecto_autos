package com.example.TallerDeAutos.interfaceService;

import com.example.TallerDeAutos.model.Marcas;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {
        public List<Marcas> listar();
        public Optional<Marcas> listIdMarca(int IdMarca);
        public int guardarMarca(Marcas m);
    }


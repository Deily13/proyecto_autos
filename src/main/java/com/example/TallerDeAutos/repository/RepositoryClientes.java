package com.example.TallerDeAutos.repository;

import com.example.TallerDeAutos.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClientes extends JpaRepository<Clientes, Integer> {
}

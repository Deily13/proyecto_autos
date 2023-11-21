package com.example.TallerDeAutos.repository;

import com.example.TallerDeAutos.model.Vehiculos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryVehiculos extends JpaRepository<Vehiculos, String> {
}

package com.example.TallerDeAutos.repository;

import com.example.TallerDeAutos.model.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RepositoryMarcas extends JpaRepository<Marcas, String> {
}

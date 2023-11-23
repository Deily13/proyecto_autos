package com.example.TallerDeAutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="marca")
public class Marcas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdMarca;
    @Column
    private String nombreMarca;

    @OneToMany(mappedBy = "marca")
    private List<Vehiculos> vehiculos;

}

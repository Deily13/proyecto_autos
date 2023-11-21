package com.example.TallerDeAutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "servicioC")
public class ServiciosC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_servic_cliente;

    @Column
    private int Idservicies;

    @Column
    private int Idclient;


}

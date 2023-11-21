package com.example.TallerDeAutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="servicio")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idServ;
    @Column
    private String descripcion;

}

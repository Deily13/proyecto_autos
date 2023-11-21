package com.example.TallerDeAutos.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "vehiculo")
public class Vehiculos {

    @Id
    private String placa;
    @Column
    private String color;
    @Column
    private int años_auto;
    @Column
    private int IdMarca;

}

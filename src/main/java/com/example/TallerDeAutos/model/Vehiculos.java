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
@Table(name = "vehiculo")
public class Vehiculos {

    @Id
    private String placa;
    @Column
    private String color;
    @Column
    private int años_auto;

    @OneToOne
    @JoinColumn(name = "placaAuto")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marcas marca;





}

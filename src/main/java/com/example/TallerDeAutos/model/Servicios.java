package com.example.TallerDeAutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "opcion")
    private String opcion;

    @ElementCollection
    private List<String> opciones;

    public Servicios(List<String> opciones) {
        this.opciones = opciones;
    }

    public int getId() {
        return idServ;
    }

    public void setId(int id) {
        this.idServ = idServ;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public static void main(String[] args) {
        List<String> opciones = new ArrayList<>();
        opciones.add("Revision Tecnica");
        opciones.add("Mantenimiento-1");
        opciones.add("Mantenimiento-2");
        opciones.add("Reparación");
        opciones.add("Cambio-partes");
        opciones.add("Cambio-aceite");
        opciones.add("Cambio-Ruedas");
        opciones.add("Revision-Suspencion");
        opciones.add("Alineación-Rotación");
        opciones.add("Revision-Frenos");
        opciones.add("Lavado");
        opciones.add("Pulido");


        Servicios servicio = new Servicios(opciones);
    }

    @ManyToMany(mappedBy = "servicios")
    private List<Clientes> clientes;
}

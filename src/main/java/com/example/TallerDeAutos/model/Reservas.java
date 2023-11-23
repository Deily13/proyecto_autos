package com.example.TallerDeAutos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="reserva")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idRes;
    @Column
    private String llevar_auto;
    @Column
    private String hora_auto;
    @Column
    private String recojer_auto;
    @Column
    private String tipo_p;

    @OneToOne
    @JoinColumn(name = "idReserva")
    private Clientes cliente;
}

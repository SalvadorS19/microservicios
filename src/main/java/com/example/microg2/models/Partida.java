package com.example.microg2.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Partidas")
@Getter
@Setter
@Builder
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creador;
    private String deporte;
    private String ciudad;
    private String provincia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaComienzo;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;
    @ManyToMany(mappedBy = "partidas")
    private List<Usuario> usuarios;
}


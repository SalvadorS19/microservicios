package com.example.microg2.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String password;
    private String repPassword;
    private Boolean enabled;
    private String foto;
    private String rol;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;
    @ManyToMany
    @JoinTable(
            name="Partidas_Usuarios",
            joinColumns = @JoinColumn(name="usuario_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="partida_id", referencedColumnName="id")
    )
    private List<Partida> partidas;
    @OneToMany(mappedBy = "usuario")
    private List<Sugerencia> sugerencias;
    @OneToMany(mappedBy = "usuario")
    private List<Mensaje> mensajes;
}

package com.rge.dormitorio.rgeallocator.adapters.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "leito")
public class LeitosEntity {

    @Id
    @Column(name = "numero_leito")
    private String numero_leito;

    @ManyToOne
    @JoinColumn(name = "dormitorio_id", nullable = false)
    private DormitoriosEntity dormitorio;

    @OneToOne(mappedBy = "leito", cascade = CascadeType.ALL)
    private ReservasEntity reserva;
}

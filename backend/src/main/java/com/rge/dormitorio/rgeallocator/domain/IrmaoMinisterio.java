package com.rge.dormitorio.rgeallocator.domain;

import com.rge.dormitorio.rgeallocator.adapters.database.entity.ReservasEntity;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class IrmaoMinisterio {

    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataOrdenacao;
    private String ministerio;
    private Integer idade;
    private Integer tempoDeMinisterio;

    public IrmaoMinisterio(ReservasEntity reserva) {
        this.nome = reserva.getNomeIrmao();
        this.dataNascimento = reserva.getDataNascimento();
        this.dataOrdenacao = reserva.getDataOrdenacao();
        this.ministerio = reserva.getMinisterio();
        this.idade = calcularIdade();
        this.tempoDeMinisterio = calcularTempoDeMinisterio();
    }

    private Integer calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    private Integer calcularTempoDeMinisterio() {
        return LocalDate.now().getYear() - dataOrdenacao.getYear();
    }
}

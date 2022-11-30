package br.com.mvmgabriel.agenda.infra.db.model;

import java.time.LocalDateTime;

public interface PacienteAgenda {

    String getNome();
    String getCpf();
    LocalDateTime getHorario();
    String getDescricao();

}
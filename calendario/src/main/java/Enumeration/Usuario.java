package Enumeration;

import Repository.EntidadeRepository;

import java.time.LocalDateTime;

public enum Usuario implements EntidadeRepository {
    ADMINISTRADOR("Administrador"),
    ORGANIZADOR("Organizador"),
    PARTICIPANTE("Participante");

    private final String descricao;

    Usuario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public LocalDateTime getDataCriacao() {
        return null;
    }

    @Override
    public void setDataCriacao(LocalDateTime dataCriacao) {

    }

    @Override
    public LocalDateTime getDataAtualizacao() {
        return null;
    }

    @Override
    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {

    }

    @Override
    public void onPersist() {
        EntidadeRepository.super.onPersist();
    }

    @Override
    public void onUpdate() {
        EntidadeRepository.super.onUpdate();
    }
}

package Model;

import Repository.EntidadeRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Usuario implements EntidadeRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

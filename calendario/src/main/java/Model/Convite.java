package Model;

import Enumeration.TipoEvento;

import java.time.LocalDateTime;

public class Convite {
    private String nomeConvidado;
    private String nomeEvento;
    private LocalDateTime dataHoraEvento;
    private String enderecoEvento;
    private String nomeOrganizador;
    private String mensagemPersonalizada;
    private TipoEvento tipoEvento;
    private boolean confirmado;

    // construtor
    public Convite(String nomeConvidado, String nomeEvento, LocalDateTime dataHoraEvento, String enderecoEvento,
                   String nomeOrganizador, String mensagemPersonalizada, TipoEvento tipoEvento, boolean confirmado) {
        this.nomeConvidado = nomeConvidado;
        this.nomeEvento = nomeEvento;
        this.dataHoraEvento = dataHoraEvento;
        this.enderecoEvento = enderecoEvento;
        this.nomeOrganizador = nomeOrganizador;
        this.mensagemPersonalizada = mensagemPersonalizada;
        this.tipoEvento = tipoEvento;
        this.confirmado = confirmado;
}
// getters e setters
    // ...
}

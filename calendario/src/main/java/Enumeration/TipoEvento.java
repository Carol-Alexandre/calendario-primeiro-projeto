package Enumeration;

public enum TipoEvento {
    ANIVERSARIO("Aniversário"),
    CASAMENTO("Casamento"),
    FORMATURA("Formatura"),
    CORPORATIVO("Corporativo"),
    BATIZADO("Batizado"),
    OUTROS("Outros");

    private final String descricao;

    TipoEvento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

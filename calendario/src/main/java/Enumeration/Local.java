package Enumeration;

public enum Local {
    SALA("Sala"),
    AUDITORIO("Auditório"),
    TEATRO("Teatro"),
    ESTADIO("Estádio"),
    GINASIO("Ginásio"),
    CLUBE("Clube"),
    PARQUE("Parque");

    private final String descricao;

    Local(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

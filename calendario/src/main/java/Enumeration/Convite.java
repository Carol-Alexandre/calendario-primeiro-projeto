package Enumeration;

public enum Convite {
    ANIVERSARIO("Aniversário"),
    CASAMENTO("Casamento"),
    FORMATURA("Formatura"),
    CORPORATIVO("Corporativo"),
    BATIZADO("Batizado");

    private final String nome;

    Convite(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

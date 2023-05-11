package Enumeration;

public enum Evento {
    ANIVERSARIO("Aniversário"),
    CASAMENTO("Casamento"),
    FORMATURA("Formatura"),
    CORPORATIVO("Corporativo"),
    BATIZADO("Batizado");

    private final String nome;

    Evento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

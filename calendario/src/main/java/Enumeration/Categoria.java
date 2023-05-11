package Enumeration;

public enum Categoria {
    ESPORTE("Esporte"),
    SHOW("Show"),
    TEATRO("Teatro"),
    CINEMA("Cinema"),
    FESTA("Festa"),
    PALESTRA("Palestra"),
    ANIVERSARIO("Aniversário"),
    CASAMENTO("Casamento"),
    FORMATURA("Formatura"),
    CORPORATIVO("Corporativo"),
    BATIZADO("Batizado");

    private String value;

    private Categoria(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

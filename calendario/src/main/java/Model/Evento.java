package Model;

import com.example.calendario.entity.Categoria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Evento {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate data;
    private LocalTime hora;
    private Local local;
    private Categoria categoria;
    private com.example.calendario.entity.Usuario organizador;
    private List<Usuario> participantes;
    private List<Avaliacao> avaliacoes;

    public String getNome() {
        return null;
    }

    // Construtores, getters e setters
}

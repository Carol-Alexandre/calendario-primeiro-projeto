package Repository;

import java.time.LocalDateTime;

public interface EntidadeRepository {
    Long getId();
    void setId(Long id);
    LocalDateTime getDataCriacao();
    void setDataCriacao(LocalDateTime dataCriacao);
    LocalDateTime getDataAtualizacao();
    void setDataAtualizacao(LocalDateTime dataAtualizacao);

    default void onPersist() {
        // Evento de persistência
    }

    default void onUpdate() {
        // Evento de atualização
    }
}

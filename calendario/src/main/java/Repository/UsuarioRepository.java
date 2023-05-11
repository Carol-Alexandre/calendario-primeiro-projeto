package Repository;

import com.example.calendario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    // Métodos customizados aqui, se necessário{
}

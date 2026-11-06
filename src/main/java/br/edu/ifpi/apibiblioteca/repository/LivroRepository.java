package br.edu.ifpi.apibiblioteca.repository;

import br.edu.ifpi.apibiblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository
        extends JpaRepository<Livro, Long> {
}

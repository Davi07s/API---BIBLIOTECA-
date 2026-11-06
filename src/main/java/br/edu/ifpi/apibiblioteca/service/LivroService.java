package br.edu.ifpi.apibiblioteca.service;

import br.edu.ifpi.apibiblioteca.model.Livro;
import br.edu.ifpi.apibiblioteca.repository.LivroRepository;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class LivroService {
    private final LivroRepository repository;
    public LivroService(LivroRepository repository) {

        this.repository = repository;
    }
    public Livro cadastrar(Livro livro) {

        return repository.save(livro);
    }
    public List<Livro> listar() {
        return repository.findAll();
    }
    public Livro buscarPorId(Long id) {
        return repository.findById(id)//retorna o id
                .orElseThrow(() ->//retorna mensagem de erro caso não exista o id
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND, "O Livro não encontrado"
                        )
                );
    }
}

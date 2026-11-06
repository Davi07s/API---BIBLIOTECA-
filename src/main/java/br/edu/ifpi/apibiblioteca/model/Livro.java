package br.edu.ifpi.apibiblioteca.model;
import jakarta.persistence.*;
//Classe Livro identiufica define os atribtos
@Entity //identifica um entidade jpa
@Table(name = "livros") //defne o nome da tabela
public class Livro {
    @Id //identifica a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//configura a geração do id
    private Long id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;
    protected Livro() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}

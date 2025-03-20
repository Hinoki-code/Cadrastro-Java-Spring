package Cadrastro_Java_Spring.Empregos;

import Cadrastro_Java_Spring.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_empregos")
public class EmpregosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int salario;

    @OneToMany(mappedBy = "emprego")
    private List<PessoaModel> pessoas = new ArrayList<>();

    // Construtor padrão
    public EmpregosModel() {
    }

    // Construtor com parâmetros
    public EmpregosModel(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public List<PessoaModel> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaModel> pessoas) {
        this.pessoas = pessoas;
    }
}
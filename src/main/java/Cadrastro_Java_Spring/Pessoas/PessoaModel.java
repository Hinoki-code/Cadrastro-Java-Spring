package Cadrastro_Java_Spring.Pessoas;

import Cadrastro_Java_Spring.Empregos.EmpregosModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_pessoas")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String sexo;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "emprego_id")
    private EmpregosModel emprego;

    // Construtor padrão
    public PessoaModel() {
    }

    // Construtor com parâmetros
    public PessoaModel(String nome, String email, String sexo, int idade) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.idade = idade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EmpregosModel getEmprego() {
        return emprego;
    }

    public void setEmprego(EmpregosModel emprego) {
        this.emprego = emprego;
    }
}
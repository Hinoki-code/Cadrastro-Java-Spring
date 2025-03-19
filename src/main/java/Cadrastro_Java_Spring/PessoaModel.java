package Cadrastro_Java_Spring;


import jakarta.persistence.*;

// tranforma uma classe em uma entidade do Banco de dados
@Entity
@Table(name = "tb_Cadastro_de_Pessoas" )

public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String Nome;
    String Email;
    String Sexo;
    int Idade;

    public PessoaModel() {
    }

    public PessoaModel( String nome, String email, String sexo, int idade) {

        this.Nome = nome;
        this.Email = email;
        this.Sexo = sexo;
        this.Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}



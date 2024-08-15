package model;

import static java.lang.StringTemplate.STR;

public class Contato {
    String nome;
    String sobrenome;
    String email;
    String telefone;

    public Contato(String nome, String sobrenome, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return STR."""
                ----------------------------
                ##### DADOS DO CONTATO #####
                ----------------------------
                Nome: \{nome} \{sobrenome}
                Telefone: \{telefone}
                E-mail: \{email}
                """;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

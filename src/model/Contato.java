package model;

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
        return """
           ╔════════════════════════════════════════╗
           ║            DADOS DO CONTATO            ║
           ╠════════════════════════════════════════╣
              Nome:     %s %s                      
              Telefone: %s                          
              E-mail:   %s                          
           ╚════════════════════════════════════════╝
           """.formatted(nome, sobrenome, telefone, email);
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

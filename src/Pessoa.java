import java.util.Objects;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && cpf.equals(pessoa.cpf) && email.equals(pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

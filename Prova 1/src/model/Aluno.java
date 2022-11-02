package model;

public class Aluno {

    private Integer id;
    private Integer cpf;
    private String nome;
    private String sobrenome;
    private String email;


    //construtores
    public Aluno() {

    }

    public Aluno(Integer id, Integer cpf) {
        this.id = id;
        this.cpf = cpf;
    }

    public Aluno(Integer id, Integer cpf, String nome, String sobrenome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    //Getters

    public Integer getId() { return id; }

    public Integer getCpf() { return cpf; }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "\nAluno_Lista1 [Id=" + id + ", Cpf=" + cpf +  ", Nome=" + nome +   ", Sobrenome=" + sobrenome + ", Email=" + email +"]";
    }

}

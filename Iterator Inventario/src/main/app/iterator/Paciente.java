package main.app.iterator;

public class Paciente{
    String nome;
    int prioridade;
    public Paciente(String name, int prioridade){
        this.prioridade = prioridade;
        this.nome = name;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
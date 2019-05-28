package Questão3;

public class Aluno {
    private String nome;
    
    public Aluno(String n){
        setNome(n);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
}

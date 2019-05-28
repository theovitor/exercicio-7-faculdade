package Questão3;

public class Disciplina {
    private String nome;
    
    public Disciplina(String n){
        setNome(n);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
}

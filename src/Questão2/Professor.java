package Questão2;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public void setMatricula(int m){
        this.matricula=m;
    }
}

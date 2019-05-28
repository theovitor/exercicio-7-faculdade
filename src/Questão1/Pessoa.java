package Questão1;

public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(String n, String e, String t) {
        setNome(n);
        setEndereço(e);
        setTelefone(t);
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereço(){
        return this.endereço;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setEndereço(String e){
        this.endereço=e;
    }
    public void setTelefone(String t){
        this.telefone=t;
    }
}

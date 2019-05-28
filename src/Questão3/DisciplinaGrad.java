package Questão3;

public class DisciplinaGrad extends Disciplina{
    
    private String intituicao;
    
    public DisciplinaGrad(String n,String i) {
        super(n);
        setInstituicao(i);
    }
    public String getInstituicao(){
        return this.intituicao;
    }
    public void setInstituicao(String i){
        this.intituicao=i;
    }
}

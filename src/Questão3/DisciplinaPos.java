package Questão3;

public class DisciplinaPos extends Disciplina{
    
    private String especialidade;
    
    public DisciplinaPos(String n,String e) {
        super(n);
        setEspecialidade(e);
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade=e;
    }
}

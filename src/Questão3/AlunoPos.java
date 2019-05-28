package Questão3;

public class AlunoPos extends Aluno{
    
    private DisciplinaPos nomed;
    
    public AlunoPos(String n,DisciplinaPos m) {
        super(n);
        setNomed(m);
    }
    public DisciplinaPos getNomed(){
        return this.nomed;
    }
    public void setNomed(DisciplinaPos m){
        this.nomed=m;
    }
}

package Questão3;

public class AlunoGrad extends Aluno {
    
    private DisciplinaGrad nomed;
    
    public AlunoGrad(String n, DisciplinaGrad m) {
        super(n);
        setNomed(m);
    }
    public DisciplinaGrad getNomed(){
        return this.nomed;
    }
    public void setNomed(DisciplinaGrad m){
        this.nomed=m;
    }
}

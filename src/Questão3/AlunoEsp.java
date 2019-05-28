package Questão3;

public class AlunoEsp extends Aluno{
    
    private DisciplinaGrad nomedg;
    private DisciplinaPos nomedp;
   
    public AlunoEsp(String n,DisciplinaGrad x,DisciplinaPos m) {
        super(n);
        setNomedg(x);
        setNomedp(m);
    }
    public DisciplinaGrad getNomedg(){
        return this.nomedg;
    }
    public DisciplinaPos getNomedp(){
        return this.nomedp;
    }
    public void setNomedg(DisciplinaGrad x){
        this.nomedg=x;
    }
    public void setNomedp(DisciplinaPos m){
        this.nomedp=m;
    }
}

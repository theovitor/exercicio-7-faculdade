package Questão2;


import Questão2.Professor;

public class ProfessorHorista extends Professor{
    private double salario;
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double s){
        this.salario=s;
    }
    public double calculaSalario(int h){
        return this.getSalario()*h;
    }
}

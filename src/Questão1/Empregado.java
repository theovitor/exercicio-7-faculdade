package Questão1;


import Questão1.Pessoa;

public class Empregado extends Pessoa {
    
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String n, String e, String t,int c,double s,double i) {
        super(n, e, t);
        setCodigoSetor(c);
        setSalarioBase(s);
        setImposto(i);
    }
    public int getCodigoSetor(){
        return this.codigoSetor;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public double getImposto(){
        return this.imposto;
    }
    public void setCodigoSetor(int c){
        this.codigoSetor=c;
    }
    public void setSalarioBase(double s){
        this.salarioBase=s;
    }
    public void setImposto(double i){
        this.imposto=i;
    }
    public double calcularSalario(){
        return this.getSalarioBase()-(this.getSalarioBase()*(this.getImposto()/100));
    }
}

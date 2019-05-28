package Questão1;


import Questão1.Pessoa;

public class Fornecedor extends Pessoa{
    
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(String n, String e, String t,double c,double d) {
        super(n, e, t);
        setValorcredito(c);
        setValordivida(d);
    }
    
    public double getValorcredito(){
        return this.valorCredito;
    }
    public double getValordivida(){
        return this.valorDivida;
    }
    public void setValorcredito(double c){
        this.valorCredito=c;
    }
    public void setValordivida(double d){
        this.valorDivida=d;
    }
    public double obterSaldo(){
        return this.getValorcredito()- this.getValordivida();
    }
}
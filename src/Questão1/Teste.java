package Questão1;


import Questão1.Fornecedor;
import Questão1.Empregado;
import Questão1.Pessoa;

public class Teste {
    
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa ("Felipe", "R: 30", "(38)98754-1425");
        
        Fornecedor f1 = new Fornecedor ("Pedro","R: São Paulo","997421356",1000,500);
        
        Empregado e1 = new Empregado ("Diego","R: L","997453215",1010,1550,10);
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
    }
}


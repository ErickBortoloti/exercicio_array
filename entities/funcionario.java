package entities;

import java.util.ArrayList;

public class funcionario {
    private ArrayList<String> nomes;

    public funcionario() {
        nomes = new ArrayList<String>();
        nomes.add("Emily");
        nomes.add("Milena");
        nomes.add("Larissa");
        nomes.add("Rafael");
        nomes.add("Jessica");
    }

    public double salarioVendedor(double comissao) {
        double salario = 1500;
        if (comissao < 5000) {
            salario += comissao * 0.01;
        } else if (comissao > 5000 && comissao < 10000) {
            salario += comissao * 0.025;

        } else {
            salario += comissao * 0.05;
        }
        return salario;
    }
    public double salarioGerente(double total) {
    	double salariofixo = 3000;
    	salariofixo += total * 0.05;
    	
    	return salariofixo;
    }
    public double totaisVendas(double vendasTotais) {
    	double total = 0;
    	total += vendasTotais;
    	return total;
    }
    
  
    

}
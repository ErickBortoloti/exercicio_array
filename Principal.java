package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import entities.funcionario;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        funcionario fun = new funcionario();
        ArrayList<String> funcionarios = new ArrayList<String>(4);
        ArrayList<Double> salaries = new ArrayList<Double>(5);

        funcionarios.add("Emily");
        funcionarios.add("Milena");
        funcionarios.add("Larissa");
        funcionarios.add("Rafael");

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("Digite as vendas de " + funcionarios.get(i) + ":");
            double comissao = teclado.nextDouble();
            double salario = fun.salarioVendedor(comissao);
            double totais = fun.totaisVendas(comissao);
            salaries.add(salario);
            soma += totais;
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("Salario de " + funcionarios.get(i) + ": R$" + salaries.get(i));
        }
       
       System.out.println("Vendas totais da loja: R$" + soma);
       System.out.println("Salario total da Jéssica (gerente): R$" + fun.salarioGerente(soma));
  

    
		
	}

}

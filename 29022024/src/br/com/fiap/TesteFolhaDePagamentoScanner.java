package br.com.fiap;

import java.util.Scanner;

public class TesteFolhaDePagamentoScanner {

	public static void main(String[] args) {
		double salarioBruto, descontoINSS, valorPlanoDeSaude, salarioLiquido;
		int numeroDeDependentes;
		FolhaDePagamento folha;
		Scanner scan;
		try {
			folha = new FolhaDePagamento();
			scan = new Scanner (System.in);
			System.out.println("digite o valor do salario bruto");
			salarioBruto = scan.nextDouble();
			System.out.println("Digite a porcentagem de desconto do INSS");
			descontoINSS = scan.nextDouble();
			System.out.println("Digite o valor do plano de saude");
			valorPlanoDeSaude = scan.nextDouble();
			System.out.println("Digite o número de dependentes");
			numeroDeDependentes = scan.nextInt();
			folha.salarioBruto = salarioBruto;
			folha.descontoINSS = descontoINSS;
			folha.valorPlanoDeSaude = valorPlanoDeSaude;
			folha.numeroDeDependentes = numeroDeDependentes;
			salarioLiquido = folha.calcularSalarioLiquido();
			System.out.println("Salario liquido: " + salarioLiquido);
			}catch (Exception e) {
			System.out.println("Formato incorreto de número");
				
			}
		

	}

}

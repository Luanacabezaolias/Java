package br.com.fiap;

public class FolhaDePagamento {

	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public double calcularSalarioLiquido() {
		double inss = 0.0;
		double valorPlano = 0.0;
		inss = salarioBruto * (descontoINSS/100);
		valorPlano = valorPlanoDeSaude * (numeroDeDependentes+1);
		return (salarioBruto - inss - valorPlano);
		
	}

}

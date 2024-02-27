package Exercicio;

public class FolhaDePagamento {

	public double salarioBruto;
	public int numeroDeDependentes;
	public double descondoINSS;
	public double valorPlanoDeSaude;
	
	public void calcularSalarioLiquido(double x) {
		x = (salarioBruto - (((descondoINSS*salarioBruto) / 100) + valorPlanoDeSaude * (numeroDeDependentes + 1)));
		System.out.println("Salario Liquido " + x);

		
	}

}

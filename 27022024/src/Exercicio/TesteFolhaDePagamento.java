package Exercicio;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		FolhaDePagamento fp = new FolhaDePagamento();
		
		fp.salarioBruto = 5000;
		fp.numeroDeDependentes = 2;
		fp.descondoINSS = 10;
		fp.valorPlanoDeSaude = 50;
		
		fp.calcularSalarioLiquido(0);
		

	}

}

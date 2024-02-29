package br.com.fiap;

import javax.swing.JOptionPane;

public class TesteFolhaDePagamantoJOptionPane {

	public static void main(String[] args) {
		String aux;
		FolhaDePagamento folha;
		try {
			folha = new FolhaDePagamento();
			aux = JOptionPane.showInputDialog("Digite o valor do salario bruto");
			folha.salarioBruto = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite o desconto do INSS");
			folha.descontoINSS = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite o valor do plano de saude");
			folha.valorPlanoDeSaude  = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digitenumero de dependentes");
			folha.numeroDeDependentes = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Salario liquido: R$;"
					+ folha.calcularSalarioLiquido());

	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Formato incorreto do numero");
		}
	}

}

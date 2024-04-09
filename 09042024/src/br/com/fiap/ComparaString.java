package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {

	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha");
		// diferenciando minusculas e maiusculas
		if (senha.equals("Passw0rd")) {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso autorizado!");
		}else {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso negado!");
		}
		//sem diferenciação de minuscula e maiuscula
		if (senha.equalsIgnoreCase("Passw0rd")) {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso autorizado!");
		}else {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso negado!");
		}
	}

}

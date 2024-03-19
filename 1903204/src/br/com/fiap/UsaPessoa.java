package br.com.fiap;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Astrogildo Planetário");
		pessoa1.setAnoNascimento(1998);
		int idade = pessoa1.calculaIdade(2024);
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + idade + " anos");

	}

}

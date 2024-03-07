package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
			
		TelevisorEncapsulado televisor1 = new TelevisorEncapsulado();
			
		// televisor1.setCanal(4);
		// televisor1.setVolume(5);
		// televisor1.mostrar();
			
		// televisor1.setCanal(5);
		// televisor1.aumentarVolume();
		// televisor1.aumentarVolume();
		// televisor1.aumentarVolume();
		// televisor1.mostrar();

		int escolha = 0;
		Scanner scan;
		try {
			scan = new Scanner (System.in);
			System.out.println("Escolha um canal e defina o volume");
			televisor1.setCanal(scan.nestInt());
			televisor1.setVolume(scan.nextInt());
			System.out.println("Faça sua escolha:
					   +"\n(1) Definir Canal"
					   +"\n(2) Definir Volume"
					   +"\n(3) Aumentar volume"
					   +"\n(4) Diminuir volume");
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha novo canal");
				televisor1.setCanal(scan.nextInt());
			} else if (escolha == 2) {
				System.out.println("Escolha novo volume");
				televisor1.setVolume(scan.nextInt());
			} else if (escolha == 3) {
				System.out.println("Aumentando volume...");
				televisor1.aumentarVolume();
			} else{
				System.out.println("Diminuindo volume...");
				televisor1.diminuirVolume();	
			}	
			televisor1.mostrar();
		}catch (Exception e) {
			System.out.println(e.getMassage());
		}
		
	}

}

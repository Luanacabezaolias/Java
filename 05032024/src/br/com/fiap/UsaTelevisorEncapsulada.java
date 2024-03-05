package br.com.fiap;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
			
		TelevisorEncapsulado televisor1 = new TelevisorEncapsulado();
			
		televisor1.setCanal(4);
		televisor1.setVolume(99);
		televisor1.mostrar();
			
		televisor1.setCanal(5);
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.mostrar();
	
	}

}

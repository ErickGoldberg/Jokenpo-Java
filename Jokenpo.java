package jokenpo;
import java.util.Scanner;
public class Jokenpo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Usuario x Computador.
		// tesoura = vence papel e perde pra pedra
		// tesoura vs pedra = perde
		// Papel vs pedra = vence
		
		String usuario;
		String computador;
		int valor;
		
		computador = "";
		
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random();
		
		System.out.print("Insira sua mao: ");
		usuario = entrada.next();
		System.out.println("O computador ira iserir a 'mao': ");
		valor = gerador.nextInt(1, 3);
		
		entrada.close();
		
		switch (valor) {
		case 1:
			computador = "tesoura";
			System.out.println("O adversario(computador) escolheu tesoura!");
			break;
		case 2:
			computador = "papel";
			System.out.println("O adversario(computador) escolheu papel!");
			break;
		case 3:
			computador = "pedra";
			System.out.println("O adversario(computador) escolheu pedra");
			break;
			
				
		
		}
		if(usuario.equals("tesoura")) {
			if(computador.equals("papel")) {
				System.out.println("Voce venceu!");
			} else if (computador.equals("pedra")){ 
				System.out.println("Voce perdeu!");
		} else {
			System.out.println("Voce empatou!");
		}
	}
		if(usuario.equals("papel")) {
			if(computador.equals("pedra")) {
				System.out.println("Voce venceu!");
			} else if (computador.equals("tesoura")){ 
				System.out.println("Voce perdeu!");
		} else {
			System.out.println("Voce empatou!");
		}
	}
		
		if(usuario.equals("pedra")) {
			if(computador.equals("tesoura")) {
				System.out.println("Voce venceu!");
			} else if (computador.equals("papel")){ 
				System.out.println("Voce perdeu!");
		} else {
			System.out.println("Voce empatou!");
		}
	}
}
}

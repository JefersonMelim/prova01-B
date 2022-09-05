package ifsc;

import java.util.Scanner;

public class ProvaBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vamos verificar qual o menor e qual o maior numero em uma lista informada por voce!");
		System.out.println("-------------------\n");
		
		Integer numeros[];
		Integer teste[];
		
		Scanner entrada = new Scanner(System.in);
				
		for (int i = 0; i < 6; i++) {
			System.out.printf("Valor " + i+1 + ": ");
			
			numeros[i] = entrada.nextLine();
			teste[i] = Integer.valueOf();
		}
		
		entrada.close();
		
		//VerificaLimiteNumerico();
	}
	
	public static Integer VerificaLimiteNumerico(Integer numeros[]) {
		// Vetor criado para armazenar somente o maior e o menor numero digitado
		Integer limites [] = null;		
		
		// Verificando, elemento por elemento, se o mesmo eh o maior ou o menor numero
		for(int i = 0; i < 6; i++) {
			if (numeros[i] < limites[0] || limites[0] == null) {
				limites[0] = numeros[i];
			}
			else if(numeros[i] > limites[0] || limites[1] == null) {
				limites[1] = numeros[i];
			}
		}
		
		return limites[0], limites[1];
	}

}

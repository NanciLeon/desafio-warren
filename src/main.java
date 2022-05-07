
public class main {

	public static void main(String[] args) {
		/* Exercicio 2
		 
		int numeroDeAlunos = 5;
		int[] chegadasDeAlunos = new int[numeroDeAlunos];
		int alunosPresentesParaTerAula = 3;
		
		chegadasDeAlunos[0] = -2;
		chegadasDeAlunos[1] = -1;
		chegadasDeAlunos[2] = 0;
		chegadasDeAlunos[3] = 1;
		chegadasDeAlunos[4] = 2;
		
		System.out.println(exercicio2(chegadasDeAlunos, alunosPresentesParaTerAula));
		*/
	}
	
	public static void exercicio1(int limite) {
		for (int i = 11; i <= limite; i++) {
			if (i % 10 == 0) {
				continue;
			}
			int numero = i;
			int reverso = inverterNumero(numero);
	
			int soma = numero + reverso;
			
			if(verificaSeTodosOsDigitosSaoImpares(soma)) {
				System.out.println(numero);
			}
		}
	}
	
	
	public static int inverterNumero(int numero) {
		int numeroAux = numero, reverso = 0;
		while (numeroAux != 0) {
			int resto = numeroAux % 10;
			reverso = reverso * 10 + resto;
			numeroAux = numeroAux / 10;
		}
		return reverso;
	}
	
	public static boolean verificaSeTodosOsDigitosSaoImpares(int numero) {
		String numeroEmString = Integer.toString(numero);
		
		boolean tudoImpar = true;
		
		for(int j = 0; j < numeroEmString.length(); j++) {
			int digito = Character.getNumericValue(numeroEmString.charAt(j));
			
			if (digito % 2 == 0) {
				tudoImpar = false;
			}
		}
		return tudoImpar;
	}
	
	public static String exercicio2(int[] chegadasDeAlunos, int alunosPresentesParaTerAula) {
		int alunosPontuais = 0;
		for (int i = 0; i < chegadasDeAlunos.length; i++) {
			
			int chegadaDoAluno = chegadasDeAlunos[i];
			if(chegadaDoAluno <= 0) {
				alunosPontuais++;
			}	
		}
		
		boolean vaiTerAula = alunosPontuais >= alunosPresentesParaTerAula;
		
		if(vaiTerAula) {
			return "Aula normal";
		} else {
			return "Aula cancelada";
		}
	}
}























































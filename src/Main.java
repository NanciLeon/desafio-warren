import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int numero = 10;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		ArrayList<Integer> soma = exercicio3(numeros, numero);
		
		System.out.println(soma);
	}

	public static int exercicio1(int limite) {
		int numerosReversiveis = 0;
		for (int i = 11; i <= limite; i++) {
			if (i % 10 == 0) {
				continue;
			}
			int numero = i;
			int reverso = inverterNumero(numero);

			int soma = numero + reverso;

			if (verificaSeTodosOsDigitosSaoImpares(soma)) {
				numerosReversiveis++;
				System.out.println(numero);
			}
		}
		return numerosReversiveis;
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

		for (int j = 0; j < numeroEmString.length(); j++) {
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
			if (chegadaDoAluno <= 0) {
				alunosPontuais++;
			}
		}

		boolean vaiTerAula = alunosPontuais >= alunosPresentesParaTerAula;

		if (vaiTerAula) {
			return "Aula normal";
		} else {
			return "Aula cancelada";
		}
	}
	
	public static ArrayList<Integer> exercicio3(ArrayList<Integer> numeros, int numero) {
		ArrayList<ArrayList<Integer>> somasPossiveis = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> soma = new ArrayList<Integer>();
		int qtdDeNumeros = numeros.size();
		
		for (int i = 0; i < qtdDeNumeros; i++) {
			if(numeros.size() == 0) {
				break;
			}
			Integer maiorNumero = numeros.get(0);
			
			for (int j = 1; j < numeros.size(); j++) {
				if (numeros.get(j) > maiorNumero) {
					maiorNumero = numeros.get(j);
				}
			}
			
			colocaValoresNaLista(soma, numero, maiorNumero);
			
			if(somarValoresDaLista(soma) < numero) {
				numeros.remove(maiorNumero);
			}
		}
		return soma;
	}
	
	public static void colocaValoresNaLista(ArrayList<Integer> numeros, int numero, int numeroResta) {
		int numeroAux = numero;
		while (numero > 0) {
			if(somarValoresDaLista(numeros) + numeroResta > numeroAux) {
				break;
			}
			numero -= numeroResta;
			if (numero >= 0) {
				numeros.add(numeroResta);
			}
		}
	}
	
	public static int somarValoresDaLista(ArrayList<Integer> numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);
		}
		return soma;
	}
}

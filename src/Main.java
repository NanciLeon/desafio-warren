import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

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
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int inverterNumero(int numero) {
		int numeroAux = numero, reverso = 0;
		while (numeroAux != 0) {
			// pega o ultimo digito do numeroAux
			int resto = numeroAux % 10;
			/**
			 * multiplica por 10 para "criar" um novo digito e poder
			 * juntar com o resto
			 */
			reverso = reverso * 10 + resto;
			// remove o ultimo digito
			numeroAux = numeroAux / 10;
		}
		return reverso;
	}
	
	/*
	 * @return retorna se todos os digitos daquele numero sao impares
	 */
	public static boolean verificaSeTodosOsDigitosSaoImpares(int numero) {
		// converte numero em string para poder pegar os caracteres no for
		String numeroEmString = Integer.toString(numero);

		boolean tudoImpar = true;

		for (int i = 0; i < numeroEmString.length(); i++) {
			// converte caracter da string em int
			int digito = Character.getNumericValue(numeroEmString.charAt(i));

			if (digito % 2 == 0) {
				tudoImpar = false;
			}
		}
		return tudoImpar;
	}
	
	public static String exercicio2(int[] chegadasDeAlunos, int alunosPresentesParaTerAula) {
		int alunosPontuais = 0;
		/*
		 * pega os alunos pontuais
		 */
		for (int i = 0; i < chegadasDeAlunos.length; i++) {
			if (chegadasDeAlunos[i] <= 0) {
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
		
		/*
		 * mantem tamanho original da lista, porque no for abaixo
		 * o tamanho vai diminuindo
		 */
		int qtdDeNumeros = numeros.size();
		
		for (int i = 0; i < qtdDeNumeros; i++) {
			if(numeros.size() == 0) {
				break;
			}
			Integer maiorNumero = numeros.get(0);
			
			/*
			 * pega o maior numero da lista
			 */
			for (int j = 1; j < numeros.size(); j++) {
				if (numeros.get(j) > maiorNumero) {
					maiorNumero = numeros.get(j);
				}
			}
			
			colocaValoresNaLista(soma, numero, maiorNumero);
			
			if(somarValoresDaLista(soma) < numero) {
				/*
				 * remove para buscar o proximo maior
				 */
				numeros.remove(maiorNumero);
			}
		}
		return soma;
	}
	
	public static void colocaValoresNaLista(ArrayList<Integer> numeros, int numero, int numeroResta) {
		int limite = numero;
		while (numero > 0) {
			/*
			 * verifica para ver se pode adicionar o numeroResta
			 */
			if(somarValoresDaLista(numeros) + numeroResta > limite) {
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

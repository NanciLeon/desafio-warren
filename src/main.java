
public class main {

	public static void main(String[] args) {
		exercicio1(999);
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

}























































import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Exercicio3TestTest {

	@Test
	void deveRetornarListaEsperada() {
		int numero = 10;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		ArrayList<Integer> resultado = Main.exercicio3(numeros, numero);
		
		ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
		listaEsperada.add(4);
		listaEsperada.add(4);
		listaEsperada.add(2);
		
		assertEquals(listaEsperada, resultado);
	}

}

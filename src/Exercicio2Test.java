import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercicio2Test {

	@Test
	void exercicio2DeveRetornarAulaNormal() {
		int[] chegadasDeAlunos = new int[5];
		int alunosPresentesParaTerAula = 3;
		
		chegadasDeAlunos[0] = -2;
		chegadasDeAlunos[1] = -1;
		chegadasDeAlunos[2] = 0;
		chegadasDeAlunos[3] = 1;
		chegadasDeAlunos[4] = 2;
		
		assertEquals("Aula normal", Main.exercicio2(chegadasDeAlunos, alunosPresentesParaTerAula));
	}
	
	@Test
	void exercicio2DeveRetornarAulaCancelada() {
		int[] chegadasDeAlunos = new int[5];
		int alunosPresentesParaTerAula = 3;
		
		chegadasDeAlunos[0] = -2;
		chegadasDeAlunos[1] = -1;
		chegadasDeAlunos[2] = 1;
		chegadasDeAlunos[3] = 1;
		chegadasDeAlunos[4] = 2;
		
		assertEquals("Aula cancelada", Main.exercicio2(chegadasDeAlunos, alunosPresentesParaTerAula));
	}

}

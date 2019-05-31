package biblioteca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmprestimoTeste {
	Emprestimo emprestimo;
	static ArrayList<Aluno> aluno;
	static ArrayList<Obra> obra;
	
	
	@Before
	public void setUp() throws Exception {
		emprestimo = new Emprestimo();
		aluno = Biblioteca.listaAlunos();
		obra = Biblioteca.listaObras();
	}	

	@After
	public void tearDown() throws Exception {
		emprestimo = null;
	}
	
	
	/*
	 *  Esse é para dar certo | Cor verde
	 */
	
	@Test
	public void testeCaso1Emprestimo() {
		
		emprestimo.setObra(obra.get(0));
		emprestimo.setDiasLivro(14);
		
		emprestimo.setAluno(aluno.get(0));
		emprestimo.setContRenovação(0);
		
		assertEquals(emprestimo.getObra().nome, "Banco de Dados");
		assertTrue(emprestimo.getDiasLivro() == 14);
		assertEquals(emprestimo.getAluno().nome, "José Alves");
		assertTrue(emprestimo.verificador);
	}
	
	
	
	/*
	 *  Esse é para dar errado | Cor vermelha
	 */
	
	@Test
	public void testeCaso2Emprestimo() {
		
		emprestimo.setObra(obra.get(0));
		emprestimo.setDiasLivro(14);

		emprestimo.setAluno(aluno.get(1));
		emprestimo.setContRenovação(0);
		
		assertEquals(emprestimo.getObra().nome, "Banco de Dados");
		assertTrue(emprestimo.getDiasLivro() == 14);
		assertEquals(emprestimo.getAluno().nome, "José Alves");
		assertTrue(emprestimo.verificador);
	}
	
	
	/*
	 *  Esse é para dar errado | Cor vermrelha
	 */
	
	@Test
	public void testeCaso3Emprestimo() {
		emprestimo.setObra(obra.get(1));
		emprestimo.setDiasOutros(14);
		emprestimo.setAluno(aluno.get(2));
		emprestimo.setContRenovação(1);
		
		assertEquals(emprestimo.getObra().nome, "Nárnia");
		assertTrue(emprestimo.getDiasOutros() == 14);
		assertEquals(emprestimo.getAluno().nome, "Maria");
		assertTrue(emprestimo.verificador);
	}
	
	
	
	/*
	 *  Esse é para dar errado | Cor vermelha
	 */
	
	@Test
	public void testeCaso4Emprestimo() {
		emprestimo.setObra(obra.get(1));
		emprestimo.setDiasOutros(3);
		emprestimo.setAluno(aluno.get(2));
		emprestimo.setContRenovação(4);
		
		assertEquals(emprestimo.getObra().nome, "Nárnia");
		assertTrue(emprestimo.getDiasOutros() == 3);
		assertEquals(emprestimo.getAluno().nome, "Maria");
		assertTrue(emprestimo.verificador);
	}

	
	/*
	 *  Esse é para dar errado | Cor verde
	 */
	
	@Test
	public void testeCaso5Emprestimo() {
		emprestimo.setObra(obra.get(0));
		emprestimo.setDiasLivro(14);
		emprestimo.setAluno(aluno.get(0));
		emprestimo.setContRenovação(4);
		
		assertEquals(emprestimo.getObra().nome, "Banco de Dados");
		assertTrue(emprestimo.getDiasLivro() == 14);
		assertEquals(emprestimo.getAluno().nome, "José Alves");
		assertFalse(emprestimo.verificador);
	}
	
	
}

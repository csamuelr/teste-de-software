package biblioteca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmprestimoTeste {
	
	Emprestimo emprestimo;
	
	@Before
	public void setUp() throws Exception {
		emprestimo = new Emprestimo();
	}	

	@After
	public void tearDown() throws Exception {
		emprestimo = null;
	}
	
	@Test
	public void testeCaso1Emprestimo() {
		
//		String obra;
//		String aluno;
//		Integer diasLivro = 0;
//		Integer diasOutros = 0;
//		Integer contRenovação = 0;
//		boolean status;
		
		emprestimo.setObra("Banco de Dados");
		emprestimo.setDiasLivro(14);
		emprestimo.setAluno("José Alves");
		emprestimo.setContRenovação(0);
		
		assertEquals(emprestimo.getObra(), "Banco de Dados");
		assertTrue(emprestimo.getDiasLivro() == 14);
		assertEquals(emprestimo.getAluno(), "José Alves");
		assertEquals(emprestimo.status, true);
	}
	
	@Test
	public void testeCaso2Emprestimo() {
		emprestimo.setObra("Folheto Casas");
		emprestimo.setDiasOutros(14);
		emprestimo.setAluno("Francisca Joana");
		emprestimo.setContRenovação(1);
		
		assertEquals(emprestimo.getObra(), "Folheto Casas");
		assertTrue(emprestimo.getDiasOutros() == 5);
		assertEquals(emprestimo.getAluno(), "Francisca Joana");
		assertEquals(emprestimo.status, true);
	}
	
	@Test
	public void testeCaso3Emprestimo() {
		emprestimo.setObra("Dom Casmurro");
		emprestimo.setDiasLivro(3);
		emprestimo.setAluno("Joana");
		emprestimo.setContRenovação(4);
		
		assertEquals(emprestimo.getObra(), "Dom Casmurro");
		assertTrue(emprestimo.getDiasLivro() == 14);
		assertEquals(emprestimo.getAluno(), "Joana");
		assertEquals(emprestimo.status, true);
	}
	
	@Test
	public void testeCaso4Emprestimo() {
		emprestimo.setObra("Folheto Casas");
		emprestimo.setDiasOutros(-3);
		emprestimo.setAluno("Lucas");
		emprestimo.setContRenovação(1);
		
		assertEquals(emprestimo.getObra(), "Folheto Casas");
		assertTrue(emprestimo.getDiasOutros() == 5);
		assertEquals(emprestimo.getAluno(), "Lucas");
		assertEquals(emprestimo.status, true);
	}
	
	
}

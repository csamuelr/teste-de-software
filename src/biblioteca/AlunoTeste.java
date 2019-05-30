package biblioteca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlunoTeste {
	
	Aluno aluno;
	
	@Before
	public void setUp() throws Exception {
		aluno = new Aluno();
	}

	@After
	public void tearDown() throws Exception {
		aluno = null;
	}
	
	@Test
	public void testeCaso1Aluno() {
		aluno.setNome("Maria Costa");
		aluno.setMatricula("101022");
		aluno.setStatus(0);
		aluno.setEmprestimoLivro(2);
		aluno.setEmprestimoOutro(3);
		
		assertEquals(aluno.getNome(), "Maria Costa");
		assertEquals(aluno.getMatricula(), "101022");
		assertTrue((aluno.getStatus() == 0 || aluno.getStatus() == 1));
		assertTrue(aluno.getEmprestimoLivro() >= 0 || aluno.getEmprestimoLivro() <=7);
		assertTrue(aluno.getEmprestimoOutro() >= 0 || aluno.getEmprestimoOutro() <=5);
	}
	
	@Test
	public void testeCaso2Aluno() {
		aluno.setNome("João");
		aluno.setMatricula("2016778");
		aluno.setStatus(0);
		aluno.setEmprestimoLivro(7);
		aluno.setEmprestimoOutro(6);
		
		assertEquals(aluno.getNome(), "João");
		assertEquals(aluno.getMatricula(), "2016778");
		assertTrue((aluno.getStatus() == 0 || aluno.getStatus() == 1));
		assertTrue(aluno.getEmprestimoLivro() >= 0 || aluno.getEmprestimoLivro() <=7);
		assertTrue(aluno.getEmprestimoOutro() >= 0 || aluno.getEmprestimoOutro() <=5);
	}
	
	@Test
	public void testeCaso3Aluno() {
		aluno.setNome("João");
		aluno.setMatricula("2016778");
		aluno.setStatus(3);
		aluno.setEmprestimoLivro(8);
		aluno.setEmprestimoOutro(3);
		
		assertEquals(aluno.getNome(), "João");
		assertEquals(aluno.getMatricula(), "2016778");
		assertTrue((aluno.getStatus() == 0 || aluno.getStatus() == 1));
		assertTrue(aluno.getEmprestimoLivro() >= 0 || aluno.getEmprestimoLivro() <=7);
		assertTrue(aluno.getEmprestimoOutro() >= 0 || aluno.getEmprestimoOutro() <=5);
	}
	
	@Test
	public void testeCaso4Aluno() {
		aluno.setNome("Maria");
		aluno.setMatricula("2012246");
		aluno.setStatus(1);
		aluno.setEmprestimoLivro(0);
		aluno.setEmprestimoOutro(5);
		
		assertEquals(aluno.getNome(), "Maria");
		assertEquals(aluno.getMatricula(), "2012246");
		assertTrue((aluno.getStatus() == 0 || aluno.getStatus() == 1));
		assertTrue(aluno.getEmprestimoLivro() >= 0 || aluno.getEmprestimoLivro() <=7);
		assertTrue(aluno.getEmprestimoOutro() >= 0 || aluno.getEmprestimoOutro() <=5);
	}
}

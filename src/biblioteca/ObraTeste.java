package biblioteca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ObraTeste {

	Obra obra;
	
	@Before
	public void setUp() throws Exception {
		obra = new Obra();
	}

	@After
	public void tearDown() throws Exception {
		obra = null;
	}
	
	@Test
	public void testeCaso1Obra() {
		obra.setNome("O Cortiço");
		obra.setCategoria(1);		
		assertEquals(obra.getNome(), "O Cortiço");
		assertFalse(obra.getCategoria() == null);
	}
	
	@Test
	public void testeCaso2Obra() {
		obra.setNome("Folheto Casas");
		obra.setCategoria(8);		
		assertEquals(obra.getNome(), "Folheto Casas");
		assertFalse(obra.getCategoria() == null);
	}
	
	@Test
	public void testeCaso3Obra() {
		obra.setNome("Narnia");
		obra.setCategoria(4);		
		assertEquals(obra.getNome(), "Narnia");
		assertFalse(obra.getCategoria() == null);
	}
	
	@Test
	public void testeCaso4Obra() {
		obra.setNome("PMBOOK");
		obra.setCategoria(0);		
		assertEquals(obra.getNome(), "PMBOOK");
		assertFalse(obra.getCategoria() == null);
	}
	
	/*
	 *  Esse é para dar errado | Cor verde
	 */
	
	@Test
	public void testeCaso5Obra() {
		obra.setNome("PMBOOK");
		obra.setCategoria(7);		
		assertEquals(obra.getNome(), "PMBOOK");
		assertTrue(obra.getCategoria() == null);
	}
	
	
	
	
	
}

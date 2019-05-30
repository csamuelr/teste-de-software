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
		obra.setCategoria(3);		
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
		obra.setCategoria71);		
		assertEquals(obra.getNome(), "PMBOOK");
		assertFalse(obra.getCategoria() == null);
	}
	
	
}

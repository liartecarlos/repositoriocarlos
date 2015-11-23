import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MayorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		new Mayor();	
		
	}
	
	@Test
	public void testSimple() {
		
		System.out.println("Test Simple");
		int[] lista = new int[] {3,7,9,8};
		assertEquals(9, Mayor.mayor(lista));	
	}
	
	@Test
	public void testOrdenado() {
		
		System.out.println("Test ordenado");
		int[] lista = new int[] {7,9,8,3};
		assertEquals(9, Mayor.mayor(lista));	
	}
	
	@Test
	public void testDuplicado() {
		
		System.out.println("Test duplicado");
		int[] lista = new int[] {7,9,7,9};
		assertEquals(9, Mayor.mayor(lista));	
	}
	
	@Test
	public void testUnicoValor() {
		
		System.out.println("Test Unico valor");
		int[] lista = new int[] {7};
		assertEquals(7, Mayor.mayor(lista));	
	}
	
	@Test
	public void testnegativos() {
		
		System.out.println("Test valores negativos");
		int[] lista = new int[] {-4,-6,-7,-22};
		assertEquals(-4, Mayor.mayor(lista));	
	}
	
	@Test
	public void testValorNull() {
		
		System.out.println("Test ningun valor");
		int[] lista = new int[] {};
		assertEquals(0, Mayor.mayor(lista));	
	}
	
	

}

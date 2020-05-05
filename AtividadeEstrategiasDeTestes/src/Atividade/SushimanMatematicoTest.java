package Atividade;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

    @Test
	public void testEhPrimo() { // Implementar + testes
        // assert statements
        assertTrue(SushimanMatematico.ehPrimo(7));
        assertTrue(SushimanMatematico.ehPrimo(11));
        assertTrue(SushimanMatematico.ehPrimo(71));
        assertTrue(SushimanMatematico.ehPrimo(233));
        assertFalse(SushimanMatematico.ehPrimo(12));		
	}

    @Test
	public void testGetPrimos() {
    	//Primos entre 0 e 9 - limite mínimo
    	List<Integer> expected = Arrays.asList(new Integer[] {2,3,5,7});    	
    	assertEquals(expected, SushimanMatematico.getPrimos(0));
		
    	//Primos entre 10 e 19
    	expected = Arrays.asList(new Integer[] {11,13,17,19});
		assertEquals(expected, SushimanMatematico.getPrimos(1));
		
		//Condição onde não exitem primos deve retornar uma lista vazia
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, (SushimanMatematico.getPrimos(-1)));
		
		//Primos entre 1000 e 1009
		expected = Arrays.asList(new Integer[] {1009});
		assertEquals(expected, SushimanMatematico.getPrimos(100));
		
		//Primos entre 99999990 e 99999999
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, SushimanMatematico.getPrimos(9999999));
		
		//Primos entre 999999990 e 999999999 
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, SushimanMatematico.getPrimos(99999999));
	}
    
    /*@Test
	public void testGetSuperPrimos() {
		fail("Not yet implemented");
	}*/
}

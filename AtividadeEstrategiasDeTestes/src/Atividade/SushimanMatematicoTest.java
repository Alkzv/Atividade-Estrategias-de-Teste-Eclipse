package Atividade;
import org.junit.Test;

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

    /*@Test -  Ainda não foram implementados 
	public void testGetPrimos() {
		fail("Not yet implemented");  
	}
    
    @Test
	public void testGetSuperPrimos() {
		fail("Not yet implemented");
	} //  Ainda não foram implementados 
*/
}

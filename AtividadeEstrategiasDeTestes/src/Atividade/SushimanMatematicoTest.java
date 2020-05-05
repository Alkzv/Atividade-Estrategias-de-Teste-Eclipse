package Atividade;

import java.util.ArrayList;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

	@Test
	public void testEhPrimo() {

		Assert.assertTrue(SushimanMatematico.ehPrimo(2));
		Assert.assertTrue(SushimanMatematico.ehPrimo(229));
		Assert.assertTrue(SushimanMatematico.ehPrimo(7));
		Assert.assertTrue(SushimanMatematico.ehPrimo(11));
		Assert.assertTrue(SushimanMatematico.ehPrimo(71));
		Assert.assertTrue(SushimanMatematico.ehPrimo(999983));
		Assert.assertTrue(SushimanMatematico.ehPrimo(7919));
		Assert.assertTrue(SushimanMatematico.ehPrimo(449));
		Assert.assertTrue(SushimanMatematico.ehPrimo(233));
		Assert.assertTrue(SushimanMatematico.ehPrimo(193));
		Assert.assertFalse(SushimanMatematico.ehPrimo(12));
		Assert.assertFalse(SushimanMatematico.ehPrimo(0));
		Assert.assertFalse(SushimanMatematico.ehPrimo(1));
		Assert.assertFalse(SushimanMatematico.ehPrimo(-1));
		Assert.assertFalse(SushimanMatematico.ehPrimo(-233));
		Assert.assertFalse(SushimanMatematico.ehPrimo(734));
		Assert.assertFalse(SushimanMatematico.ehPrimo(999984));
		Assert.assertFalse(SushimanMatematico.ehPrimo(-999984));
		Assert.assertFalse(SushimanMatematico.ehPrimo(-999983));
		Assert.assertFalse(SushimanMatematico.ehPrimo(-2));
	}

	@Test
	public void testGetPrimos() {

		// Primos entre 0 e 9 - limite mínimo
		List<Integer> expected = Arrays.asList(new Integer[] { 2, 3, 5, 7 });
		assertEquals(expected, SushimanMatematico.getPrimos(0));

		// Primos entre 10 e 19
		expected = Arrays.asList(new Integer[] { 11, 13, 17, 19 });
		assertEquals(expected, SushimanMatematico.getPrimos(1));

		// Condição onde nao exitem primos deve retornar uma lista vazia
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, (SushimanMatematico.getPrimos(-1)));

		// Primos entre 1000 e 1009
		expected = Arrays.asList(new Integer[] { 1009 });
		assertEquals(expected, SushimanMatematico.getPrimos(100));

		// Primos entre 99999990 e 99999999
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, SushimanMatematico.getPrimos(9999999));

		// Primos entre 999999990 e 999999999
		expected = Arrays.asList(new Integer[] {});
		assertEquals(expected, SushimanMatematico.getPrimos(99999999));
	}

	@Test
	public void testGetSuperPrimos() {

		ArrayList<Integer> listaResultadosTeste = new ArrayList<Integer>();

		listaResultadosTeste.add(2);
		listaResultadosTeste.add(3);
		listaResultadosTeste.add(5);
		listaResultadosTeste.add(7);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(1)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(23);
		listaResultadosTeste.add(29);
		listaResultadosTeste.add(31);
		listaResultadosTeste.add(37);
		listaResultadosTeste.add(53);
		listaResultadosTeste.add(59);
		listaResultadosTeste.add(71);
		listaResultadosTeste.add(73);
		listaResultadosTeste.add(79);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(2)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(233);
		listaResultadosTeste.add(239);
		listaResultadosTeste.add(293);
		listaResultadosTeste.add(311);
		listaResultadosTeste.add(313);
		listaResultadosTeste.add(317);
		listaResultadosTeste.add(373);
		listaResultadosTeste.add(379);
		listaResultadosTeste.add(593);
		listaResultadosTeste.add(599);
		listaResultadosTeste.add(719);
		listaResultadosTeste.add(733);
		listaResultadosTeste.add(739);
		listaResultadosTeste.add(797);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(3)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(2333);
		listaResultadosTeste.add(2339);
		listaResultadosTeste.add(2393);
		listaResultadosTeste.add(2399);
		listaResultadosTeste.add(2939);
		listaResultadosTeste.add(3119);
		listaResultadosTeste.add(3137);
		listaResultadosTeste.add(3733);
		listaResultadosTeste.add(3739);
		listaResultadosTeste.add(3793);
		listaResultadosTeste.add(3797);
		listaResultadosTeste.add(5939);
		listaResultadosTeste.add(7193);
		listaResultadosTeste.add(7331);
		listaResultadosTeste.add(7333);
		listaResultadosTeste.add(7393);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(4)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(23333);
		listaResultadosTeste.add(23339);
		listaResultadosTeste.add(23399);
		listaResultadosTeste.add(23993);
		listaResultadosTeste.add(29399);
		listaResultadosTeste.add(31193);
		listaResultadosTeste.add(31379);
		listaResultadosTeste.add(37337);
		listaResultadosTeste.add(37339);
		listaResultadosTeste.add(37397);
		listaResultadosTeste.add(59393);
		listaResultadosTeste.add(59399);
		listaResultadosTeste.add(71933);
		listaResultadosTeste.add(73331);
		listaResultadosTeste.add(73939);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(5)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.clear();
		listaResultadosTeste.add(233993);
		listaResultadosTeste.add(239933);
		listaResultadosTeste.add(293999);
		listaResultadosTeste.add(373379);
		listaResultadosTeste.add(373393);
		listaResultadosTeste.add(593933);
		listaResultadosTeste.add(593993);
		listaResultadosTeste.add(719333);
		listaResultadosTeste.add(739391);
		listaResultadosTeste.add(739393);
		listaResultadosTeste.add(739397);
		listaResultadosTeste.add(739399);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(6)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(2339933);
		listaResultadosTeste.add(2399333);
		listaResultadosTeste.add(2939999);
		listaResultadosTeste.add(3733799);
		listaResultadosTeste.add(5939333);
		listaResultadosTeste.add(7393913);
		listaResultadosTeste.add(7393931);
		listaResultadosTeste.add(7393933);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(7)); // Test passed

		listaResultadosTeste.clear();

		listaResultadosTeste.add(23399339);
		listaResultadosTeste.add(29399999);
		listaResultadosTeste.add(37337999);
		listaResultadosTeste.add(59393339);
		listaResultadosTeste.add(73939133);

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(8)); // Test passed

		listaResultadosTeste.clear();

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(9)); // Test passed

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(10)); // Test passed

		// Testes falhados que teriam que retornar o mesmo valor que com as entradas >=9 no método. Assim, como os 2 testes anteriores.
		
		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(0)); 

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(-1)); 

		Assert.assertEquals(listaResultadosTeste, SushimanMatematico.getSuperPrimos(-8)); 

	}

}

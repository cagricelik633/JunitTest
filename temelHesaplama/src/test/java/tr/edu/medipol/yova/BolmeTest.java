package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testBolme() {
		// GIVEN
		int sayi1 = 100;
		int sayi2 = 5;
		
		// WHEN
		int gercekSonuc = Bolme.islemYap(sayi1, sayi2);
		
		// THEN
		assertEquals(20, gercekSonuc);
	}
}

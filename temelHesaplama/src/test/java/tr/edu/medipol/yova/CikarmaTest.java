package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testCikarma() {
		// GIVEN
		int sayi1 = -99;
		int sayi2 = 100;
		
		// WHEN
		int gercekSonuc = Cikarma.islemYap(sayi1, sayi2);
		
		// THEN
		assertEquals(-199, gercekSonuc);
	}
}

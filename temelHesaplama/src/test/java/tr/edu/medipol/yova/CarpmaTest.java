package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testCarpma() {
		// GIVEN
		int sayi1 = 20;
		int sayi2 = 100;
		
		// WHEN
		int gercekSonuc = Carpma.islemYap(sayi1, sayi2);
		
		// THEN
		assertEquals(2000, gercekSonuc);
	}

}

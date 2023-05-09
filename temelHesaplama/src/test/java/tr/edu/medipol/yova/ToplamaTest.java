package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testTopla() {
		// GIVEN
		int sayi1 = -99;
		int sayi2 = 100;
		
		// WHEN
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		
		// THEN
		assertEquals(1, gercekSonuc);
	}
	
	

}

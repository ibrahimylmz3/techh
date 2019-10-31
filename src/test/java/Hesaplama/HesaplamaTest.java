package Hesaplama;

import org.junit.*;

public class HesaplamaTest {

	@Test
	public void testTopla() {
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		
		Assert.assertEquals("142.80", sonuc);
	}
	
	@Test
	public void testHataliTopla() {
		String sayi1 = "100.50x";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("undefined", sonuc);
	}
	
	@Test
	public void testToplaTamSayilari() {
		String sayi1 = "100";
		String sayi2 = "42";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142", sonuc);
	}
	
	@Test
	public void testToplaOndalikSayilari() {
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142.80", sonuc);
	}


}

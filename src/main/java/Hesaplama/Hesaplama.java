package Hesaplama;

import java.util.*;
import java.math.*;

public class Hesaplama {
		
	public static String topla(String sayi1, String sayi2) {
		try {
			return new BigDecimal(sayi1)
					.add(new BigDecimal(sayi2))
					.toPlainString();
		} catch(Exception e) {
			return "undefined";
		}
	}
	public static void main(String[] args) {
		
		Scanner konsolOku = new Scanner(System.in);
		System.out.printf("Sayi 1 girin: ");
		String sayi1 = konsolOku.nextLine();
		System.out.printf("Sayi 2 girin: ");
		String sayi2 = konsolOku.nextLine();
		
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		
		System.out.printf("%s + %s = %s", sayi1, sayi2, sonuc);
		
	}	

}

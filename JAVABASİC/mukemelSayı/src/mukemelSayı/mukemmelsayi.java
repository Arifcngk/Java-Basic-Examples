package mukemelSayı;

import java.util.Iterator;
import java.util.Scanner;

public class mukemmelsayi {

	public static void main(String[] args) {
		for (int j = 1; j < 100; j++) {
			int sayi = j;
			int toplam = 0;
			for (int i = 1; i < sayi; i++) {
				if (sayi % i == 0) {
					toplam+= i;
				}
			}
			
			if (sayi == toplam) {
				System.out.println(sayi + " bir mükemmel sayıdır !");
			}
		}
	
	}
}

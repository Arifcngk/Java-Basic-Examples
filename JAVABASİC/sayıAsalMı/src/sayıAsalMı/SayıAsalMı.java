package sayıAsalMı;
import java.util.Iterator;
import java.util.Scanner;


public class SayıAsalMı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Girilen Sayının Asallığını kontrol eden Prog.
		Scanner dgrScanner=new Scanner(System.in);
		System.out.println("Lütfen!Bir Sayı Giriniz:");
		int sayi=dgrScanner.nextInt();
		boolean sonuc=true;
	 for (int i = 2; i < sayi ; i++) {
		if (sayi%i==0) {
			sonuc=false; 
			
		}
	}
	 if (sonuc) {
			System.out.println("asal");
			
		}
		else {
			System.out.println("false");
		}	
		

	}

}

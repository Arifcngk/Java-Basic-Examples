package metindekiKelimeSayısı;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//metinde ki kelimeleri bulma
		int syc=0;
		Scanner cmlScanner=new Scanner(System.in);
		System.out.println("Cümle Giriniz:");
		String cümleString= cmlScanner.nextLine();
		for (int i = 0; i<cümleString.length(); i++) {
			if (cümleString.charAt(i)==' ') {
				syc++;
				
			}
		}
		System.out.println("Cümlede ki Kelime Sayıs: "+(syc+1));
	}

}

package kalın_ince_harf;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner harfScanner=new Scanner(System.in);
        
    int döngü=10;
    döngü++;
   do {
	   System.out.print("Lütfen Bir harf Giriniz:");
	    char harf = harfScanner.next().charAt(0);
	    switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf: "+harf);
			break;	
		}
	    switch (harf) {
	    case 'E':
	    case 'Ö':
		case 'Ü':
		case 'İ':
			System.out.println("İnce Sesli Harf:"+harf);
		break;

		default:
			System.out.println("Ünsüz Harf!!!!");
			break;
		}
	    System.out.println("------------------------------");
} while (döngü!=0);
     
	}

}

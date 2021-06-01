package cetvrtiProjekat;

import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 6547 = 18
		
		int zbir = 0;
		int cifra;
		
		boolean nasaoPeticu = false;
		
		do {
			cifra = n % 10;
			
			if(cifra != 5) {
				nasaoPeticu = true;
				System.out.println("Nedozvoljena cifra!");
				break;
			}
			
			zbir = zbir + cifra;
			n = n / 10;
		} while (n != 0);
		
		
		if(!nasaoPeticu) {
			System.out.println("Zbir cifara je: " + zbir);
		}
	}
}

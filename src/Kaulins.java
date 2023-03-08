import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	public static void main(String[] args){
		int skaitlis, reizes;
		Random rand = new Random();
		Scanner scan = new Scannner(System.in);
		System.out.println("Cik reizes metîsi kauliòu?");
		
		skaitlis = rand.nextInt();
		for(int i=1; i<=reizes; i++){
		System.out.println("Uzkrita skaitlis: "+skaitlis);

		}
		scan.close();
	}
	
		
}


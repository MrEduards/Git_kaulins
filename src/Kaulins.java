import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	public static void main(String[] args){
		int skaitlis, lielakais = 0, reizes =1;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes metîsi kauliòu?");
		skaitlis = rand.nextInt(6)+1;
		for(int i=1; i<=reizes; i++){
		System.out.println("Uzkrita skaitlis: "+skaitlis);
         if(lielakais<skaitlis)
        	 lielakais = skaitlis;
         
		}
		System.out.println("Lielâkais skaitlis metienos ir"+lielakais);
		
				
		scan.close();
	}
	
		
}


import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for (int i=1; i<skaitlis; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzskrita skaitlis "+skaitlis);
		}
		public static void main(String[] args){
			int reizes, izvele, pedejais;
			Scanner scan = new Scanner(System.in);
			do{
				System.out.println("1-Mest kauli� |2-Apskat�t pedejo |3-Aptur�t");
			izvele =scan.nextInt();
			switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kauli�u?");
				}while(reizes<1);
			pedejais = mestKaulinu(reizes);
			break;
			
			case 2:
				System.out.println("Pedejais uzmestais ir "+pedejais);
				break;
			case 3:
				System.out.println("Programma aptur�ta");
				break;
			}
			}while(izvele!=2);
			scan.close();
			}
		
		
		}

 
			
		
		
		
		
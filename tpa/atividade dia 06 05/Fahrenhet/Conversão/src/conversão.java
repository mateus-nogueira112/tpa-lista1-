
import java.util.Scanner;

public class convers�o {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int f, c;
		
		System.out.println("Digite a temperatura em fahrenthet: ");
		f = ler.nextInt();
		
		c = (int) ((f-32)/1.8);
		System.out.println("Sua temperatura em celsius " + c);
		
		if(c<15)  {
			System.out.println("est� frio ");
			 
		}else if(c>15) {
			System.out.println("est� calor ");
			
		}else
			System.out.println("est� ameno");
		ler.close();
	}
	
}

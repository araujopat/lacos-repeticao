// Quest�o 2

import java.util.Scanner;

public class MaiorInteiro {
	public static void main(String[] args) {
		int x,y,z;


		System.out.println("Digite 3 n�meros inteiros");
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" Primeiro n�mero ");
		x = leia.nextInt();
		System.out.println("Segundo n�mero ");
		y = leia.nextInt();
		System.out.println(" Terceiro n�mero");
		z = leia.nextInt();
	
		if(x<=y && y<=z)
		{
			System.out.println("\nOrdem crescente: "+x+", "+y+" e "+z);
		}
		else if(x<=z && z<=y)
		{
			System.out.println("\nOrdem crescente: "+x+", "+z+" e "+y);
		}
		else if(y<=x && x<=z)
		{
			System.out.println("\nOrdem crescente: "+y+", "+x+" e "+z);
		}
		else if(y<=z && z<=x)
		{
			System.out.println("\nOrdem crescente: "+y+", "+z+" e "+x);
		}
		else if(z<=x && x<=y)
		{
			System.out.println("\nOrdem crescente: "+z+", "+x+" e "+y);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+z+", "+y+" e "+x);
		}
		
	}

}


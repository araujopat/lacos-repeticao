//quest�o 1

import java.util.Scanner;


public class MaiorDeTres {
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
	
		if(x>y && x>z)
		{
			System.out.println("\n O maior n�mero � : "+x);
		}
		else if(y>z && y>x)
		{
			System.out.println("\n O maior n�mero � : "+y);
		}
		else if(z>x && z>y)
		{
			System.out.println("\n O maior n�mero � : "+z);
		}
				
	}

}


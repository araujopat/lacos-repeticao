//questão 1

import java.util.Scanner;


public class MaiorDeTres {
	public static void main(String[] args) {
		int x,y,z;


		System.out.println("Digite 3 números inteiros");
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" Primeiro número ");
		x = leia.nextInt();
		System.out.println("Segundo número ");
		y = leia.nextInt();
		System.out.println(" Terceiro número");
		z = leia.nextInt();
	
		if(x>y && x>z)
		{
			System.out.println("\n O maior número é : "+x);
		}
		else if(y>z && y>x)
		{
			System.out.println("\n O maior número é : "+y);
		}
		else if(z>x && z>y)
		{
			System.out.println("\n O maior número é : "+z);
		}
				
	}

}


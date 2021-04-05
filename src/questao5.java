import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
	
		int num, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do 
		{
			System.out.println("\n Entre com um número: ");
			num = leia.nextInt();
			soma = soma + num;
			/*
			System.out.println(num);
			
			System.out.println(soma);
			*/
		}
		while (num !=0);
		
		System.out.println("A soma dos números digitados é "+ soma );
		

	}

}

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		System.out.printf("Entre com a sua idade: \n");
		idade = entrada.nextInt();
		
		while(idade >=1) {
			System.out.printf("Sua idade: %d\n",idade);
			if(idade >=18)
			{				
				System.out.printf("Voc� � maior ...\n");
			}
			else 
			{
				System.out.printf("Voc� � menor ...\n");
			}
			System.out.printf("Entre com a idade: \n");
			idade = entrada.nextInt();
		}
		
	}

}

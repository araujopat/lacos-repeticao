
public class questao2 {

	public static void main(String[] args) {

		int num, contaPar = 0, contaImpar=0;
		
		for (num=0; num<10; num ++)
		{
			if(num % 2 == 0)
			{
				contaPar ++;
			}
			if (num%2 != 0)
			{
				contaImpar ++;
			}
		}
		System.out.println("\nA quantidade de n�meros pares � : "+ contaPar + "\nA quantidade de n�meros impares �: "+ contaImpar);
	}
	

}


public class questao1 {

	public static void main(String[] args) {

		int num, resto;
		
		for(num = 1000; num < 1999; num ++)
		{
			resto = ( num % 11);
			
			if(resto == 5)
			{
				System.out.println (num);
			}
		}
	}

}

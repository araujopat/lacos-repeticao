import java.util.Scanner;

public class questao3matriz {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];// define o tamanho da matriz

		int linha, coluna = 0, conta10 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
		System.out.println("\nA Matriz ficou: \n");
		for (linha = 0; linha < 3; linha++) {
			System.out.println("\n");
			for (coluna = 0; coluna < 3; coluna++) {

				if (matriz[linha][coluna] > 10) {
					conta10 = conta10 + 1;

				}
				System.out.printf("\t %d \t", matriz[linha][coluna]);

			}

		}
		System.out.printf("\nQuantidade de numeros maiores que 10: " + conta10);

	}

}

package array;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = new int[10];
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite o valor " + (x + 1) + ": ");
			vetor[x] = ler.nextInt();
		}

		System.out.println("\nNumeros impares: ");
		for (int x = 1; x < 10; x += 2) {
			System.out.println(vetor[x]);
		}

		System.out.println("\nNumeros pares: ");
		for (int par : vetor) {
			if (par % 2 == 0) {
				System.out.println(par);
			}
		}
		int soma = 0;
		for (int valor : vetor) {
			soma += valor;
		}
		float media = (float) soma / 10;

		System.out.println("Soma dos elementos: " + soma);
		System.out.printf("Média dos elementos: %.2f " , media);

	}
}
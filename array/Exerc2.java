package array;
import java.util.Scanner;
public class Exerc2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float[][] notas = new float [10][4]; 
		
		for(int x =0;x<10;x++) {
			System.out.println("\nNotas do participante" +(x+1)+ ": ");
			for(int y = 0;x<4;y++ ) {
				System.out.println("\nNota do aluno no"+ (y+1)+"bimestre: ");
				notas[x][y] = ler.nextFloat();
			}
		}
		float[] medias = new float [10];
		for(int x =0; x<10; x++) {
			float soma=0;
			for(int y=0; y<4; y++) {
				soma += notas[x][y];
				
			}
			medias [x]= soma/4;
			
		}
		for(int x=0;x<10;x++) {
			System.out.println("\nMedia do participante"+(x+1) + ":"+ medias[x]);
		}
	}

}

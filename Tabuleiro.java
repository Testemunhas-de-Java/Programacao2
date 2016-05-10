package smoothy;

import java.util.Scanner;

public class Tabuleiro {
	
	int R;
	int C;
	float S;
	static int tabuleiro[][];
	boolean a_jogar;

	
	// Construtor que preenche o tabuleiro com as peças
	public static void inciar(int R){
		
		tabuleiro = new int[R][R];
		
		for (int i=0; i<R; i++){
			for (int j=0; j<R; j++){
				tabuleiro[i][j] = Peca.geraPeca();
			}
		}
		amostraTabuleiro(tabuleiro);
	}
	
	// Pede uma jogada
	
	public static void pedeJogada(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Coordenadas x a Jogar:");
		int x = sc.nextInt();
		System.out.println("Coordenadas y a Jogar:");
		int y = sc.nextInt();
		fazJogada(x,y);
	}
	
	public static void fazJogada(int x, int y){
		
		System.out.println("Tabuleiro editado");
		System.out.println("cordenada " + x + " editada");
		System.out.println("cordenada " + y + " editada");
		
	}
	
	
	// Print do Tabuleiro
	public static void amostraTabuleiro (int tabuleiro[][]){
		
		for (int i=0;i<tabuleiro.length;i++){
			System.out.println("");
			for (int j=0;j<tabuleiro.length;j++){
				System.out.print(" " + tabuleiro[i][j]);
			}
		}
		pedeJogada();
	}
}

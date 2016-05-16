package smoothy;

import java.util.Scanner;

public class Tabuleiro {
	
	int R;
	int C;
	float S;
	static Peca tabuleiro[][];
	boolean a_jogar;

	
	// Construtor que preenche o tabuleiro com as peças
	public static void inciar(int R){
		
		tabuleiro = new Peca[R][R];
		
		for (int i=0; i<R; i++){
			for (int j=0; j<R; j++){
				tabuleiro[i][j] = new Peca();
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
		fazJogadaTeste();
	}
	
	public static void fazJogada(int x, int y){
		
		System.out.println("Tabuleiro editado");
		//System.out.println("coordenada " + x + " editada");
		//System.out.println("coordenada " + y + " editada");
		//eliminaPecasHorizontal();
		eliminaPecasVertical();
		gravidade();
		gravidade();
		amostraTabuleiro(tabuleiro);
		
		
	}
	public static void fazJogadaTeste(){
		System.out.println("Tabuleiro editado");
		eliminaPecasVertical();
		System.out.println("---------");
		eliminaPecasHorizontal();
		gravidade();
		amostraTabuleiro(tabuleiro);
	}
	
	public static void eliminaPecasHorizontal(){
		//int i = 0;
		for (int i=0;i<tabuleiro.length;i++){
			for (int j=0;j<tabuleiro.length;j++) {
				int k = j+1;
				int iguais =0;
					while (k< tabuleiro.length){
						if(tabuleiro[i][j].getCor() ==tabuleiro[i][k].getCor()){
							iguais++;
							k++;
						}
						else{
							break;
						}
							
					}System.out.print(iguais);
					if(iguais >= 2){
						for (int m = iguais; m >= 0;--m){
							tabuleiro[i][j+m].setCor(5);
						}
					}
			}System.out.println();
		}
	}
	
	public static void eliminaPecasVertical(){
		//int j = 0;
		for (int j=0;j<tabuleiro.length;j++){
			for (int i=0;i<tabuleiro.length;i++) {
				int k = i+1;
				int iguais =0;
					while (k< tabuleiro.length){
						if(tabuleiro[i][j].getCor() ==tabuleiro[k][j].getCor()){
							iguais++;
							k++;
						}
						else{
							break;
						}
							
					}System.out.print(iguais);
					if(iguais >= 2){
						for (int m = iguais; m >= 0;--m){
							tabuleiro[i+m][j].setCor(5); 
						}
					}
			}System.out.println();
		}
	}
	public static void gravidade(){
		for (int k=0; k<tabuleiro.length;k++){
			for (int i=1;i<tabuleiro.length;i++){
				for (int j=0;j<tabuleiro.length;j++){
					if(tabuleiro[i][j].getCor() == 5){
						tabuleiro[i][j].setCor(tabuleiro[i-1][j].getCor());
						tabuleiro[i-1][j].setCor(5);
					}
				}
			}
		}
		for (int i=0;i<tabuleiro.length;i++){
			for (int j=0;j<tabuleiro.length;j++){
				if(tabuleiro[i][j].getCor() == 5){
					tabuleiro[i][j] = new Peca();
				}
				
			}
		}
	}
	
	// Print do Tabuleiro
	public static void amostraTabuleiro (Peca tabuleiro[][]){
		
		for (int i=0;i<tabuleiro.length;i++){
			System.out.println("");
			for (int j=0;j<tabuleiro.length;j++){
				System.out.print(" " + tabuleiro[i][j]);
			}
		}
		pedeJogada();
	}
}
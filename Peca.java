package smoothy;
import java.util.Random;

public class Peca {
	
	int cor;
	
	public Peca(){
		Random rand = new Random();
		cor = rand.nextInt((3-1) + 1) +1;
	}
	
	public int getCor(){
		return cor;
	}
	
	public void setCor(int cor){
		this.cor = cor;
	}

	
	public String toString() {
		return Integer.toString(cor);
	}
}



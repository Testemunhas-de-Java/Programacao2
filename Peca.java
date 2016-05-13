package smoothy;
import java.util.Random;

public class Peca {
	
	int cor;
	
	public static int geraPeca(){
		int peca = 0 + (int)(Math.random() * 3);
		return peca;
	}

}



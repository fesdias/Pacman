package Personagens;
import java.util.Random;
import Mapa.Direction;

public class Aleatory extends Ghost {
	
	public Aleatory(int x, int y) {
		super(x, y);
	}

	public void move() {
		
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		this.updateDirection((Direction)n);
		/* Discovery how to use index enum */
	}

}

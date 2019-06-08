package Personagens;
import Mapa.Coordinate;
import java.util.ArrayList;
import Mapa.Wall;

public class Watcher extends Ghost{
	
	public Watcher(int x, int y) {
		super(x, y);
	}
	
	public void move(ArrayList<Wall> w) {
		
		/* Generate */
		Coordinate c;
		do {
			c = new Coordinate();
		} while (search(c.getX(), c.getY(), w));
		
		this.updateCoord(c);
	}
}
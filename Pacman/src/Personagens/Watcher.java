package Personagens;
import functions.Functions;
import map.Coordinate;
import map.Wall;

import java.util.ArrayList;

public class Watcher extends Ghost{
	
	public Watcher(int x, int y) {
		super(x, y);
	}
	
	public void move(ArrayList<Wall> w) {
		
		/* Generate */
		Coordinate c;
		do {
			c = new Coordinate();
		} while (searchWall(c.getX(), c.getY(), w));
		
		this.updateCoord(c);
	}
}
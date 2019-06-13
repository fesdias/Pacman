package Personagens;
import java.util.ArrayList;

import map.Coordinate;
import map.Direction;
import map.Wall;

public class Pacman extends Entidade {
	
	public Pacman(int x, int y) {
		super(x, y);
	}
	
	public void move(Direction d, ArrayList<Wall> w) {
		
		Coordinate c = new Coordinate(this.getX(), this.getY());
		this.updateCoord(nextCoord(d, c, w));
	}
}

package Personagens;

import java.util.ArrayList;
import BasicElements.LabObj;
import map.Coordinate;
import map.Direction;
import map.Wall;

public abstract class Entidade extends LabObj{
	
	private boolean live = true;
	private Direction currentDirection;
	
	public Entidade(int x, int y) {
		super(x, y);
		live = true;
	}
	
	public Direction getCurrenteDirection() {
		return currentDirection;
	}
	
	public void Died() {
		live = false;
	}
	
	public boolean isAlive() {
		return live;
	}
	
	public Coordinate nextCoord(Direction d, Coordinate c, ArrayList<Wall> w) {
		
		Coordinate prox = null;
		
		switch(d) {
			case RIGHT:{
				prox = new Coordinate(c.getX() + 1, c.getY());
			}
			case LEFT:{
				prox = new Coordinate(c.getX() - 1, c.getY());
			}
			case UP:{
				prox = new Coordinate(c.getX(), c.getY() - 1);
			}
			case DOWN:{
				prox = new Coordinate(c.getX(), c.getY() + 1);
			}
		}
		
		if ((prox != null) && (test(d, prox, w)))
			return prox;
		
		return c;
	}
	
	public void updateCoord(Coordinate c) {
		coordinate = c;
	}
	
	public void updateDirection(Direction d) {
		currentDirection = d;
	}
	
	public boolean test(Direction d, Coordinate c, ArrayList<Wall> list) {
		
		/* Test edges */
		if((c.getX() > 25) || (c.getX() < 0))
			return false;
		
		if ((c.getY() > 28) || (c.getY() < 0))
			return false;
		
		/* Test walls */
			/* ver se esta na lista 
			 * if... {
			 * return false;
			 * }*/
		
		return true;
	}
}

package Personagens;
import Mapa.Coordinate;
import Mapa.Direction;
import Mapa.Wall;

import java.util.ArrayList;

import BasicElements.LabObj;


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
	
	public boolean test(Direction d, Coordinate c, ArrayList<Wall> list) {
		
		/* Test edges */
		if((c.getX() > 25) || (c.getX() < 0))
			return false;
		
		if ((c.getY() > 28) || (c.getY() < 0))
			return false;
		
		/* Test walls */
			
		int esq = 0;
		int dir = list.size() - 1;
		int valorMeio;

	    while ( esq <= dir ) {
	            valorMeio = esq + ((dir - esq) / 2);
	            if ( list.get(valorMeio).getX() < c.getX()) { 
	                    esq = valorMeio + 1;
	            } else if( list.get(valorMeio).getX() > c.getX()) { 
	                    dir = valorMeio - 1;
	            } else {
	                if(list.get(valorMeio).getY() < c.getY()) {
	                	esq = valorMeio + 1;
	                }
	                else if( list.get(valorMeio).getY() > c.getY()) { 
	                    dir = valorMeio - 1;
		            } else {
		            	return false;
		            }
	            }
		}
		
		return true;
	}
	
	public abstract void move();
}

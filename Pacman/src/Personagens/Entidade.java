package Personagens;
import Mapa.Direction;
import Mapa.LabObj;

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
	
	public abstract void move();
}

package Personagens;

public abstract class Fantasma extends Entidade{
	
	protected boolean DangerState;
	
	public Fantasma(int x, int y) {
		super(x, y);
		DangerState = false;
	}
	
	public void inDanger() {
		DangerState = true;
	}

	public void outDanger() {
		DangerState = false;
	}
}

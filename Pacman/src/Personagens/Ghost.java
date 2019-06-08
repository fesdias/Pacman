package Personagens;

public abstract class Ghost extends Entidade{
	
	protected boolean DangerState;
	
	public Ghost(int x, int y) {
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

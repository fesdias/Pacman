package Mapa;

public class Checkpoint extends LabObj{
	
	private boolean conquered = false;
	private boolean isEspecial;
	
	public Checkpoint(int x, int y, boolean isEsp) {
		super(x, y);
		isEspecial = isEsp;
	}
	
	public boolean isConquered() {
		return conquered;
	}
	
	public boolean isEspecial() {
		return isEspecial;
	}
	
	public void conquered() {
		conquered = true;
	}
}

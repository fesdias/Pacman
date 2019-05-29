package Mapa;

public class LabObj {

	private Coordenada coordenada;
	
	public LabObj(int x, int y) {
		coordenada = new Coordenada(x, y);
	}
	
	public int getX() {
		return coordenada.getX();
	}
	
	public int getY() {
		return coordenada.getY();
	}
	
	protected Coordenada getCoordinates() {
		return coordenada;
	}
	
	public boolean isSameCoordinates(int x, int y) {
		return coordenada.sameCoord(x, y);
	}
	
	public boolean isSameCoordinates(LabObj obj) {
		if (this.getX() == obj.getX() && this.getY() == this.getY()) {
			return true;
		}
		return false;
	}
}

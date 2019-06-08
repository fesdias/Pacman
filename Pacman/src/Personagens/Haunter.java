package Personagens;
import Mapa.Coordinate;

public class Haunter extends Ghost {
	
	
	public Haunter(int x, int y) {
		super(x, y);
	}

	public void move(Pacman pac) {
		
		this.coordenada = perseguir(pac.getCoord());
		
	}
}

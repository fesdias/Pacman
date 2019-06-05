package Personagens;
import Mapa.Coordinate;

public class Perseguidor extends Fantasma {
	
	
	public void move(Pacman pac) {
		
		this.coordenada = perseguir(pac.getCoord());
		
	}
}

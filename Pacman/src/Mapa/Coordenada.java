package Mapa;
import java.util.Random;

public class Coordenada {
	
	private int x;
	private int y;
	
	public Coordenada(int r, int s) {
		x = r;
		y = s;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean sameCoord(int x1, int y1) {
		if (this.x == x1 && this.y == y1) {
			return true;
		}
		
		return false;
	}
	
	public Coordenada gerarAleatorio() {

		Random gerador = new Random();
		
		/* Colocar dimensões da matriz */
		int r = gerador.nextInt(26);
		int s = gerador.nextInt(29);
		
		Coordenada coord = new Coordenada(r, s);
		
		return coord;
	}
	
	public Coordenada perseguir(Coordenada pacman) {
		
		Coordenada coord = new Coordenada (pacman.x - 5, pacman.y - 5);
		return coord;
	}
}

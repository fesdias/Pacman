package Mapa;
import java.util.Random;

public class Coordinate {
	
	private int x;
	private int y;
	
	public Coordinate(int r, int s) {
		x = r;
		y = s;
	}
	
	public Coordinate(Coordinate c) {
		x = c.getX();
		y = c.getY();
	}
	
	public Coordinate() {
		
		Random gerador = new Random();
		
		/* Colocar dimensões da matriz */
		int r = gerador.nextInt(26);
		int s = gerador.nextInt(29);
		
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
	
	public Coordinate perseguir(Coordinate pacman) {
		
		Coordinate coord = new Coordinate (pacman.x - 5, pacman.y - 5);
		return coord;
	}
}

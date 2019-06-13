package Personagens;
import functions.A_Star;
import map.Coordinate;

public class Haunter extends Ghost {
	
	public Haunter(int x, int y) {
		super(x, y);
	}

	public void move(Pacman pac) {
		
		int x1 = pac.getX();
		int y1 = pac.getY();
		
		Coordinate coordPac = new Coordinate(x1, y1);
		
		int x2 = this.getX();
		int y2 = this.getY();
		
		Coordinate coordHaunter = new Coordinate(x2, y2);
		
		Coordinate coordHaunterNew = shorterWay(coordHaunter, coordPac);
		this.updateCoord(coordHaunterNew);
	}
}

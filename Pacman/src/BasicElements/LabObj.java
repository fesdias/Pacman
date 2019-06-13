package BasicElements;

import map.Coordinate;

public abstract class LabObj {

	protected Coordinate coordinate;
	
	public LabObj(int x, int y) {
		coordinate = new Coordinate(x, y);
	}
	
	public int getX() {
		return coordinate.getX();
	}
	
	public int getY() {
		return coordinate.getY();
	}
	
	protected Coordinate getCoordinates() {
		return coordinate;
	}
	
	public boolean isSameCoordinates(int x, int y) {
		return coordinate.sameCoord(x, y);
	}
	
	public boolean isSameCoordinates(LabObj obj) {
		if (this.getX() == obj.getX() && this.getY() == this.getY()) {
			return true;
		}
		return false;
	}
}

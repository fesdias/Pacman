import java.util.ArrayList;
import functions.Checkpoint;
import labirinto.Points;

// Classe: LabirinthMap (Construtor) 
// Points point = new Points();

// Classe: UpdateMap
// point += setPoints(player.getX(), player.getY(), checkpoint);

public class Points {
	
	private int points;
	
	public Points() {
		points = 0;
	}
	
  //Retorna valor para passar para o template
	public int getPoints() {
		return this.points;
	}
	
  //Soma os valores
	public void setPoints(int x, int y, ArrayList<Checkpoint> checkpoint) {
		points += search(x, y, checkpoint);
	}
	
  //Verifica se é para somar e soma 
	public static int search(int x, int y, ArrayList<Checkpoint> list) {
		{
			int left = 0;
			int right = list.size() - 1;
			int mid;

			    while ( left <= right ) {
			            mid = left + ((right - left) / 2);
			            if ( list.get(mid).getX() < x ) { 
			                    left = mid + 1;
			            } else if( list.get(mid).getX() > x) { 
			                    right = mid - 1;
			            } else {
			                if(list.get(mid).getY() < y) {
			                	left = mid + 1;
			                }
			                else if( list.get(mid).getY() > y) { 
			                    right = mid - 1;
			            } else {
			            	if(list.get(mid).isConquered())
			            		return 0;
			            	else if(list.get(mid).isSpecial()) {
			            		list.get(mid).conquered();
			            		return 10;
			            		}
			            	else {
			            		list.get(mid).conquered();
			            		return 1;
			            	}
			            }
			    }
			    return 0;
	}}}
}

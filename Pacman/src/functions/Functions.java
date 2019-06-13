package functions;
import java.util.ArrayList;

import map.*;

public class Functions {
	
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
	
	public static boolean searchWall(int x, int y, ArrayList<Wall> list) {
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
			            } 
			                else {
			                	return false;
			            	}
			            }
			    }
			    return true;
	}}
	
}

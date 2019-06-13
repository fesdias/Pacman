package functions;

import map.Coordenada;

public class A_Star {
		private Coordenada c;
		private A_Star prev;
		
		private A_Star(Coordenada coord, A_Star p) {
			this.c = coord;
			this.prev = p;
		}
		
		private A_Star getPrev() {
			return this.prev;
		}
		
		
		private static int auxiliar(Coordenada a, Coordenada b) {
			return(Math.abs(a.getX()-b.getX())+Math.abs(a.getY()-b.getY()));
		}
		
		private static A_Star last(A_Star list) {
			while(list.getPrev() != null) {
				list = list.getPrev();
			}
			return list;
		}
		
		private static boolean search_node(A_Star list, int x, int y) {
			while((list != null) && (list.getPrev() != null)) {
				if((list.c.getX() == x) && (list.c.getY() == y))
						return false;
				list = list.getPrev();				
			}
			return true;
		}
		
		
		
		public static Coordenada a_star(int lab[][], Coordenada bgn, Coordenada ed) {
			A_Star open_list = new A_Star(bgn, null);
			A_Star closed_list, aux;
			int x,y;
			
			while(last(open_list).c != ed) {
				aux = last(open_list);
				
				x = aux.c.getX();
				y = aux.c.getY();
				if( (x - 1 >= 0 ) && (lab[x-1][y] != 0) && (search_node(open_list, x, y) && (search_node(closed_list, x, y)))) {
					aux = new A_Star(new Coordenada(x - 1,y), aux);
					//tirar o nó da lista aberta e passar pra fechada//
				}
			}
			
		}
}

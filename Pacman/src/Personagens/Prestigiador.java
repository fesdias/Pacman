package Personagens;
import Mapa.Coordenada;

public class Prestigiador extends Fantasma{
	
	public Prestigiador(int x, int y) {
		super(x, y);
	}
	
	public void move() {
		
		coordenada.gerarAleatorio();
	}

}

import java.util.ArrayList;


public class Tablero {
//	Jugador jugador;
	ArrayList<Pucherito> arrayPucheros=new ArrayList<Pucherito>();
	
	public ArrayList<Pucherito> getArrayPucheros() {
		return arrayPucheros;
	}

	public void setArrayPucheros(ArrayList<Pucherito> arrayPucheros) {
		this.arrayPucheros = arrayPucheros;
	}

	public void rellenarTablero(){
		for (int i=2; i<=11; i++){
			Pucherito pucherito = new Pucherito(i);
			arrayPucheros.add(pucherito);
		}
	}
}

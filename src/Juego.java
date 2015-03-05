import java.util.ArrayList;
//import java.util.Random;


public class Juego {
	ArrayList<Jugador> arrayJugadores=new ArrayList<Jugador>();
	Tablero tablero= new Tablero();
	
	public Juego(int numeroJugadores){
		String nombre="Player";
		for(int i=0;i<numeroJugadores; i++){
			Jugador jugador=new Jugador(nombre+i);
			arrayJugadores.add(jugador);
		}
		tablero.rellenarTablero();		
	}
	
	public void empezarJuego(){
		ArrayList<Pucherito> arrayPucheros=tablero.getArrayPucheros();
		while(true){
			for(int i=0;i<arrayJugadores.size();i++){
				Jugador jug=arrayJugadores.get(i);
				int tira=jug.tirarDados();
				if(tira==12){
					Pucherito pucherito=arrayPucheros.get(5);
					int p=pucherito.jugada12();
					jug.setContadorPuntos(jug.getContadorPuntos()+p);
				}else{
				Pucherito pucherito=arrayPucheros.get(tira-2);
				int puntos=pucherito.rellenarPucherito();
				jug.setContadorPuntos(jug.getContadorPuntos()+puntos);
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		}
	}
}

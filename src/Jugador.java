import java.util.Random;

public class Jugador {
	private int contadorPuntos;
	private String nombre;

	public Jugador(String nombre){
		this.contadorPuntos=0;
		this.nombre=nombre;
	}
	
	public int tirarDados(){
		Random r=new Random();
		int resultado=r.nextInt(11)+2;
		System.out.println(this.nombre+"ha sacado una tirada de: "+resultado);
		return resultado;
	}
	
	public int getContadorPuntos() {
		return contadorPuntos;
	}

	public void setContadorPuntos(int contadorPuntos) {
		this.contadorPuntos = contadorPuntos;
	}
}

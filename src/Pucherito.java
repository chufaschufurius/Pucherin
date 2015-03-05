
public class Pucherito {
//	private int puntos;
	private int numPuchero;
	private int puntosRellenados;
	private boolean estaLleno;
//	private Jugador jugador;
//	private int numPuchero;
	
	public Pucherito(int numero){
		this.puntosRellenados=0;
		this.estaLleno=false;
		
		if (numero==7){
			this.numPuchero=50;
		}else{
			this.numPuchero=numero;
		}
	}
	
	public int jugada12(){
//		this.ganarFichasPuchero();
		int numFichas=this.puntosRellenados;
		this.vaciarPucherito();
		return numFichas;
	}
	
	public int ganarFichasPuchero(){
//		this.numPuchero;
		return this.puntosRellenados;
	}
	
	public int rellenarPucherito(){
		if(!this.isEstaLleno()){
			setPuntosRellenados(this.getPuntosRellenados()+1);
			int puntosTot=this.getPuntosRellenados();
			System.out.println("El puchero: "+this.numPuchero +" lleva "+puntosTot+" puntos");
			return 0;
		}
		else{
			int numFichas=this.puntosRellenados;
			this.vaciarPucherito();
			System.out.println("Pucherito vaciado: "+this.numPuchero);
			return numFichas;
		}
//		jugador.tirarDados();
		
	}
	
	public void vaciarPucherito(){
		if(this.isEstaLleno()){
			this.puntosRellenados=0;
		}
	}
	
	
	public boolean isEstaLleno() {
		return estaLleno;
	}

	public void setEstaLleno(boolean estaLleno) {
		this.estaLleno = estaLleno;
	}

	public int getPuntosVacios() {
		return numPuchero;
	}

	public void setPuntosPosibles(int puntosPosibles) {
		this.numPuchero = puntosPosibles;
	}

	public int getPuntosRellenados() {
		return puntosRellenados;
	}

	public void setPuntosRellenados(int puntosRellenados) {
		this.puntosRellenados = puntosRellenados;
	}

}

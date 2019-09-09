package game;
import java.util.ArrayList;

public class BancoDeCartas {
	private ArrayList<Carta> cartas_Pessoas = new ArrayList<Carta>();
	private ArrayList<Carta> cartas_Lugar = new ArrayList<Carta>();
	private ArrayList<Carta> cartas_Arma = new ArrayList<Carta>();
	
	void addCartasPessoas(Carta nova) {
		this.cartas_Pessoas.add(nova);
	}
	void addCartasLugar(Carta nova) {
		this.cartas_Lugar.add(nova);
	}
	void addCartasArma(Carta nova) {
		this.cartas_Arma.add(nova);
	}
	
	Carta getCartaPessoa(int number){
		return this.cartas_Pessoas.get(number);
	}
	
	Carta getCartaLugar(){
		return this.cartas_Lugar;
	}
	
	Carta getCartaArma(){
		return this.cartas_Arma;
	}
	
	public void listarCartas() {
		
	}
	
	public void sortearCartaPessoa() {
		
	}
	
	public void sortearCartaLugar() {
		
	}
	
	public void sortearCartaArma() {
		
	}
	
	public Segredo sortearCartas() {
		
		
		return null;
	}
	
}


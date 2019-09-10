
import java.util.ArrayList;

public class BancoDeCartas {
	private ArrayList<Carta> cartas_Pessoas = new ArrayList<Carta>();
	private ArrayList<Carta> cartas_Lugar = new ArrayList<Carta>();
	private ArrayList<Carta> cartas_Arma = new ArrayList<Carta>();
	public static void addCartasPessoas() throws FileNotFoundException {
        //Pega o arquivo
        File file = new File("teste.txt");
        Scanner inputFile = new Scanner(file);

        //Preenche o array
        while (inputFile.hasNext()) {
            cartas_Pessoas.add(inputFile.next());
        }
        inputFile.close();
        
        //Apartir do arraylist seleciona uma palavra randomica
//        String palavra = palavras.get((int) (Math.random() * palavras.size()));
//
//        return palavra;
        System.out.println(cartas_Pessoas);
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


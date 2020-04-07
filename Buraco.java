package lab05;

public class Buraco {
	int x;
	Char y;
	int espaco; // se 0 espaço vago se 1 espaco com peca
	
	Buraco(int x, Char y, int espaco){
		this.x=x;
		this.y=y;
		this.espaco=espaco;
	}
	void mostrarBuraco() {
		if(espaco == 1) {
			System.out.println("P");
		}
		else
			System.out.println("-");
	}
}

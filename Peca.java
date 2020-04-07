package lab05;

public class Campo {
	int x;
	char y;
	boolean peca; //false se for um espaço em branco, true se tiver uma peça
	boolean comida; //false se a peça nesse espaço não foi comida, true se foi comida
	
	Quadrado(int x, char y, boolean peca){
		this.x = x;
		this.y = y;
		this.peca = peca;
		this.comida = false;
	}
		
	void comerPeca() {
		comida = true;
	}	
}

package lab05;

public class Campo {
	int x;
	char y;
	boolean peca; //false se for um espa�o em branco, true se tiver uma pe�a
	boolean comida; //false se a pe�a nesse espa�o n�o foi comida, true se foi comida
	
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

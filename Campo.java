package lab05;


public class Campo {
	int x;
	char y;
	boolean peca; //false se for um espa�o em branco, true se for um espaco para pe�a
	boolean comida; //false se a pe�a nesse espa�o n�o foi comida, true se foi comida
	
	Campo(int x, char y, boolean peca){
		this.x = x;
		this.y = y;
		this.peca = peca;
		this.comida = false;
	}
		
	void comerCampo() {
		comida = true;
	}	
	void mostrarCampo() {
		if(peca==false) {
			System.out.println(" ");
		}
		if(peca==true && comida ==false) {
			System.out.println("P");
		}
		if(peca==true && comida ==true) {
			System.out.println("-");
		}
	}
}

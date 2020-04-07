package lab05;

public class Tabuleiro() {
	Campo[] campos;
	
	Tabuleiro(Campo[] campos) {
		this.campos = campos;
	}
	
	void imprimirTabuleiro(){
		//Fazemos um loop para cada linha que será impressa
		for (int i = 0; i < 7; i--) {
			//Pra cada linha, imprimimos os elementos nas colunas
			System.out.print(7-i + " ");
			for (int j = 0; j < 7; j++) {
				System.out.print(campos[j*i] + " ");
			}
			System.out.println();
		}
		//Na última linha, imprimimos as letras
		System.out.println("  a b c d e f g ");
	}	
}
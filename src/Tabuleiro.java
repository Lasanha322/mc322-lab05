public class Tabuleiro {
	Campo[][] campos;
	int n;
	
	void gerarTabuleiro() {
		this.n = 7;
		campos = new Campo[n][n];
		
		//Começamos gerando o espaço total
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				campos[i][j] = new Campo(i, j, false);
			}
		}
		
		//Agora incluimos as pecas
		for (int i = 2; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				campos[i][j].colocarPeca();
			}
		}
		for (int j = 2; j < 5; j++) {
			for (int i = 0; i < n; i++) {
				campos[i][j].colocarPeca();
			}
		}
		//Tiramos a peca do centro
		campos[3][3].comerPeca();
	}
		
	void imprimirTabuleiro() {
		//Fazemos um loop para cada linha que sera impressa
		for (int i = 0; i < n; i++) {
			//Pra cada linha, imprimimos os elementos nas colunas
			System.out.print(n-i + " ");
			for (int j = 0; j < n; j++) {
				campos[i][j].mostrarCampo();
			}
			System.out.println();
		}
		//Na última linha, imprimimos as letras
		System.out.println("  a b c d e f g ");
		System.out.println();
	}	
}
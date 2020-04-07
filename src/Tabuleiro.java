public class Tabuleiro {
	Campo[][] campos;
	int n;
	
	void gerarTabuleiro(int n) {
		this.n = n;
		campos = new Campo[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				campos[i][j] = new Campo(i, j, false);
			}
		}		
	}
	
	void imprimirTabuleiro(){
		//Fazemos um loop para cada linha que será impressa
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
	}	
}
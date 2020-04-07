public class main {
	public static void main(String[] args) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("C:/Users/cauan/eclipse-workspace/lab05/src/lab05/arq001.csv");
		String commands[] = csv.requestCommands();
		System.out.println("Movimentos: " + commands[0] + " -> " + commands[1]);
		
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.gerarTabuleiro(7);
		tabuleiro.imprimirTabuleiro();
	}
}
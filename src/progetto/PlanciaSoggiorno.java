package progetto;

public class PlanciaSoggiorno {
	
	private int numeroGiocatori;
	private final int rowLen = 9;
	private final int columnLen = 9;
	private Integer[][] plancia = new Integer[rowLen][columnLen];
	
	public PlanciaSoggiorno(int numeroGiocatori) {
		
		//check over number of players 
		if(numeroGiocatori < 2 || numeroGiocatori > 4) {
			throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 4.");
		}
		
		this.numeroGiocatori = numeroGiocatori;
		
		//setting every element to zero
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < columnLen; j++) {
				plancia[i][j] = 0;
			}
		}
	}
	
	
	public int getElement(int row, int column) {
		return plancia[row][column];
	}
	
}

package progetto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Scrivi:");
		String line=sc.nextLine();
		System.out.println(line);
		System.out.println("Funziona");
		System.out.println("https://github.com/MichelePagani1079230/Gruppo19.git");
		int a= 1;
		System.out.println("First commit");
		*/
		PlanciaSoggiorno plancia = new PlanciaSoggiorno(5);
		System.out.println(plancia.getElement(3,4));
	}

}

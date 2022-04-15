package zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listaNazwisk = new ArrayList<String>();
		int koniec = 1;
		
		while (koniec != 2) 
		{
			System.out.print("Podaj nazwisko: ");
			String nazwisko = scanner.next();
			System.out.println();
			
			if(listaNazwisk.contains(nazwisko))
			{
				System.out.println("Podane nazwisko jest ju¿ na liœcie.");
			}
			else
			{
				listaNazwisk.add(nazwisko);
			}
			
			if(listaNazwisk.size()==4)
			{
				System.out.println("Lista nazwisk zawiera ju¿ 4 nazwiska");
				koniec = 2;
			}
			else
			{
				System.out.println("Wybierz:");
				System.out.println("[1] - dalsze wpisywanie");
				System.out.println("[2] - koniec");
				System.out.print("twój wybór: ");
				koniec = scanner.nextInt();
				System.out.println();
			}
		}
		scanner.close();
		Collections.sort(listaNazwisk);
		System.out.println("Lista nazwsik: " + listaNazwisk);
	}
}

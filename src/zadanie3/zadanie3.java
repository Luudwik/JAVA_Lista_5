package zadanie3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class zadanie3 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Date> listaDat = new ArrayList<Date>();
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		int koniec = 1;
		
		while(koniec!=2)
		{
			System.out.print("Podaj datê: ");
			String input = scanner.next();
			System.out.println();
			Date data = format.parse(input);
			
			if(listaDat.contains(data))
			{
				System.out.println("Podana data jest ju¿ na liœcie" + "\n");
			}
			else
			{
				listaDat.add(data);
				Collections.sort(listaDat);
				wypisz(listaDat, format);
			}
			if(listaDat.size()==4)
			{
				System.out.println("Lista jest ju¿ pe³na");
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
		if(koniec==2)
		{
			System.out.println("Zakoñczono dzia³anie programu");
			Collections.sort(listaDat);
			wypisz(listaDat, format);
		}
	}
	
	public static void wypisz(ArrayList<Date> listaDat, SimpleDateFormat format)
	{
		System.out.println("Daty na liœcie: ");
		listaDat.forEach(action -> System.out.println(format.format(action)));
		System.out.println();
	}
}

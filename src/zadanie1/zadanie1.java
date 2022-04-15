package zadanie1;

import java.util.Scanner;

public class zadanie1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj n: ");
		int n = scanner.nextInt();
		scanner.close();

		int tab[][] = new int[n+1][n+1];

		for(int i=0; i<=n; i++)
		{
			tab[i][0] = i;
			for(int j=0; j<=n; j++)
			{
				tab[0][j] = j;
				tab[i][j] = tab[i][j] + i*j;
			}
		}
		
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if(i==0 & j==0)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(tab[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

package tareas.uno.al.veinte;

import java.util.Random;

public class Histograma
{
	public static void main(String[] args)
	{
		Random r = new Random();

		int n = 12;
		int lim_inf = 1;
		int lim_sup = 6;

		int[] numeros = new int [n];
		int[] frecuencias = new int [lim_sup + 1];

		System.out.print("{");
		for (int i = 0, numero; i < n; i++)
		{
			numero = r.nextInt(lim_inf, lim_sup + 1);
			numeros[i] = numero;
			frecuencias[numero]++;
			System.out.print(numero + (i < n - 1 ? ", " : ""));
		}
		System.out.println("}");

		for (int numero = 1; numero <= lim_sup; numero++)
		{
			System.out.print(numero + ": ");

			for (int i = 0; i < frecuencias[numero]; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

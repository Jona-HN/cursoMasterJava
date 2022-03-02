package tareas.uno.al.veinte;

import java.util.Random;

public class NumeroMasAlto
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int numeros[] = new int[7];

		for (int i = 0; i < 7; i++)
		{
			numeros[i] = r.nextInt(11, 100);
			System.out.print(numeros[i] + " ");
		}

		int num_mayor = 0;

		for (int i : numeros)
		{
			if(i > num_mayor)
			{
				num_mayor = i;
			}
		}

		System.out.println();
		System.out.println("El número mayor es: " + num_mayor);
	}
}

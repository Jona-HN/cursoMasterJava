package tareas.uno.al.veinte;

import java.util.Random;

public class MayorOcurrencia
{
	public static void main(String[] args)
	{
		int cant_nums = 10;
		// los límites deben ser positivos
		int limite_inf = 1;
		int limite_sup = 9;

		int[] numeros = new int[cant_nums];
		int[] ocurrencias = new int[limite_sup + 1];
		Random r = new Random();

		for (int i = 0, numero; i < cant_nums; i++)
		{
			numero = r.nextInt(limite_inf, limite_sup + 1);
			numeros[i] = numero;
			ocurrencias[numero]++;
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

//		int numero_con_mayor_ocurrencia = 0;
//		for (int numero = limite_sup; numero >= limite_inf; numero--)
//		{
//			if (ocurrencias[numero] > ocurrencias[numero - 1] &&
//				ocurrencias[numero] > ocurrencias[numero_con_mayor_ocurrencia])
//			{
//				numero_con_mayor_ocurrencia = numero;
//			}
//		}

		// Es más sencillo almacenar el numero mayor de ocurrencias y
		// compararlo con el de cada número
		int mayor_num_ocurrencias = 0;
		for (int numero = limite_inf; numero <= limite_sup; numero++)
		{
			if (ocurrencias[numero] > mayor_num_ocurrencias)
			{
				mayor_num_ocurrencias = ocurrencias[numero];
			}
		}

		System.out.println("El mayor número de ocurrencias es: " + mayor_num_ocurrencias);

		System.out.print("Los números que más se repiten son: ");
		for (int numero = limite_inf; numero <= limite_sup; numero++)
		{
			if (ocurrencias[numero] == mayor_num_ocurrencias)
			{
				System.out.print(numero + " ");
			}
		}
	}
}

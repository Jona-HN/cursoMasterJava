package tareas.uno.al.veinte;

import java.util.Scanner;

public class NumeroMenor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números ingresará?: ");
		int cant_nums = sc.nextInt();
//		int num_menor = 999;
		// mejor usar la constante
		int num_menor = Integer.MAX_VALUE;
		int num_ing;

		for(int i = 0; i < cant_nums; i++)
		{
			System.out.println("Ingrese un número: ");
			num_ing = sc.nextInt();

			if(num_ing < num_menor)
			{
				num_menor = num_ing;
			}
			// también se puede usar el ternario
//			num_menor = (num_ing < num_menor) ? num_ing : num_menor;
		}

		System.out.println("El número menor es " + (num_menor < 10 ?
				"menor" : "igual o mayor") + " que 10");
	}
}

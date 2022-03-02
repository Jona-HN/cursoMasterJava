package tareas.uno.al.veinte;

public class OrdenArreglos
{
	public static void main(String[] args)
	{
		int numeros[] = new int[10];

		for (int i = 0; i < 10; i++)
		{
			numeros[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < numeros.length / 2; i++)
		{
			System.out.print(numeros[numeros.length - (i + 1)]);
			System.out.print(" " + numeros[i] + " ");
		}
	}
}
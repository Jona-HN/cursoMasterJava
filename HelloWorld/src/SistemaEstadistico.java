import java.util.List;
import java.util.Scanner;

public class SistemaEstadistico
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[7];

		System.out.println("Ingrese 7 números: ");
		String entrada = sc.nextLine();
		String numeros_string[] = entrada.split(" ");

		for (int i = 0; i < 7; i++)
		{
			numeros[i] = Integer.parseInt(numeros_string[i]);
		}

		double suma_pos = 0, suma_neg = 0;
		int cont_pos = 0, cont_neg = 0, cont_ceros = 0;

		for (int num : numeros)
		{
			if (num > 0)
			{
				suma_pos += num;
				cont_pos++;
			}
			else if (num < 0)
			{
				suma_neg += num;
				cont_neg++;
			}
			else
			{
				cont_ceros++;
			}
		}

		if (cont_pos > 0)
		{
			System.out.println("Promedio de los positivos: " + suma_pos / cont_pos);
		}
		if (cont_neg > 0)
		{
			System.out.println("Promedio de los negativos: " + suma_neg / cont_neg);
		}
		System.out.println("Cantidad de ceros: " + cont_ceros);
	}
}

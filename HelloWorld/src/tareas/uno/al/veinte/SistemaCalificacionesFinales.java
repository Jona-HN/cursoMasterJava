package tareas.uno.al.veinte;

import java.util.Scanner;

public class SistemaCalificacionesFinales
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cant_calif = 20;
		double calif;
		int no_calif = 1;
		int calif_mayor_5 = 0;
		int calif_menor_4 = 0;
		int calif_igual_1 = 0;
		double promedio = 0;
		double prom_mayores_5 = 0;
		double prom_menores_4 = 0;
		boolean programa_interrumpido = false;

		do
		{
			System.out.println("Ingrese una calificación: ");
			calif = sc.nextDouble();

			if (calif == 0)
			{
				System.out.println("Error: finaliza el programa");
				programa_interrumpido = true;
			}
			else
			{
				while (calif < 1 || calif > 7)
				{
					System.out.println("Error: las calificaciones van del 1 al 7");

					System.out.println("Ingrese una calificación: ");
					calif = sc.nextDouble();
				}

				// Se pierden decimales, mejor
				// dividir hasta el final
//				promedio += calif / cant_calif;

				promedio += calif;

				if (calif == 1)
				{
					calif_igual_1++;
				}
				else
				{
					if (calif > 5)
					{
						calif_mayor_5++;
						prom_mayores_5 += calif;
					}
					else if (calif < 4)
					{
						calif_menor_4++;
						prom_menores_4 += calif;
					}
				}

				no_calif++;
			}
		} while(no_calif <= cant_calif && !programa_interrumpido);

		if(!programa_interrumpido)
		{
			System.out.println(" *** Datos generados ***");

			promedio /= cant_calif;
			System.out.println("Promedio general = " + promedio);

			if (calif_mayor_5 == 0)
			{
				System.out.println("No hubo calificaciones mayores a 5");
			}
			else
			{
				prom_mayores_5 /= calif_mayor_5;
				System.out.println("Promedio de notas mayores a 5 = " + prom_mayores_5);
			}

			if (calif_menor_4 == 0)
			{
				System.out.println("No hubo calificaciones menores a 4");
			}
			else
			{
				prom_menores_4 /= calif_menor_4;
				System.out.println("Promedio de notas menores a 4 = " + prom_menores_4);
			}

			System.out.println("Cantidad de notas iguales a 1 = " + calif_igual_1);
		}
	}
}

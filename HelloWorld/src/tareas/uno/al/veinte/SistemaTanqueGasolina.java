import java.util.Scanner;

public class SistemaTanqueGasolina
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la medida (en litros) del tanque: ");
		double medida = sc.nextDouble();

		if (medida == 70)
		{
			System.out.println("Tanque lleno");
		}
		else if (medida < 70 && medida >= 60)
		{
			System.out.println("Tanque casi lleno");
		}
		else if (medida < 60 && medida >= 40)
		{
			System.out.println("Tanque 3/4");
		}
		else if (medida < 40 && medida >= 35)
		{
			System.out.println("Medio tanque");
		}
		else if (medida < 35 && medida >= 20)
		{
			System.out.println("Suficiente");
		}
		else if (medida < 20 && medida >= 1)
		{
			System.out.println("Insuficiente");
		}
	}
}

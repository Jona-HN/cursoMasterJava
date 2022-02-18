import java.util.Scanner;

public class CalculadoraSinMultiplicar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		int num1 = sc.nextInt();

		System.out.println("Ingrese otro numero: ");
		int num2 = sc.nextInt();

		int resultado = 0;
		boolean signo_positivo = (num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0);

		for(int i = 0; i < Math.abs(num2); i++)
		{
			resultado += Math.abs(num1);
		}

		resultado = signo_positivo ? resultado : -resultado;

		System.out.println(num1 + " * " + num2 + " = " + resultado);
	}
}

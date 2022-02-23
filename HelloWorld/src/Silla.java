import javax.swing.*;

public class Silla
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión de la matriz: "));

		if (n < 1)
		{
			System.err.println("Se ha ingresado un valor menor a 1");
			System.exit(-1);
		}

		boolean[][] matriz = new boolean [n][n];
		int filaMedia = n / 2;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j == 0 || i == filaMedia || i > filaMedia && j == n - 1)
				{
					matriz[i][j] = true;
				}
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(matriz[i][j] ? 1 : 0);
			}
			System.out.println();
		}
	}
}

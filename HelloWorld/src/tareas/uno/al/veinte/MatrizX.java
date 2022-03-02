package tareas.uno.al.veinte;

import javax.swing.*;

public class MatrizX
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión de la matriz: "));

		if (n < 1)
		{
			System.err.println("Se ha ingresado un valor menor a 1");
			System.exit(-1);
		}

		char[][] matriz = new char [n][n];

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i == j || i + j == n - 1)
				{
					matriz[i][j] = 'X';
				}
				else
				{
					matriz[i][j] = '_';
				}
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}

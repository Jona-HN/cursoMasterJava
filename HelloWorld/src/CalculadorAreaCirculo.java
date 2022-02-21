import javax.swing.*;

public class CalculadorAreaCirculo
{
	public static void main(String[] args)
	{
		double radio = 0;
		do
		{
			try
			{
				radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));
				if (radio > 0)
				{
					double area = Math.PI * Math.pow(radio, 2);
					JOptionPane.showMessageDialog(null, "El área del círculo es: " +
							area + " u^2");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Solo valores mayores a 0");
				}
			} catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "Solo valores numéricos");
			}
		} while (radio <= 0);
	}
}

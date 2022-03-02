package tareas.uno.al.veinte;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadorEdad
{
	public static void main(String[] args)
	{
		String fecha_nac_string = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (dd mm aaaa): " );

		try
		{
			var formato = new SimpleDateFormat("dd MM yyyy");
			Date fecha_nac_date = formato.parse(fecha_nac_string);

			Calendar fecha_nac_cal = Calendar.getInstance();
			fecha_nac_cal.setTime(fecha_nac_date);

			Calendar fecha_actual = Calendar.getInstance();

			String mensaje;
			if (fecha_nac_cal.after(fecha_actual))
			{
				mensaje = "Vienes del futuro";
			}
			else
			{
				int edad = fecha_actual.get(Calendar.YEAR) - fecha_nac_cal.get(Calendar.YEAR);
				int mes_actual = fecha_actual.get(Calendar.MONTH);
				int mes_nac = fecha_nac_cal.get(Calendar.MONTH);
				int dia_actual = fecha_actual.get(Calendar.DAY_OF_MONTH);
				int dia_nac = fecha_nac_cal.get(Calendar.DAY_OF_MONTH);

				if (mes_actual < mes_nac || (mes_actual == mes_nac && dia_actual < dia_nac))
				{
					edad--;
				}

				mensaje = "Tienes " + edad + " año(s)";
			}
			JOptionPane.showMessageDialog(null, mensaje);
		} catch (ParseException e)
		{
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error al introducir la fecha");
		}
	}
}

// Restricción: no usar loops

import javax.swing.*;

public class NombreMasLargo
{
	public static void main(String[] args)
	{
		String[] nombreCompleto;

		nombreCompleto = pedirDatos();
		Persona per1 = new Persona(nombreCompleto);

		nombreCompleto = pedirDatos();
		Persona per2 = new Persona(nombreCompleto);

		nombreCompleto = pedirDatos();
		Persona per3 = new Persona(nombreCompleto);

		if (per1.longitudNombre > per2.longitudNombre && per1.longitudNombre > per3.longitudNombre)
		{
			mostrar(per1.toString());
		}
		else if (per2.longitudNombre > per1.longitudNombre && per2.longitudNombre > per3.longitudNombre)
		{
			mostrar(per2.toString());
		}
		else if (per3.longitudNombre > per1.longitudNombre && per3.longitudNombre > per2.longitudNombre)
		{
			mostrar(per3.toString());
		}
		else
		{
			mostrar("ninguno de los anteriores");
		}
	}

	public static String[] pedirDatos()
	{
		String[] datos = JOptionPane.showInputDialog("Ingrese su nombre completo (nombre + apellido): ")
				.split(" ");

		return datos;
	}

	public static void mostrar(String nombre)
	{
		JOptionPane.showMessageDialog(null, "El nombre más largo es: " + nombre);
	}
}
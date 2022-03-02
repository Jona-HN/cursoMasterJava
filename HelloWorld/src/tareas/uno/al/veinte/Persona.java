package tareas.uno.al.veinte;// Para tarea 6

public class Persona
{
	public String nombre;
	public String apellido;
	public int longitudNombre;

	public Persona(String[] datos)
	{
		nombre = datos[0];
		apellido = datos[1];
		longitudNombre = nombre.length() + apellido.length();
	}

	@Override
	public String toString()
	{
		return nombre + " " + apellido;
	}
}
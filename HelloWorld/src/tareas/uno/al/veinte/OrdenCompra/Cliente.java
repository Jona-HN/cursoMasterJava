package OrdenCompra;

public class Cliente
{
	private final String nombre;
	private final String apellido;

	public Cliente(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	@Override
	public String toString()
	{
		return nombre + " " + apellido;
	}
}

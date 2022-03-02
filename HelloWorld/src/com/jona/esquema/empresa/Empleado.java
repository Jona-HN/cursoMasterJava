package com.jona.esquema.empresa;

public class Empleado extends Persona
{
	private double remuneracion;
	private int empleadoId;
	private static int ultimoId;

	public Empleado(String nombre, String apellido, String numeroFiscal,
					String direccion, double remuneracion)
	{
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		empleadoId = ++ultimoId;
	}

	public double getRemuneracion()
	{
		return remuneracion;
	}

	public int getEmpleadoId()
	{
		return empleadoId;
	}

	public void aumentarRemuneracion(int porcentaje)
	{
		remuneracion += remuneracion * porcentaje / 100;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", remuneracion='" + remuneracion + '\'' +
				", empleadoId='" + empleadoId + '\'';
	}
}

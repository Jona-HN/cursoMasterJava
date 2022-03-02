package com.jona.esquema.empresa;

public class Gerente extends Empleado
{
	private double presupuesto;

	public Gerente(String nombre, String apellido, String numeroFiscal,
				   String direccion, double remuneracion)
	{
		super(nombre, apellido, numeroFiscal, direccion, remuneracion);
	}

	public void setPresupuesto(double presupuesto)
	{
		this.presupuesto = presupuesto;
	}

	public double getPresupuesto()
	{
		return presupuesto;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", presupuesto='" + presupuesto + '\'';
	}
}

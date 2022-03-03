package com.jona.almacen.mayoreo.personas;

public class Persona
{
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString()
	{
		return "Nombre completo: " + nombre + " " + apellido +
				" (" + edad + " años)";
	}

	public String getNombreCompl()
	{
		return nombre + " " + apellido;
	}
}

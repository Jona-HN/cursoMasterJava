package com.jona.almacen.mayoreo;

public enum Unidad
{
	KILOGRAMO("Kilogramo", "kg"),
	GRAMOS("Gramos", "gr"),
	MILILITROS("Mililitros", "ml"),
	LITROS("Litros", "lt"),
	PIEZA("Pieza", "uni");

	private String nombre;
	private String abrev;

	Unidad(String nombre, String abrev)
	{
		this.nombre = nombre;
		this.abrev = abrev;
	}

	public String getAbrev()
	{
		return abrev;
	}
}

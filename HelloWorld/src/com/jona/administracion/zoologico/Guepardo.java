package com.jona.administracion.zoologico;

public class Guepardo extends Felino
{
	public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad)
	{
		super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
	}

	@Override
	public String comer()
	{
		return "El guepardo come";
	}

	@Override
	public String dormir()
	{
		return "El guepardo duerme";
	}

	@Override
	public String correr()
	{
		return "El guepardo corre";
	}

	@Override
	public String comunicarse()
	{
		return "*ronroneo*";
	}
}

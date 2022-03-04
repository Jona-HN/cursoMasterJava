package com.jona.administracion.zoologico;

public class Leon extends Felino
{
	private Integer numManada;
	private float potRugDc;

	public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad, Integer numManada, float potRugDc)
	{
		super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
		this.numManada = numManada;
		this.potRugDc = potRugDc;
	}

	public Integer getNumManada()
	{
		return numManada;
	}

	public float getPotRugDc()
	{
		return potRugDc;
	}

	@Override
	public String comer()
	{
		return String.format("El León caza junto a su grupo de %d individuos en las llanuras africanas", numManada);
	}

	@Override
	public String dormir()
	{
		return "El león duerme";
	}

	@Override
	public String correr()
	{
		return "El león corre";
	}

	@Override
	public String comunicarse()
	{
		return "Rawr!";
	}
}

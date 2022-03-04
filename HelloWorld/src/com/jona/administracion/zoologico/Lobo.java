package com.jona.administracion.zoologico;

public class Lobo extends Canino
{
	private int numCamada;
	private String especieLobo;

	public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int numCamada, String especieLobo)
	{
		super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
		this.numCamada = numCamada;
		this.especieLobo = especieLobo;
	}

	public int getNumCamada()
	{
		return numCamada;
	}

	public String getEspecieLobo()
	{
		return especieLobo;
	}

	@Override
	public String comer()
	{
		return "El lobo comparte la presa con su manada, pero el alfa come primero";
	}

	@Override
	public String dormir()
	{
		return String.format("El Lobo %s duerme en las cavernas de %s", color, habitat);
	}

	@Override
	public String correr()
	{
		return "El lobo sólo corre cuando caza a su presa";
	}

	@Override
	public String comunicarse()
	{
		return "*gruñido*";
	}
}

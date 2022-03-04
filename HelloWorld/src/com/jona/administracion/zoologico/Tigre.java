package com.jona.administracion.zoologico;

public class Tigre extends Felino
{
	private String especieTigre;

	public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad, String especieTigre)
	{
		super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
		this.especieTigre = especieTigre;
	}

	public String getEspecieTigre()
	{
		return especieTigre;
	}

	@Override
	public String comer()
	{
		return String.format("El tigre %s come carne", especieTigre);
	}

	@Override
	public String dormir()
	{
		return String.format("A pesar de ser intrépido, el tigre %s duerme 10 horas diarias", nombreCientifico);
	}

	@Override
	public String correr()
	{
		return String.format("El tigre %s corre a %d km/h", nombreCientifico, velocidad);
	}

	@Override
	public String comunicarse()
	{
		return "Grrr!";
	}
}

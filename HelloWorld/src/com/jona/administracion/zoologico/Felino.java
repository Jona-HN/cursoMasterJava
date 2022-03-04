package com.jona.administracion.zoologico;

abstract public class Felino extends Mamifero
{
	protected float tamanioGarras;
	protected int velocidad;

	public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad)
	{
		super(habitat, altura, largo, peso, nombreCientifico);
		this.tamanioGarras = tamanioGarras;
		this.velocidad = velocidad;
	}

	public float getTamanioGarras()
	{
		return tamanioGarras;
	}

	public int getVelocidad()
	{
		return velocidad;
	}
}

package com.jona.administracion.zoologico;

abstract public class Mamifero
{
	protected String habitat;
	protected float altura;
	protected float largo;
	protected float peso;
	protected String nombreCientifico;

	public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico)
	{
		this.habitat = habitat;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
		this.nombreCientifico = nombreCientifico;
	}

	public String getHabitat()
	{
		return habitat;
	}

	public float getAltura()
	{
		return altura;
	}

	public float getLargo()
	{
		return largo;
	}

	public float getPeso()
	{
		return peso;
	}

	public String getNombreCientifico()
	{
		return nombreCientifico;
	}

	@Override
	public String toString()
	{
		return "Mamifero{" +
				"habitat='" + habitat + '\'' +
				", altura=" + altura +
				", largo=" + largo +
				", peso=" + peso +
				", nombreCientifico='" + nombreCientifico + '\'' +
				'}';
	}

	abstract public String comer();
	abstract public String dormir();
	abstract public String correr();
	abstract public String comunicarse();
}

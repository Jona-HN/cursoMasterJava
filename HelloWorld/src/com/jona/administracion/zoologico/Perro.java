package com.jona.administracion.zoologico;

public class Perro extends Canino
{
	private int fuerzaMordida;

	public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int fuerzaMordida)
	{
		super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
		this.fuerzaMordida = fuerzaMordida;
	}

	public int getFuerzaMordida()
	{
		return fuerzaMordida;
	}

	@Override
	public String comer()
	{
		return String.format("El perro salvaje africano come rápidamente gracias a sus mordidas de %d psi de fuerza", fuerzaMordida);
	}

	@Override
	public String dormir()
	{
		return "El perro africano salvaje duerme";
	}

	@Override
	public String correr()
	{
		return "El perro africano salvaje corre";
	}

	@Override
	public String comunicarse()
	{
		return "Woof!";
	}
}

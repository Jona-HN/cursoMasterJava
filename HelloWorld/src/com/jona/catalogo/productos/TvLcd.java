package com.jona.catalogo.productos;

public class TvLcd extends Electronico
{
	private int tamanioPulgadas;

	public TvLcd(int precio, String fabricante, int tamanioPulgadas)
	{
		super(precio, fabricante);
		this.tamanioPulgadas = tamanioPulgadas;
	}

	@Override
	public double getPrecioVenta()
	{
		return getPrecio() * tamanioPulgadas * 0.03;
	}

	@Override
	public String toString()
	{
		return String.format("TV LCD de %d pulgadas (precio: $%d, precio venta: $%.2f)", tamanioPulgadas, getPrecio(), getPrecioVenta());
	}
}

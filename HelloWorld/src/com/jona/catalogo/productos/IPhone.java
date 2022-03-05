package com.jona.catalogo.productos;

public class IPhone extends Electronico
{
	private String modelo;
	private String color;

	public IPhone(int precio, String fabricante, String modelo, String color)
	{
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}

	@Override
	public double getPrecioVenta()
	{
		return getPrecio() + (getPrecio() * 0.2);
	}

	@Override
	public String toString()
	{
		return String.format("iPhone %s color %s (precio: $%d, precio venta: $%.2f)", modelo, color, getPrecio(), getPrecioVenta());
	}
}

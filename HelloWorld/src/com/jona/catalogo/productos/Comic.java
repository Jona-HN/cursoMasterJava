package com.jona.catalogo.productos;

import java.util.Date;

public class Comic extends Libro
{
	private String personaje;
	private boolean esNumeroUno;

	public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje, boolean esNumeroUno)
	{
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = personaje;
		this.esNumeroUno = esNumeroUno;
	}

	@Override
	public double getPrecioVenta()
	{
		return getPrecio() + (esNumeroUno ? getPrecio() * 300 : 0);
	}

	@Override
	public String toString()
	{
		return String.format("%s%s por: %s (publicado el %s por %s) (precio: $%d, precio venta: $%.2f)",
				getTitulo(), (esNumeroUno ? " (#1)" : ""), getAutor(), getFechaPublicacionFormateada(),
				getEditorial(), getPrecio(), getPrecioVenta());
	}
}

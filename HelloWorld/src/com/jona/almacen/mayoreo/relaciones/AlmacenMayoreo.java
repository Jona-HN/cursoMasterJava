package com.jona.almacen.mayoreo.relaciones;

import com.jona.almacen.mayoreo.productos.Producto;

import java.util.ArrayList;

public class AlmacenMayoreo
{
	private ArrayList<Producto> productos;

	public AlmacenMayoreo()
	{
		productos = new ArrayList<>();
	}

	public void agregarProductos(Producto ... productos)
	{
		for (Producto p : productos)
		{
			if (!this.productos.contains(p))
			{
				this.productos.add(p);
			}
		}
	}

	public Producto buscarProducto(String nombre)
	{
		var it = productos.iterator();
		Producto producto = null;
		boolean encontrado = false;

		while (it.hasNext() && !encontrado)
		{
			producto = it.next();
			encontrado = producto.getNombre().equalsIgnoreCase(nombre);
		}

		return producto;
	}

	public Producto buscarProducto(int id)
	{
		var it = productos.iterator();
		Producto producto = null;
		boolean encontrado = false;

		while (it.hasNext() && !encontrado)
		{
			producto = it.next();
			encontrado = producto.getId() == id;
		}

		return producto;
	}

	@Override
	public String toString()
	{
		String resultado = "";

		productos.forEach(p -> resultado.concat(p.toString()).concat("\n"));

		return resultado;
	}
}

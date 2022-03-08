package com.jona.bolsa.mercado.generica;

import com.jona.bolsa.mercado.generica.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto>
{
	public static final int MAX_ITEMS = 5;
	private List<T> productos;

	public BolsaSupermercado()
	{
		productos = new ArrayList<>();
	}

	public BolsaSupermercado<T> addProducto(T producto)
	{
		if (productos.size() < MAX_ITEMS)
		{
			productos.add(producto);
		}
		return this;
	}

	public List<T> getProductos()
	{
		return productos;
	}
}

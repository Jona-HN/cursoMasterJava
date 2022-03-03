package com.jona.almacen.mayoreo.productos;

import com.jona.almacen.mayoreo.Unidad;

import java.util.Arrays;

public class ProductoLimpieza extends Producto
{
	private String[] ingredientes;

	public ProductoLimpieza(String nombre, float precio, String descripcion, int contNeto,
							Unidad unidadCont, String marca, int unidades, String ... ingredientes)
	{
		super(nombre, precio, descripcion, contNeto, unidadCont, marca, unidades);
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", ingredientes=" + Arrays.toString(ingredientes);
	}
}

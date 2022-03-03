package com.jona.almacen.mayoreo.productos;

import com.jona.almacen.mayoreo.Unidad;

public class ProductoAlimenticio extends Producto
{
	private int calorias;

	public ProductoAlimenticio(String nombre, float precio, String descripcion, int contNeto,
							   Unidad unidadCont, String marca, int unidades, int calorias)
	{
		super(nombre, precio, descripcion, contNeto, unidadCont, marca, unidades);
		this.calorias = calorias;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", calorias = " + calorias + Unidad.GRAMOS.getAbrev();
	}
}

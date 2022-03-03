package com.jona.almacen.mayoreo.productos;

import com.jona.almacen.mayoreo.Unidad;

public class ProductoAlimenticioNoPerecedero extends ProductoAlimenticio
{
	private boolean enlatado;

	public ProductoAlimenticioNoPerecedero(String nombre, float precio, String descripcion, int contNeto,
										   Unidad unidadCont, String marca, int unidades, int calorias, boolean enlatado)
	{
		super(nombre, precio, descripcion, contNeto, unidadCont, marca, unidades, calorias);
		this.enlatado = enlatado;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				(enlatado ? "(Nota: está enlatado)" : "");
	}
}

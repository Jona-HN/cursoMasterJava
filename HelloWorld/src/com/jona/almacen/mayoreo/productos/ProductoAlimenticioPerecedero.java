package com.jona.almacen.mayoreo.productos;

import com.jona.almacen.mayoreo.Unidad;

import java.util.Date;

public class ProductoAlimenticioPerecedero extends ProductoAlimenticio
{
	private Date fechaVenc;
	private boolean caducado;


	public ProductoAlimenticioPerecedero(String nombre, float precio, String descripcion, int contNeto,
										 Unidad unidadCont, String marca, int unidades, int calorias, Date fechaVenc)
	{
		super(nombre, precio, descripcion, contNeto, unidadCont, marca, unidades, calorias);
		this.fechaVenc = fechaVenc;
	}

	public void setCaducado(Date fechaActual)
	{
		caducado = fechaActual.after(fechaVenc);
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", fecha de vencimiento = " + fechaVenc +
				" (" + (caducado ? "caducado" : "vigente") + ")";
	}
}

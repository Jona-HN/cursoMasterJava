package com.jona.almacen.mayoreo.productos;

import com.jona.almacen.mayoreo.Unidad;

public class Producto
{
	private String nombre;
	private float precio;
	private String descripcion;
	private int contNeto;
	private Unidad unidadesCont;
	private String marca;
	private int unidadesStock;
	private boolean disponible;
	private int id;

	private static int ultimoId;

	public Producto(String nombre, float precio, String descripcion, int contNeto,
					Unidad unidadCont, String marca, int unidades)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.contNeto = contNeto;
		this.unidadesCont = unidadCont;
		this.marca = marca;
		this.unidadesStock = unidades;
		disponible = unidades > 0;
		id = ++ultimoId;
	}

	public String getNombre()
	{
		return nombre;
	}

	public float getPrecio()
	{
		return precio;
	}

	public boolean isDisponible()
	{
		return disponible;
	}

	public int getId()
	{
		return id;
	}

	public int getUnidadesStock() { return unidadesStock; }

	public void incrementarUnidades(int cantidad)
	{
		unidadesStock += cantidad;
		disponible = unidadesStock > 0;
	}

	@Override
	public String toString()
	{
		return "Nombre ='" + nombre + '\'' +
				", precio=" + precio +
				", descripcion='" + descripcion + '\'' +
				", contNeto=" + contNeto + " " + unidadesCont.getAbrev() +
				", marca='" + marca + '\'' +
				", unidades=" + unidadesStock +
				", id=" + id;
	}
}

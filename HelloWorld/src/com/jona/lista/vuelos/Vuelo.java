package com.jona.lista.vuelos;

import java.util.Date;

public class Vuelo
{
	private String nombre;
	private String origen;
	private String destino;
	private Date fechaLlegada;
	private Integer cantPasajeros;

	public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, Integer cantPasajeros)
	{
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.fechaLlegada = fechaLlegada;
		this.cantPasajeros = cantPasajeros;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getOrigen()
	{
		return origen;
	}

	public String getDestino()
	{
		return destino;
	}

	public Date getFechaLlegada()
	{
		return fechaLlegada;
	}

	public Integer getCantPasajeros()
	{
		return cantPasajeros;
	}

	@Override
	public String toString()
	{
		return "Vuelo{" +
				"nombre='" + nombre + '\'' +
				", origen='" + origen + '\'' +
				", destino='" + destino + '\'' +
				", fechaLlegada=" + fechaLlegada +
				", cantPasajeros=" + cantPasajeros +
				'}';
	}
}

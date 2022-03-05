package com.jona.catalogo.productos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Libro extends Producto implements ILibro
{
	private Date fechaPublicacion;
	private String autor;
	private String titulo;
	private String editorial;

	public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial)
	{
		super(precio);
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	@Override
	public Date getFechaPublicacion()
	{
		return fechaPublicacion;
	}

	@Override
	public String getAutor()
	{
		return autor;
	}

	@Override
	public String getTitulo()
	{
		return titulo;
	}

	@Override
	public String getEditorial()
	{
		return editorial;
	}

	@Override
	public double getPrecioVenta()
	{
		return getPrecio() + (getPrecio() * 0.15);
	}

	@Override
	public String toString()
	{
		return String.format("%s escrito por %s (publicado el %s por %s) (precio: $%d, precio venta: $%.2f)",
				titulo, autor, getFechaPublicacionFormateada(), editorial, getPrecio(), getPrecioVenta());
	}

	protected String getFechaPublicacionFormateada()
	{
		var fechaLocal = fechaPublicacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		var formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return formato.format(fechaLocal);
	}
}

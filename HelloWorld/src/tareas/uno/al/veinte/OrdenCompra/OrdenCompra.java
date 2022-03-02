package tareas.uno.al.veinte.OrdenCompra;

import java.util.Date;

public class OrdenCompra
{
	private static int ultimo_id;
	private final int id;
	private final String descripcion;
	private Date fecha;
	private Cliente cliente;
	private Producto[] productos;
	private int num_producto;

	public OrdenCompra(String descripcion)
	{
		id = ++ultimo_id;
		this.descripcion = descripcion;
		productos = new Producto[4];
	}

	public OrdenCompra setFecha(Date fecha)
	{
		this.fecha = fecha;
		return this;
	}

	public OrdenCompra setCliente(Cliente cliente)
	{
		this.cliente = cliente;
		return this;
	}

	public int getId()
	{
		return id;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public Producto[] getProductos()
	{
		return productos;
	}

	public OrdenCompra addProducto(Producto producto)
	{
		if (num_producto < productos.length)
		{
			productos[num_producto++] = producto;
		}

		return this;
	}
	
	public double calcularTotal()
	{
		double total = 0;
		
		for (Producto p : productos)
		{
			total += p.getPrecio();
		}
		
		return total;
	}
}

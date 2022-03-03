package com.jona.almacen.mayoreo.relaciones;

import com.jona.almacen.mayoreo.personas.Cliente;
import com.jona.almacen.mayoreo.productos.Producto;

public class Pedido
{
	private Cliente cliente;
	private Producto producto;
	private int cantidadProd;
	private int descuentoPorc;

	public Pedido(Cliente cliente, Producto producto, int cantidadProd, int descuentoPorc)
	{
		this.cliente = cliente;
		this.producto = producto;
		this.cantidadProd = cantidadProd;
		this.descuentoPorc = descuentoPorc;
	}

	public int getCantidadProd()
	{
		return cantidadProd;
	}

	public Producto getProducto()
	{
		return producto;
	}

	public Cliente getCliente() { return cliente; }

	public int getDescuentoPorc() { return descuentoPorc; }

	@Override
	public String toString()
	{
		return "Detalles del pedido: " +
				"cliente=" + cliente.getNombreCompl() +
				", saldo= $" + cliente.getSaldo() +
				", producto=" + producto.getNombre() +
				", cantidadProd=" + cantidadProd + " unidades" +
				", precio unitario = $" + producto.getPrecio() +
				", descuentoPorc=" + descuentoPorc + "%";
	}
}

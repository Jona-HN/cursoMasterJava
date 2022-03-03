package com.jona.almacen.mayoreo.personas;

import com.jona.almacen.mayoreo.relaciones.Pedido;
import com.jona.almacen.mayoreo.productos.Producto;

import java.util.ArrayList;

public class Cliente extends Persona
{
	private int id;
	private float saldo;
	private ArrayList<Pedido> pedidos;

	private static int ultimoId;

	public Cliente(String nombre, String apellido, int edad, float saldo)
	{
		super(nombre, apellido, edad);
		this.id = ++ultimoId;
		this.saldo = saldo;
		pedidos = new ArrayList<>();
	}

	public Pedido getPrimeraCompra()
	{
		try
		{
			return pedidos.remove(0);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("El cliente " + id + "no ha hecho compras");
			return null;
		}
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void hacerPedido(Producto producto, int cantProd, int descuentoPorc)
	{
		Pedido c = new Pedido(this, producto, cantProd, descuentoPorc);
		pedidos.add(c);
	}

	public void modificarSaldo(float cantidad)
	{
		saldo += cantidad;
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", id=" + id +
				", saldo= $" + saldo;
	}
}

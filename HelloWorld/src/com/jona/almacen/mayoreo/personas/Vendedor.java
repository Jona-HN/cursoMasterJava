package com.jona.almacen.mayoreo.personas;

import com.jona.almacen.mayoreo.relaciones.Pedido;

public class Vendedor extends Persona
{
	private float salario;
	private int id;
	private float comisionPorVentas;

	private static int ultimoId;

	public Vendedor(String nombre, String apellido, int edad, float salario)
	{
		super(nombre, apellido, edad);
		this.salario = salario;
		id = ++ultimoId;
		comisionPorVentas = 0;
	}

	public void vender(Pedido pedido)
	{
		System.out.println(pedido.toString());
		float subtotal = pedido.getProducto().getPrecio() * pedido.getCantidadProd();
		float total = subtotal - subtotal * pedido.getDescuentoPorc() / 100;

		boolean prod_dispo = pedido.getProducto().isDisponible();
		boolean unidades_suf = pedido.getCantidadProd() <= pedido.getProducto().getUnidadesStock();
		boolean saldo_suf = pedido.getCliente().getSaldo() >= total;
		boolean pedido_valido = prod_dispo && saldo_suf && unidades_suf;

		if (pedido_valido)
		{
			pedido.getCliente().modificarSaldo(-total);
			pedido.getProducto().incrementarUnidades(-pedido.getCantidadProd());
			float comision = subtotal / 100;
			comisionPorVentas += comision;
			System.out.println("Venta hecha con éxito");
		}
		else if (!unidades_suf)
		{
			if (!prod_dispo)
			{
				System.out.println("No hay unidades del producto en existencia");
			}
			else
			{
				System.out.println("No hay unidades suficientes del producto");
			}
		}
		else
		{
			System.out.println("El cliente no cuenta con saldo suficiente");
		}

		System.out.println("Atendió " + getNombreCompl() + ". Vuelva pronto");
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", salario = $" + salario +
				", id=" + id +
				", comisionPorVentas = $" + comisionPorVentas;
	}
}

package com.jona.almacen.mayoreo;

import com.jona.almacen.mayoreo.personas.*;
import com.jona.almacen.mayoreo.productos.*;
import com.jona.almacen.mayoreo.relaciones.AlmacenMayoreo;

import java.util.Calendar;
import java.util.List;

public class TestAlmacen
{
	public static void main(String[] args)
	{
		Vendedor vendedor_uno = new Vendedor("Julio", "César", 35, 7000);
		Vendedor vendedor_dos = new Vendedor("Alejandro", "Magno", 33, 5000);

		Cliente cliente_uno = new Cliente("Homero", "Simpson", 65, 10000);
		Cliente cliente_dos = new Cliente("Harry", "Potter", 41, 20000);
		Cliente cliente_tres = new Cliente("Willy", "Wonka", 30, 15000);

		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.APRIL, 2);

		var rosquilla = new ProductoAlimenticioPerecedero("Rosquilla", 20, "Una dona común y corriente",
				50, Unidad.GRAMOS, "Springfield", 100, 100, cal.getTime());
		var escoba = new ProductoLimpieza("Nimbus 2000", 25000, "Una escoba común y corriente",
				1, Unidad.PIEZA,"JKR", 1);
		var chocolate_polvo = new ProductoAlimenticioNoPerecedero("Chocolate en polvo", 300,
				"Saco de chocolate en polvo", 1, Unidad.KILOGRAMO, "Wonka", 25,
				3000, false);

		var almacen = new AlmacenMayoreo();

		almacen.agregarProductos(rosquilla, escoba, chocolate_polvo);

		List<Persona> personas = List.of(vendedor_uno, vendedor_dos,
				cliente_uno, cliente_dos, cliente_tres);
		personas.forEach(persona -> System.out.println(persona.toString()));

		// Venta satisfactoria
		cliente_uno.hacerPedido(rosquilla, 10, 5);
		vendedor_uno.vender(cliente_uno.getPrimeraCompra());

		// Venta no satisfactoria (saldo insuficiente)
		cliente_dos.hacerPedido(escoba, 1, 0);
		vendedor_dos.vender(cliente_dos.getPrimeraCompra());

		// Venta satisfactoria (se incrementó el saldo del cliente)
		cliente_dos.modificarSaldo(5000);
		cliente_dos.hacerPedido(escoba, 1, 0);
		vendedor_dos.vender(cliente_dos.getPrimeraCompra());

		// Venta no satisfactoria (inventario del producto insuficiente)
		cliente_tres.hacerPedido(chocolate_polvo, 50, 10);
		vendedor_uno.vender(cliente_tres.getPrimeraCompra());

		// Ventas satisfactorias (incrementado el inventario del producto solicitado)
		System.out.println("Agregando 25 unidades más del último producto");
		chocolate_polvo.incrementarUnidades(25);
		cliente_tres.hacerPedido(chocolate_polvo, 25, 5);
		cliente_tres.hacerPedido(chocolate_polvo, 25, 5);
		vendedor_uno.vender(cliente_tres.getPrimeraCompra());
		vendedor_uno.vender(cliente_tres.getPrimeraCompra());

		// Venta no satisfactoria (no hay unidades del producto en existencia)
		cliente_tres.hacerPedido(chocolate_polvo, 1, 0);
		vendedor_uno.vender(cliente_tres.getPrimeraCompra());

		personas.forEach(persona -> System.out.println(persona.toString()));
	}
}

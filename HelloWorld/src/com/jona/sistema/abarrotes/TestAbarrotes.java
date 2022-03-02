package com.jona.sistema.abarrotes;

import java.security.NoSuchProviderException;

public class TestAbarrotes
{
	public static void main(String[] args)
	{
		Lacteo yogurt = new Lacteo("Yogurt Danonino", 30, 4, 10);
		Lacteo queso = new Lacteo("Queso cotija", 30, 1, 25);

		Fruta racimo_uvas = new Fruta("Racimo de uvas", 20.0, 30, "morado");
		Fruta naranja = new Fruta("Naranja americana", 5.0, 10, "naranja");

		Limpieza lysol = new Limpieza("Desinfectante Lysol", 50.0, "algún químico", 0.5);
		Limpieza pinosol = new Limpieza("Limpiador Pinosol", 30.0, "más químicos", 1);

		NoPerecible lata_frijol = new NoPerecible("Lata de frijoles", 20.0, 300, 50);
		NoPerecible lata_atun = new NoPerecible("Lata de atún", 25.0, 250, 80);

		Producto[] productos = new Producto[]{yogurt, queso, racimo_uvas, naranja, lysol, pinosol, lata_frijol, lata_atun};
		for (Producto producto : productos)
		{
			System.out.println("producto.getNombre() = " + producto.getNombre());
			System.out.println("producto.getPrecio() = " + producto.getPrecio());

			if (producto instanceof Lacteo)
			{
				Lacteo lacteo = (Lacteo) producto;
				
				System.out.println("lacteo.getCantidad() = " + lacteo.getCantidad());
				System.out.println("lacteo.getProteinas() = " + lacteo.getProteinas());
			}
			else if (producto instanceof Fruta)
			{
				Fruta fruta  = (Fruta) producto;

				System.out.println("fruta.getPeso() = " + fruta.getPeso());
				System.out.println("fruta.getColor() = " + fruta.getColor());
			}
			else if (producto instanceof Limpieza)
			{
				Limpieza limpieza = (Limpieza) producto;

				System.out.println("limpieza.getComponentes() = " + limpieza.getComponentes());
				System.out.println("limpieza.getLitros() = " + limpieza.getLitros());
			}
			else if (producto instanceof NoPerecible)
			{
				NoPerecible no_perecible = (NoPerecible) producto;

				System.out.println("no_perecible.getContenido() = " + no_perecible.getContenido());
				System.out.println("no_perecible.getCalorias() = " + no_perecible.getCalorias());
			}
		}
	}
}

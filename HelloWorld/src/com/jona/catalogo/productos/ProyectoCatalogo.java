package com.jona.catalogo.productos;

import java.util.Calendar;

public class ProyectoCatalogo
{
	public static void main(String[] args)
	{
		IProducto[] productos = new IProducto[5];

		productos[0] = new IPhone(13000, "Apple", "130X MAX PLUS OMEGA ALFA", "mutable (según tu estado de ánimo)");
		productos[1] = new TvLcd(5000, "LG", 50);
		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.NOVEMBER, 15);
		productos[2] = new Libro(279, cal.getTime(), "Claudia Ramírez Lomelí", "La ladrona de la luna", "Planeta");
		cal.set(1963, Calendar.MARCH, 1);
		productos[3] = new Comic(5, cal.getTime(), "Stan Lee, Sol Brodsky, Steve Ditko", "The Amazing Spider-Man", "Marvel", "Spider-Man", true);
		cal.set(2019, Calendar.JANUARY, 23);
		productos[4] = new Comic(5, cal.getTime(), "Kieron Gillen, Angel Unzeta, Jamal Campbell", "Star Wars 'El escape (parte cuatro)'", "Marvel", "Luke Skywalker", false);

		for (IProducto producto : productos)
		{
			System.out.println(producto);
		}
	}
}

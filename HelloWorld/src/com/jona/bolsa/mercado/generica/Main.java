package com.jona.bolsa.mercado.generica;

import com.jona.bolsa.mercado.generica.productos.*;

public class Main
{
	public static void main(String[] args)
	{
		var bolsaLacteos = new BolsaSupermercado<Lacteo>();
		bolsaLacteos.addProducto(new Lacteo("Lala", 49.99, 1, 100))
				.addProducto(new Lacteo("Nutrileche", 34.99, 1, 75))
				.addProducto(new Lacteo("Danonino", 29.99, 6, 30))
				.addProducto(new Lacteo("Yogurt", 29.99, 4, 40))
				.addProducto(new Lacteo("Queso fresco", 24.99, 1, 50));
		System.out.println("Bolsa de lácteos");
		imprimirDetalle(bolsaLacteos);

		var bolsaFrutas = new BolsaSupermercado<Fruta>();
		bolsaFrutas.addProducto(new Fruta("Durazno", 49.99, 1, "naranja"))
				.addProducto(new Fruta("Naranja", 29.99, 0.5, "naranja"))
				.addProducto(new Fruta("Uva", 59.99, 2, "morado"))
				.addProducto(new Fruta("Manzana", 14.99, 0.5, "rojo"))
				.addProducto(new Fruta("Kiwi", 74.99, 2.5, "café"));
		System.out.println("Bolsa de frutas");
		imprimirDetalle(bolsaFrutas);

		var bolsaLimpieza = new BolsaSupermercado<Limpieza>();
		bolsaLimpieza.addProducto(new Limpieza("Pinosol", 34.99, "Alcohol y esencias",
				1.5))
				.addProducto(new Limpieza("Lysol", 34.99, "Aire comprimido",
						1))
				.addProducto(new Limpieza("Suavitel", 29.99, "Amor de mamá",
						4))
				.addProducto(new Limpieza("Windex", 49.99, "Limpia vidrios",
						1.5))
				.addProducto(new Limpieza("Cloralex", 34.99, "Cloro", 2));
		System.out.println("Bolsa de productos de limpieza");
		imprimirDetalle(bolsaLimpieza);

		var bolsaNoPerecible = new BolsaSupermercado<NoPerecible>();
		bolsaNoPerecible.addProducto(new NoPerecible("Atún", 29.99, 300, 50))
				.addProducto(new NoPerecible("Frijoles", 24.99, 400, 80))
				.addProducto(new NoPerecible("Arroz", 59.99, 2, 40))
				.addProducto(new NoPerecible("Maseca", 39.99, 1, 140))
				.addProducto(new NoPerecible("Cereal", 69.99, 3, 100));
		System.out.println("Bolsa de productos no perecibles");
		imprimirDetalle(bolsaNoPerecible);
	}

	// ¿Cuál es la diferencia entre las siguientes dos firmas del método?:
//	1. private static void imprimirDetalle(BolsaSupermercado<? extends Producto> bolsa)
//	2. private static <T extends Producto> void imprimirDetalle(BolsaSupermercado<T> bolsa)

	// Aquí no se define un tipo T, en cambio, se utiliza un wildcard
	// en el tipo de dato del parámetro para que acepte objetos de tipo
	// Producto. Por lo tanto, dentro del método no puede usarse el tipo T
	// porque no está definido.
//	private static void imprimirDetalle(BolsaSupermercado<? extends Producto> bolsa)

	/* ************** Inicio del paréntesis ************** */
	// Esta firma es equivalente a la siguiente; sin embargo, al igual que
	// en la anterior, no se especifica un tipo T.
	// private static void imprimirDetalle(BolsaSupermercado<Producto> bolsa)
	/* ************** Fin del paréntesis ************** */

	// Aquí sí se define un tipo T que, a su vez, limita el uso del método a objetos
	// de tipo Producto (incluidos sus subtipos) gracias a la herencia. Por lo tanto,
	// dentro del método sí se puede usar el tipo T como tipo de dato (genérico).
	// Nota: si la clase estuviera parametrizada (es decir, el tipo T estuviera
	// declarado en la cabecera de la clase), no sería necesario declararlo
	// en la firma del método.
	// En otras palabras:
	// public class Main<T extends Producto>
	// {
	//     ...
    //     private static void imprimirDetalle(BolsaSupermercado<T> bolsa) { ... }
	// }

	// Personalmente, prefiero esta firma por dos razones:
	// 1. El tipo de dato que se maneja en la implementación del método es T, es decir, genérico.
	// 2. Permite limitar el tipo de objetos que el método admite simplemente
	//    cambiando o agregando más tipos a la lista de los que hereda T.
	// Cabe destacar que es importante definir el tipo de dato que hereda T;
	// de otra forma, para acceder a los métodos de un tipo de dato en concreto
	// se necesitaría verificar que el objeto sea instancia de esa clase.
	private static <T extends Producto> void imprimirDetalle(BolsaSupermercado<T> bolsa)
	{
		for (T producto : bolsa.getProductos())
		{
			System.out.print("Nombre = " + producto.getNombre());
			System.out.print("\tPrecio = " + producto.getPrecio());

			if (producto instanceof Lacteo)
			{
				System.out.print("\tCantidad = " + ((Lacteo) producto).getCantidad());
				System.out.print("\tProteinas = " + ((Lacteo) producto).getProteinas());
			}
			else if (producto instanceof Fruta)
			{
				System.out.print("\tPeso = " + ((Fruta) producto).getPeso());
				System.out.print("\tColor = " + ((Fruta) producto).getColor());
			}
			else if (producto instanceof Limpieza)
			{
				System.out.print("\tComponentes = " + ((Limpieza) producto).getComponentes());
				System.out.print("\tLitros = " + ((Limpieza) producto).getLitros());
			}
			else if (producto instanceof NoPerecible)
			{
				System.out.print("\tContenido = " + ((NoPerecible) producto).getContenido());
				System.out.print("\tCalorias = " + ((NoPerecible) producto).getCalorias());
			}
			System.out.println();
		}
	}
}

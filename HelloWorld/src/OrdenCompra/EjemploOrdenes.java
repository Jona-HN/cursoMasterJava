package OrdenCompra;

import java.util.Calendar;

public class EjemploOrdenes
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		cal.set(2022, Calendar.JANUARY, 23);
		var orden1 = new OrdenCompra("Compra 1");
		var cliente1 = new Cliente("Jonathan", "Herrera");
		orden1.setFecha(cal.getTime())
			  	.setCliente(cliente1)
				.addProducto(Producto.BUFFER)
			  	.addProducto(Producto.ESCUADRA)
				.addProducto(Producto.DESARMADOR)
				.addProducto(Producto.CINTA_METRICA);

		cal.set(2022, Calendar.APRIL, 7);
		var orden2 = new OrdenCompra("Compra 2");
		var cliente2 = new Cliente("John", "Doe");
		orden2.setFecha(cal.getTime())
				.setCliente(cliente2)
				.addProducto(Producto.LLAVE)
				.addProducto(Producto.MARTILLO)
				.addProducto(Producto.SIERRA_CIRCULAR)
				.addProducto(Producto.PINZAS);

		cal.set(2022, Calendar.JUNE, 10);
		var orden3 = new OrdenCompra("Compra 3");
		orden3.setFecha(cal.getTime())
				.setCliente(cliente1)
				.addProducto(Producto.SERRUCHO)
				.addProducto(Producto.NIVEL)
				.addProducto(Producto.VERNIER)
				.addProducto(Producto.TALADRO);

		OrdenCompra[] ordenes = {orden1, orden2, orden3};

		for (var orden : ordenes)
		{
			System.out.println("orden.getId() = " + orden.getId());
			System.out.println("orden.getCliente() = " + orden.getCliente().toString());
			System.out.println("orden.getFecha() = " + orden.getFecha());
			System.out.println("orden.getDescripcion() = " + orden.getDescripcion());

			for (Producto p : orden.getProductos())
			{
				System.out.println(p.toString());
			}

			System.out.println("orden.calcularTotal() = $" + orden.calcularTotal());
		}
	}
}

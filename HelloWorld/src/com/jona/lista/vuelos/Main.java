package com.jona.lista.vuelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		LinkedList<Vuelo> vuelos = new LinkedList<>();
		Calendar cal = Calendar.getInstance();

		String linea = "";
		String ruta_datos = "src/com/jona/lista/vuelos/data/vuelos.csv";

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(ruta_datos));

			// Se salta la primera línea
			br.readLine();

			while ((linea = br.readLine()) != null)
			{
				String[] datos_vuelo = linea.split(",");

				String fecha_llegada = datos_vuelo[3];
				String[] detalle_fecha = fecha_llegada.split(" ");
				int dia = Integer.parseInt(detalle_fecha[1]);
				int mes = switch (detalle_fecha[2]) {
					// Faltaría implementar los demás meses, pero
					// para el ejercicio sólo pondré agosto
					case "Ago" -> Calendar.AUGUST;
					default -> -1;
				};
				int anio = Integer.parseInt(detalle_fecha[3]);

				String hora_llegada = datos_vuelo[4];
				String[] detalles_hora = hora_llegada.substring(0, 5).split(":");
				int hora = Integer.parseInt(detalles_hora[0]);
				int minuto = Integer.parseInt(detalles_hora[1]);

				cal.set(anio, mes, dia, hora, minuto);

				vuelos.add(new Vuelo(
						datos_vuelo[0],
						datos_vuelo[1],
						datos_vuelo[2],
						cal.getTime(),
						Integer.parseInt(datos_vuelo[5])
				));
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("********* Lista de todos los vuelos (en el orden en que fueron registrados) *********");
		imprimirVuelos(vuelos);

		System.out.println("********* Ordenando ascendentemente por hora de llegada *********");
		vuelos.sort(new Comparator<Vuelo>()
		{
			@Override
			public int compare(Vuelo o1, Vuelo o2)
			{
				return o1.getFechaLlegada().compareTo(o2.getFechaLlegada());
			}
		});

		imprimirVuelos(vuelos);
		System.out.println("El último vuelo en llegar es: " + vuelos.getLast().toString());

		System.out.println("********* Ordenando descendentemente por no. de pasajeros *********");
		vuelos.sort(new Comparator<Vuelo>()
		{
			@Override
			public int compare(Vuelo o1, Vuelo o2)
			{
				return o2.getCantPasajeros().compareTo(o1.getCantPasajeros());
			}
		});

		imprimirVuelos(vuelos);
		System.out.println("El vuelo con menor no. de pasajeros es: " + vuelos.getLast().toString());
	}

	private static void imprimirVuelos(List<Vuelo> vuelos)
	{
		for (Vuelo vuelo : vuelos)
		{
			System.out.println(vuelo.toString());
		}
	}
}

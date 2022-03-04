package com.jona.administracion.zoologico;

import java.sql.SQLOutput;

public class EjemploMamiferos
{
	public static void main(String[] args)
	{
		Felino tigre = new Tigre("Selva", 2.0f, 8.0f, 80, "Tigre toño", 1.5f, 200,"Tigre de bengala");
		Felino leon = new Leon("Savana", 2.5f, 10.0f, 120, "Simba", 2.0f, 150, 25, 50);
		Felino guepardo = new Guepardo("Selva", 1.5f, 6.0f, 70, "Guepardus silvarius", 1.7f, 180);

		Canino lobo = new Lobo("Nieve", 1.0f, 5.0f, 60, "Lobus Alfus", "Gris plateado", 0.8f, 10, "Lobo de nieve");
		Canino perro = new Perro("Selva", 0.8f, 4.5f, 60, "Perrus Africanus", "Negro con manchas café", 0.7f, 50);

		Mamifero[] mamiferos = {tigre, leon, guepardo, lobo, perro};

		for (Mamifero mamifero : mamiferos)
		{
			System.out.println(mamifero.toString());
			System.out.println(mamifero.comer());
			System.out.println(mamifero.dormir());
			System.out.println(mamifero.correr());
			System.out.println(mamifero.comunicarse());
		}

	}
}

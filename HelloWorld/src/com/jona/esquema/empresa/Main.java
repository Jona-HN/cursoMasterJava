package com.jona.esquema.empresa;

public class Main
{
	public static void main(String[] args)
	{
		Cliente cliente = new Cliente("Cliente", "Nuevo", "1234", "Av. De los Clientes");

		Empleado emp_1 = new Empleado("Panfilo", "Filomeno", "5678", "Blvd. De los Empleados", 1500);
		Empleado emp_2 = new Empleado("Helen", "Chufe", "9876", "Blvd. De los Empleados", 1500);
		Empleado emp_3 = new Empleado("Armando", "Bronca", "5432", "Blvd. De los Empleados", 1500);

		Gerente gerente = new Gerente("Susana", "Horia", "4321", "Cjón. De los Gerentes", 3000);
		gerente.setPresupuesto(5000);

		Persona[] personas = new Persona[]{cliente, emp_1, emp_2, emp_3, gerente};

		for (Persona persona : personas)
		{
			System.out.println(persona.toString());
		}

		aumentarSalario(emp_1, 30);
		aumentarSalario(gerente, 50);
	}

	public static void aumentarSalario(Empleado empleado, int porcentaje)
	{
		System.out.println("Salario antiguo de " + empleado.getNombre() + ": $" + empleado.getRemuneracion());
		empleado.aumentarRemuneracion(porcentaje);
		System.out.println("Salario actual de " + empleado.getNombre() + ": $" + empleado.getRemuneracion());
	}
}

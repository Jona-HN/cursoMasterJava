package tareas.uno.al.veinte;

import java.util.Scanner;

public class DetalleDeFactura
{
    private String nombre;
    private double precio1;
    private double precio2;
    private double subtotal;
    private double impuesto;
    private double total;

    public DetalleDeFactura(){}

    @Override
    public String toString()
    {
        return "La factura " + nombre + " tiene un total bruto de " + subtotal +
                ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " +
                total;
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       DetalleDeFactura factura = new DetalleDeFactura();
       System.out.println("Ingrese el nombre de la factura: ");
       factura.nombre = sc.nextLine();
       System.out.println("Ingrese el primer precio: ");
       factura.precio1 = sc.nextDouble();
       System.out.println("Ingrese el segundo precio: ");
       factura.precio2 = sc.nextDouble();
       factura.subtotal = factura.precio1 + factura.precio2;
       factura.impuesto = factura.subtotal * 0.19;
       factura.total = factura.subtotal + factura.impuesto;
       System.out.println(factura.toString());
    }
}

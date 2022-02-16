import java.util.Scanner;

public class ProgramaManejoDeNombres
{
    public static void main(String[] args)
    {
        String[] nombres = new String[3];
        StringBuilder resultado = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String substring;

        System.out.println("Ingrese el primer nombre: ");
        nombres[0] = sc.nextLine();
        System.out.println("Ingrese el segundo nombre: ");
        nombres[1] = sc.nextLine();
        System.out.println("Ingrese el tercer nombre: ");
        nombres[2] = sc.nextLine();

        for(String nombre : nombres)
        {
            substring = "";
            substring = substring.concat(nombre.substring(1, 2).toUpperCase()
                    .concat(".").concat(nombre.substring(nombre.length() - 2)));
            resultado.append(substring).append("_");
        }

        resultado.deleteCharAt(resultado.length() - 1); // borra el último guión bajo
        System.out.println("resultado = " + resultado);
    }
}

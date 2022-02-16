import java.util.Scanner;

public class DosNumeros
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        resultado = (num1 > num2) ? num1 + ", " + num2 : num2 + ", " + num1;
        System.out.println(resultado);
    }
}

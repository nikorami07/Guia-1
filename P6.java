
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Soporte.Uno
 */
public class P6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de lados del poligono: ");

        double n = teclado.nextDouble();

        System.out.print("Introduzca la longitud del poligono: ");

        double s = teclado.nextDouble();

        double numerador = (n * (s * s));

        double deno1 = Math.PI / n;
        double deno2 = Math.toRadians(deno1);

        System.out.println("El area del poligono es: " + (numerador / (4 * Math.tan(deno2))));
    }
}

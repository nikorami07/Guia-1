/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.Scanner;

/**
 *
 * @author Soporte.Uno
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer valor: ");
        int a = teclado.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int b = teclado.nextInt();

        System.out.println("El resultado de las operaciones es:");

        System.out.println("La suma es: " + (a + b) + "\n");
        System.out.println("La resta es: " + (a - b) + "\n");
        System.out.println("La multiplicación es: " + (a * b) + "\n");
        System.out.println("La división es: " + (a / b) + "\n");
        System.out.println("El residuo del cociente: " + (a % b) + "\n");
        System.out.println("El logaritmo de 'a' es: " + (Math.log10(a)) + "\n");
        System.out.println("El resultado de la potencia de a^b es: " + (Math.pow(a, b)) + "\n");

    }
}


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
public class P4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor del radio: ");
        double r = teclado.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        double volumen = Math.pow(r, 1);

       

        System.out.println("El resultado del Area del circulo es: " + area);
        System.out.println("El resultado del Volumen de la esfera es : " + volumen);

    }
}

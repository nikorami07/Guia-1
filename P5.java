
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
public class P5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de la masa: ");

        double m = teclado.nextDouble();
        double c = 1;
        System.out.print("Introduzca el valor de la temperatura en grados celcius: ");
        double t = teclado.nextDouble();

        System.out.println("La cantidad total de energia es: " + (m * c * t)+" julios");

    }
}

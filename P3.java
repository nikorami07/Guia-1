
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
public class P3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la latitud de la primer ciudad: ");
        double t1 = teclado.nextDouble();
        System.out.print("Introduzca la longitud de la primer ciudad: ");
        double g1 = teclado.nextDouble();
        
        System.out.print("Introduzca la latitud de la segunda ciudad: ");
        double t2 = teclado.nextDouble();
        System.out.print("Introduzca la longitud de la segunda ciudad: ");
        double g2 = teclado.nextDouble();
        
        double a = Math.acos(Math.sin(t1));
        double b = Math.sin(t2);
        double c = Math.cos(t1);
        double d = Math.cos(t2);
        double e = Math.cos(g1-g2);

        System.out.println("La distancia entre las dos ciudades es de: " + (6371.07*a*(b+c)*d*e)+ " kilometros");
    }
    

}

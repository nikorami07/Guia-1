
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
public class P2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la eficiencia del combustible en MPG: ");
        double a = teclado.nextDouble();
        double b = 2.352;

        System.out.println("La eficiencia del combustible en LPK es: " + (b / a) + " litros por kilometro.");
    }

}

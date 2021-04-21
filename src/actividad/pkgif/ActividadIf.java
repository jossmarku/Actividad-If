/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkgif;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class ActividadIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner miConsola = new Scanner(System.in);
        
        int año = 0;
        
        System.out.println("Dime un año cualquiera:");
        año = miConsola.nextInt();
        
        if (año > 2021) {
            System.out.println("Faltan " + (año - 2021) + " años");
        } else if (año < 2021) {
            System.out.println("Han pasado " + (2021 - año) + " años");
        } else {
            System.out.println("Nos encontramos en dicho año");
        }
    }
    
}

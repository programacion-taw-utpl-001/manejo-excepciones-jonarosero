/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        
        System.out.printf("Su nombre es: %s\n", nombre);
        System.out.printf("Su edad es : %d\n", edad);
    }
    
}

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
public class Execepcion_Ciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        boolean seguir = true;
        int num;
        int v;
        do{
            try{
                System.out.println("Ingrese un numero a dividir");
                v = scan.nextInt();
                num = 10 / v;
            }catch (ArithmeticException e){
                System.err.println("La divison para 0 es Infinito ");
                seguir = false;
            }
            
        }while(seguir);
    }
    
}

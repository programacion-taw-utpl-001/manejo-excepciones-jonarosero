/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execpcion_Estudiante;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero_alumnos = 4;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        Estudiante[] lista = new Estudiante[4];
        double [] notas_matematicas = new double[4];
        double [] notas_sociales = new double[4];
        
        while (contador < numero_alumnos){
            try{
                System.out.println("Ingrese un nombre");
                String nombre = scan.nextLine();
                System.out.println("Ingrese apellido");
                String ap = scan.nextLine();
                Estudiante est = new Estudiante(nombre, ap);
                System.out.println("Ingrese la nota de matematicas");
                double mat = Double.parseDouble(scan.nextLine());
                System.out.println("Ingrese la nota de sociales");
                double sociales = Double.parseDouble(scan.nextLine());
                lista[contador]= est;
                notas_matematicas[contador] = mat;
                notas_sociales[contador] = sociales;
                contador++;
            }catch(NumberFormatException e){
                System.err.println("Error la nota no es un numero debera ingresar el ultimo alumno de nuevo");
            }
            
        }
        
        Asignacion asig = new Asignacion(lista, notas_matematicas, notas_sociales);
        System.out.println(asig);
        
    }
    
}

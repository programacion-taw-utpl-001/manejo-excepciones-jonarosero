/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execpcion_Estudiante;

/**
 *
 * @author USUARIO
 */
public class Asignacion {
    private Estudiante Lista_est[] ;
    private double [] notas_matematicas;
    private double [] notas_sociales;
    private double []prom;

    public Asignacion(Estudiante[] Lista_est, double[] notas_matematicas, double[] notas_sociales) {
        this.Lista_est = Lista_est;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }

    public Estudiante[] getLista_est() {
        return Lista_est;
    }

    public void setLista_est(Estudiante[] Lista_est) {
        this.Lista_est = Lista_est;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }
    
    public double promedio_matematicas(){
        double prom_matematicas = 0;
        for(int i = 0; i < notas_matematicas.length; i++){
            prom_matematicas += notas_matematicas[i];
        }
        prom_matematicas =  prom_matematicas / notas_matematicas.length;
        return prom_matematicas;
    }
    
    public double promedio_sociales(){
        double prom_sociales = 0;
        for(int i = 0; i < notas_sociales.length; i++){
            prom_sociales += notas_sociales[i];
        }
        prom_sociales =  prom_sociales / notas_sociales.length;
        return prom_sociales;
    }
    
    public double[] promedio_general(){
        this.prom = new double [this.Lista_est.length];
        for (int i = 0; i < prom.length; i++) {
            this.prom[i] = (this.notas_matematicas[i] + this.notas_sociales[i]) / 2;
        }
        return prom;
    }
    
    public String presentar(){
        String cadena = "";
        for (int i = 0; i < this.Lista_est.length; i++) {
            cadena +=  String.format("%s\n"
                    + "\tMatematicas: %.2f\n"
                    + "\tSociales: %.2f\n"
                    + "\tPromedio: %.2f\n\n", this.getLista_est()[i], this.getNotas_matematicas()[i], this.getNotas_sociales()[i], this.promedio_general()[i]);
            
        }
        return cadena;
    }

    @Override
    public String toString() {
        return String.format("Lista Estudiantes\n"
                + "%s\n"
                + "Promedios generales\n\n"
                + "Promedios de Matematicas: %.2f\n"
                + "Promedios de Sociales: %.2f\n", this.presentar(), this.promedio_matematicas(), this.promedio_sociales());
        
    }

    
    
}

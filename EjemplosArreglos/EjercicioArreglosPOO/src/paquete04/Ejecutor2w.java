/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2w {

    public static void main(String[] args) {
        double[] notas = {8, 9, 10, 6};
        String nombre = "Erick Rodas";
        
        LibretaCalificacion l2 = new LibretaCalificacion(nombre, notas);
        l2.establecerPromedio();
        l2.establecerPromedioCualitativo();
        /* 
        Si comentamos la linea 21, va a imprimir el promedio cuantitativo como 
        null.
        Ya que en ningun momento llamamos a la funcion por lo q no se le asigna 
        absolutalmente nada
        */
        
        System.out.printf("%s\n", l2);
    }
}

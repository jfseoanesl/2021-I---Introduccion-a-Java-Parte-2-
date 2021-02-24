/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g02.taller1;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Taller1 {
    
   public static void main(String[] arg){
       Scanner entrada = new Scanner(System.in);
       
       // ejemplo no 1
       System.out.print("Ingrese x:");
       int x = entrada.nextInt();
       System.out.printf("x = %.2f\n", (double)x);
       
       //Ejemplo No 2
       System.out.println("Menu de opciones \n 1. Leer Datos \n 2. Mostrar datos \n 3. Salir");
       
       
   }
    
}

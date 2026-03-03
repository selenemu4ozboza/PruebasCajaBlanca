/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ivan Kenyi
 */
public class Proyecto1 {
    
    static Random random = new Random();
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("===VIAJE INTERGALÁCTICO===");
        jugar(1,0);
        
    }
    public static void jugar( int casilla, int valorAnterior) {
        int opcion=0;
        Scanner sc=new Scanner(System.in);
        if (casilla ==33){
            System.out.println("! Caíste en el agujero negro ! GAME OVER");
            
        }
        if (casilla==42) {
            System.out.println("¡VICTORIA!");
        }
        if ( casilla==31) {
            System.out.println(" ¡OH NO, HAY EXTRATERRESTRES! TE MANDAREMOS A LA CASILLA 13");
            casilla = 13;
        }
        System.out.println("Te encuentras en la casilla: "+casilla);
        System.out.println("Quieres seguir tirando?");
        opcion=sc.nextInt();
        if(opcion==1){
        System.out.println("Tirando dados...");
        int d1= (int)(Math.random()*10);
        int d2 =  (int)(Math.random()*10);
        int d3 =  (int)(Math.random()*10);
        
        int posicionGalaxia =  reduce(d1+d2+d3);
        
        System.out.println(" La galaxia a la que avanzas es: " +posicionGalaxia);
        
        int diferencia = Math.abs ( posicionGalaxia - valorAnterior);
        if( diferencia>4) {
            System.out.println("Galaxias lejanas, NO avanzas");
        }
        else{
            System.out.println("Galaxias cercanes, AVANZAS");
            casilla+= diferencia;
        }
        if(casilla>42) {
         
            casilla=1;
        }
        jugar(casilla,posicionGalaxia);
        }
        
    }
    
    public static int reduce (int n) {
        if (n<10){
            return n;
        }
        return reduce((n/10)+(n%10));
    }
}

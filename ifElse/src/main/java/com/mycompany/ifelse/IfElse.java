/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ifelse;

/**
 *
 * @author juan bonilla
 */
public class IfElse {

    public static void main(String[] args) { //programa que determina que clase de formato tiene un programa en funcion de sus episodios
       int tolalEpisodes=1; // variable asiganada
       
       if (tolalEpisodes>1){  //aqui podemos observar que con el if se establecio una condicio si es cierta imprimira el mensaje
           System.out.println("Es una serie");
       }else if (tolalEpisodes==1){  // este se usa para indicar que si no se cumpla la anterior condicion imprima este mensaje
           System.out.println("Es una pelicula");
       }else{ // en caso de que ninguna de las anteriores condiciones sea verdadera imprimira este mensaje
           System.out.println("Debe tener al menos un episodio");
       }
    }
}

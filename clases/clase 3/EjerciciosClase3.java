
package javaapplication4;

import java.util.Scanner;


public class EjerciciosClase3 {
    
        public static void main(String[] args){
        
            ejercicio1();
            //ejercicio2();
            //ejercicio3();
        }

 public static void ejercicio1(){
        int partidosGanados;
        int partidosEmpatados;
        int puntosTotales;
        
        partidosGanados=1;
        partidosEmpatados=2;
        puntosTotales=(partidosGanados*3)+(partidosEmpatados*1);
        
         System.out.println("La cantidad de puntos Totales es " + puntosTotales);
    }
   
    public static void ejercicio2() {
        int golesEquipoA = 1;
        int golesEquipoB = 3;

       if (golesEquipoA > golesEquipoB) {
            System.out.println("Gano Equipo A");
        } else if (golesEquipoA == golesEquipoB) {
            System.out.println("Es un empate entre ambos equipos");
        } else {
            System.out.println("Gano Equipo A");
        }       
        

    }
    
    public static void ejercicio3() {

        int golesEquipoA;
        int golesEquipoB;

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el numero de goles del equipo A");
        golesEquipoA = scn.nextInt();
        System.out.println("Ingrese el numero de goles del equipo B");
        golesEquipoB = scn.nextInt();

        if (golesEquipoA > golesEquipoB) {
            System.out.println("Gano Equipo A");
        } else if (golesEquipoA == golesEquipoB) {
            System.out.println("Es un empate entre ambos equipos");
        } else {
            System.out.println("Gano Equipo B");
        }

    }
    
    public static void ejercicio4() {

        int puntaje = 0;
        char resultados[] = {'p', 'g', 'p', 'e', 'e'};
        for (char x : resultados) {
          
        if(x == 'g'){puntaje+=3;}
        if(x == 'e'){puntaje+=1;}
            
        /*switch (x) {
            case 'g' -> puntaje += 3;
            case 'e' -> puntaje += 1;
            case 'p' -> puntaje += 0;
         
        }*/
        
        

        }
        
        
        
        
        System.out.println(puntaje);

    
} }

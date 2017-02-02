/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ldeleijap.a04;

import java.util.Scanner;

/**
 *
 * @author luixm_000
 */
public class SPPLdeleijaPA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opEntrada;
     Scanner sc= new Scanner(System.in);
     double angulo,resultado;
     
        //Desplegar opciones
        System.out.println(" Introduza la opción deseada");
        System.out.println(" 1. Calcular seno");
        System.out.println(" 2. Calcular coseno");       
        System.out.println(" 3. Calcular tangente");       
        System.out.println(" 4. Salir");
        opEntrada= sc.nextInt();
        
     switch(opEntrada){
     case 1:
     
    System.out.println("Bienvenido al calculo de seno");
     mensajePedirAngulo();
     
     angulo= mensajePedirAngulo();
     resultado= Math.sin(angulo);
     System.out.println(" El seno es :" + resultado);
     break;       
    
     case 2:
     System.out.println(" Bienvenido al calculo de coseno");
     angulo= mensajePedirAngulo();
     resultado= Math.cos(angulo);
    System.out.println(" El coseno es :"+ resultado);
    break;
    
    case 3:
    System.out.println(" Bienvenido al calculo de tangente");
    angulo= mensajePedirAngulo();
    resultado= Math.tan(angulo);
    System.out.println(" La tangente es :"+ resultado);
    break;
    
    default:
    System.out.println("Adiós");
                                         
     }
      
      
    }
    
    static double mensajePedirAngulo(){
        // variables
        double angulo;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el angulo");
        angulo= sc.nextDouble();
        return angulo;
    }
    
}
    }
    
}

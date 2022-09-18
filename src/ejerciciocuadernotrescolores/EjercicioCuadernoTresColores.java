/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuadernotrescolores;

import java.util.Scanner; 

/**
 *
 * @author JESUS
 */
public class EjercicioCuadernoTresColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int hojasTotales;
        
        // Variables de salida
        int hojasRojas, hojasVerdes, hojasAzules;


        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CUADERNOS DE COLORES");
        System.out.println("--------------------");
        System.out.println(" ");
        
        System.out.print ("Introduce la cantidad de hojas del cuaderno: ");
        hojasTotales= teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        hojasRojas=   hojasTotales / 3 + (hojasTotales % 3 > 0 ? 1 : 0);
        hojasVerdes=  hojasTotales / 3 + (hojasTotales % 3 > 1 ? 1 : 0);
        hojasAzules=  hojasTotales / 3;
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------       
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ("Cantidad total de hojas del cuaderno: " + hojasTotales);
        System.out.println ("Cantidad de hojas rojas: "  + hojasRojas);
        System.out.println ("Cantidad de hojas verdes: " + hojasVerdes);
        System.out.println ("Cantidad de hojas azules: " + hojasAzules);
                
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");
    }
    
}

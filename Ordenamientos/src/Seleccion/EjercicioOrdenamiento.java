/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleccion;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EjercicioOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivos aplicacion = new Archivos();
        aplicacion.abrirArchivo();
        
        ArrayList<Integer> lista =  aplicacion.leerRegistros();
        
        int [] orde = aplicacion.transformar_arrayList_arreglo(lista);
        
        OrdenamientoSeleccion orden = new OrdenamientoSeleccion(orde);
        System.out.println(orden);
        orden.ordenar();
        System.out.println(orden);
        
        
        
        /* int[] valores = {10, 90, 1, 20, 4, 7};
      OrdenamientoSeleccion arregloOrden = new OrdenamientoSeleccion(valores);
      
      
      System.out.println( "Arreglo desordenado:" );
      System.out.println( arregloOrden ); // imprime arreglo desordenado

      arregloOrden.ordenar(); // ordena el arreglo

      System.out.println( "Arreglo ordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo ordenado*/
        
    }
    
}

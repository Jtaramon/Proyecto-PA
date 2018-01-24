package Insercion;

// Fig 16.9: PruebaOrdenamientoInsercion.java

import java.util.ArrayList;

// Prueba la clase de ordenamiento por inserci�n.
public class PruebaOrdenamientoInsercion {

    public static void main(String[] args) {
        // crea objeto para realizar el ordenamiento por inserci�n
        Archivos aplicacion = new Archivos();
        aplicacion.abrirArchivo();
        
        ArrayList<Integer> lista =  aplicacion.leerRegistros();
        int [] orde = aplicacion.transformar_arrayList_arreglo(lista);
        
        OrdenamientoInsercion ord = new OrdenamientoInsercion(orde);
        ord.sort();
        System.out.println(ord);
    } // fin de main
} // fin de la clase PruebaOrdenamientoInsercion


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
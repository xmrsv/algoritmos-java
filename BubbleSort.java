package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        
        int[] numeritos = {5, 1, 3, 7, 9, 0, 8, 4, 2, 6};
        int[] numeritosOrdenados;
        
        /**
         * Ordenamos el array y lo almacenamos en otra variable
         * Podemos reemplazar el mismo array pero lo haremos de forma ordenada
         */
        numeritosOrdenados = algoritmoBurbuja(numeritos);
        
        // Mostrar elementos del array
        for(int i: numeritosOrdenados) {
            System.out.print(i);
        }
        
        // Salto de linea, no es necesario
        System.out.println(""); 
    }
    
    
    /**
     * 
     * Esta funcion recibe un array de argumento
     * y retorna un array ordenado con el algoritmo de ordenamiento Burbuja
     * 
     * @param array a ordenar
     * @return array ordenado
     * 
     */
    public static int[] algoritmoBurbuja(int[] array) {
        
        int temporal;
        int arrayTamano;
        
        arrayTamano = array.length;

        while (true) {
            
            boolean cambio = false;

            for (int i = 1; i < arrayTamano; i++) {
                
                /**
                 * Comparamos el numero de la izquierda con el de la derecha
                 * si el numero de la izquierda es mayor al de la derecha:
                 * 1. Almacenamos el valor de x1 (numero de la izquierda) en una variable t (temporal).
                 * 2. Reemplazamos el valor de x2 (el numero de la derecha) por x1 (el numero de la izquierda).
                 * 3. Reemplazamos el valor de x2 por el valor de t.
                 * 4. Repetimos hasta que la condicion no se cumpla y llegemos al final del array.
                 */ 
                if ( array[i - 1] >  array[i]) {  
                    
                    temporal = array[i];      
                    array[i] = array[i - 1];
                    array[i - 1] = temporal;
                    cambio = true;
                }
            }
            
            // Rompemos el bucle while cuando lleguemos al final del array
            if (cambio == false) {
                break;
            }
        }
        // Es obvio pero retornamos el arreglo ordenado
        return array; 
    }
}

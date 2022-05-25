package javaapplication;

public class JavaApplication {

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
     * Esta funcion recibe un array de argumento
     * y retorna un array ordenado con el algoritmo de ordenamiento Burbuja
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
                 * si el numero de la izquierda es mayor al de la derecha
                 * almacenamos el numero de la izquierda en una variable temporal
                 * y reemplazamos el numero de la izquierda por el numero de la derecha
                 * y el de la derecha por el de la izquierda
                 * 3 2 4 5 
                 * a 
                 * 2 3 4 5
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

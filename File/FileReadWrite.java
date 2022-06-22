package File;

import java.io.*;

/**
 * @author Miguel A. Gonzales R.
 */
public class FileReadWrite {

    public static void main(String[] args) {
        bAppend("texto");
        bReader();
        System.out.println(countLines());
    }

   /**
     * Lee y Muestra Lineas.
     * Lee y muestra las lineas de un archivo.
     * @param arg Texto para escribir
     */
    public static void bReader() {
        try {
            String line;
            // Lector
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader
            // Recorre cada linea del archivo mientras su contenido no sea nulo
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Escribe Lineas.
     * Escribe texto en un archivo, no necesariamente existente.
     * @param arg Texto para escribir
     */
    public static void bWriter(String arg) {
        try {
            String line;
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(arg + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Leer Lineas.
     * Lee cuantas lineas tiene un archivo existente.
     * @return Devuelve la cantidad de lineas del archivo.
     */
    public static int countLines() {
        int n = 0;
        try {
            String line;
            // Inicia el archivo
            File file = new File("file.txt");
            // Inicia el escritor
            FileReader fileReader = new FileReader(file);
            // Lee el archivo
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            try {
                while ((line = bufferedReader.readLine()) != null) {
                    n++;
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
            return n;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } 
        return n;
    }

    /**
     * Agrega lineas.
     * Agrega lineas a un archivo existente.
     * @param arg Texto para agregar.
     */
    public static void bAppend(String arg) {
        try {
            // Inicializa y define el archivo.
            File file = new File("file.txt");
            // Iniciar el escritor en modo agregar (append)
            // FileWriter(file, TRUE <-----);
            // Flujo que conecta FileWriter al archivo
            FileWriter fileWriter = new FileWriter(file, true);
            // Conecta FileWriter a BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
            // Escribe, inicia el flujo.
            bufferedWriter.write(arg + "\n");
            // Cierra el flujo, hace un .flush() de forma automática.
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

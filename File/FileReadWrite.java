package File;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        agregarLineas("texto");
        leerArchivo();
        System.out.println(contarLineas());
    }

    /**
     * Leer Archivo.
     * Lee y muestra el texto del archivo.
     */
    public static void leerArchivo() {
        try {
            String line;
            // Crea la variable del archivo.
            File file = new File("file.txt");
            // Crea el lector FileReader, lo conecta con File (la variable del archivo).
            FileReader fileReader = new FileReader(file);
            // Crea el lector BufferedReader, lo conecta con FileReader (lector del archivo).
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader
            // Recorre cada linea del archivo mientras su contenido no sea nulo.
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Escribir Archivo.
     * Escribe o sobreescribe texto en un archivo.
     * @param arg Texto a escribir.
     */
    public static void escribirArchivo(String arg) {
        try {
            String line;
            // File writer
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Connect the FileWriter to the BufferedWriter
            bufferedWriter.write(arg + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Contar Lineas.
     * Lee cuantas lineas tiene un archivo existente.
     * @return Devuelve la cantidad de lineas del archivo.
     */
    public static int contarLineas() {
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
                // Si la linea no esta vacia, suma 1 a la variable entera "n"
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
     * Agregar lineas.
     * Agrega lineas a un archivo existente.
     * @param arg Texto para agregar.
     */
    public static void agregarLineas(String arg) {
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

package File;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {}

    /**
     * Leer Archivo.
     * Lee y muestra el texto del archivo.
     */
    public static void readf(String filename) {
        try {
            String line;
            
            File file = new File(filename + ".txt");
            FileReader freader = new FileReader(file);
            BufferedReader reader = new BufferedReader(freader);
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            // "Input/Output" Exception
        }
    }

    /**
     * Escribir Archivo.
     * Escribe o sobreescribe texto en un archivo.
     * @param arg Texto a escribir.
     */
    public static void writef(String filename, String text) {
        try {
            String line;
            
            File file = new File(filename + ".txt");
            FileWriter fwriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fwriter);
            
            writer.write(text + "\n");
            writer.close();
            
        } catch (IOException e) {
            // "Input/Output" Exception
        }
    }

    /**
     * Contar Lineas.
     * Lee cuantas lineas tiene un archivo existente.
     * @return Devuelve la cantidad de lineas del archivo.
     */
    public static int countl(String filename) {
        int i = 0;
        try {
            String line;
            File file = new File(filename + ".txt");
            FileReader freader = new FileReader(file);
            BufferedReader reader = new BufferedReader(freader);

            try {
                while ((line = bufferedReader.readLine()) != null) {
                    i++;
                }
            } catch (IOException ex) {
                // "Input/Output" Exception
            }
            return i;
        } catch (FileNotFoundException ex) {
            // "File not found" Exception
        } 
        return n;
    }

    /**
     * Agregar lineas.
     * Agrega lineas a un archivo existente.
     * @param arg Texto para agregar.
     */
    public static void appendl(String filename, String text) {
        try {
             File file = new File(filename + ".txt");
            FileWriter fwriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fwriter); 
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            // Exception
        }
    }
}

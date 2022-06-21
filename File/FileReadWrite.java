package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) {
        
        boolean life = true;
        int option;
	    Scanner in = new Scanner(System.in);
        
	    System.out.println("1. Crear y (sobre)escribe\n2. Agregar texto\n3. Leer\n0. Salir");
        option = in.nextInt();
        in.nextLine(); // Previene un errorcito del Scanner.
        
	    while (life) {
            
	        switch (option) {       
		        case 0:
                    life = false;
                    break;

                case 1:
                    System.out.print("Ingresa texto: ");
                    String wrt = in.nextLine();
                    bWriter(wrt);
                    life = false;
                    break;

                case 2:
                    System.out.print("Ingresa texto: ");
                    String apnd = in.nextLine();
                    life = false;
                    break;

                case 3:
                    bReader();
                    System.out.println("Ingresa cualquier tecla para salir");
                    in.nextLine();
                    life = false;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }

    // Lee el contenido del archivo.
    public static void bReader() {

	    try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file); // A stream that connects to the text file
            String line;
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader
            	
		    while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Display the file's contents on the screen, one line at a time
            }

            bufferedReader.close(); // Close the stream
        
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Crea y/o sobreescribe el archivo.
    public static void bWriter(String arg) {
        
        try {
        
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file); // A stream that connects to the text file
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Connect the FileWriter to the BufferedWriter
            bufferedWriter.write(arg + "\n");
            
            bufferedWriter.close(); // Close the stream
        
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    
    
    // Se supone que esta función deberia agregar texto 
    // sin reemplazar lo que ya contiene el archivo.
    // No lo hace por si acaso.
   
    /*
    public static void bAppender(String arg) {
        try {
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Connect the FileWriter to the BufferedWriter
            bufferedWriter.write(arg + "\n");            
            bufferedWriter.close(); // Close the stream
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    */
}


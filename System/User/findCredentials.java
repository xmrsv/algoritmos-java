package User;

import java.io.FileReader;
import java.io.BufferedReader;

public class findCredentials {
    
    public static void main (String[] args) {
        // code ...
    }
    
    /**
     * Find Credentials.
     * Compara las string dadas (username, password) con los datos
     * dados por el archivo.
     * @param credentials Cantidad de elementos que contiene el archivo (columnas).
     * @param usernameIndex Indice en el que se cuentra el nombre de usuario.
     * @param passwordIndex Indice en el que se cuentra la contraseña.
     * @param filename Nombre del archivo.
     * @param username Nombre de usuario.
     * @param password Contraseña
     * @return 
     */
    public boolean findCredentials(int credentials, int usernameIndex, int passwordIndex, String filename, String username, String password) {
        int found = 0;

        try {
            String line;
            String[] users = new String[credentials];

            File file = new File(filename + ".txt");
            FileReader freader = new FileReader(file);
            BufferedReader reader = new BufferedReader(freader);

            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");

                for (int i = 0; (tokenizer.hasMoreTokens()); i++) {
                    users[i] = tokenizer.nextToken();
                }
                if (users[1].equals(username) && users[5].equals(password)) {
                    found++;
                }
            }
        } catch (IOException e) {
            // "Input/Output" Exception
        }
        return found > 0;
    }
}

package User;

import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;

public class findCredentials {
    
    public static void main (String[] args) {
        // code ...
    }
    
    public boolean findCredentials(String filename, String username, String password) {
        int found = 0;

        try {
            int usersAmount = 6;
            String line;
            String[] users = new String[usersAmount];
            
            File file = new File(filename + ".txt");
            FileReader freader = new FileReader(file);
            BufferedReader reader = new BufferedReader(freader);

            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                
                for (int i = 0; (st.hasMoreTokens()); i++) {
                    users[i] = tokenizer.nextToken();
                }
                if (users[1].equals(username) && users[5].equals(password)) {               
                    found++;
                }
            }
        } catch (Exception e) {
            // Exception
        }
        return found > 0;
    }
}

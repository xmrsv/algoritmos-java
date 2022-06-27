package User;

import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;

public class findCredentials {
    
    public static void main (String[] args) {
        // code ...
    }
    
    public boolean findCredentials(String fcuser, String fcpass) {

        String username = fcuser;
        String password = fcpass;
        int found = 0;

        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] users = new String[6];

            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                
                for (int i = 0; (st.hasMoreTokens()); i++) 
                    users[i] = st.nextToken();
                
                if (users[1].equals(username) && users[5].equals(password)) 
                    found++;
                
            }
        } catch (Exception e) {
            showModal("Exception: " + e);
        }
        return found > 1;
    }
    
    public void showModal(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}

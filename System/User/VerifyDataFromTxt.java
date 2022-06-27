package System;

import java.io.*;

public class VerifyDataFromTxt {
    
    public static void main (String[] args) {
        String username = entradaTexto_usuario.getText();
        String password = String.valueOf(entradaContrasena_contrasena.getPassword());
        
        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            String[] users = new String[6];
            boolean run = true;
            
            while ((line = bufferedReader.readLine()) != null && run == true) {
                StringTokenizer st = new StringTokenizer(line, ",");
                for (int i = 0; (st.hasMoreTokens()); i++) {
                    users[i] = st.nextToken();
                }
                if (users[1].equals(username) && users[5].equals(password)) {
                    showModal("Datos correctos");
                    
                    System system = new System();
                    
                    this.setVisible(false);
                    system.setVisible(true);
                    run = false;
                } else {
                    showModal("Datos incorrectos");
                }
            }   
        } catch (Exception e) {
            showModal("Err: " + e);
        }
    }
    
    public void showModal(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}

package stringtokenizerjava;

import java.util.StringTokenizer;

public class StringToArray {
    public static void main(String[] args) {
        String text = "id,name,lastname,age,username,password";
    }

    public static String[] stringToArray(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, ",");
        String[] users = new String[6];
        while (tokenizer.hasMoreTokens()) {
            int i = 0;
            users[i] = tokenizer.nextToken();
            i++;
        }
        return users;
    }
}

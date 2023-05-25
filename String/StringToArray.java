package stringtokenizerjava;

import java.util.StringTokenizer;

public class StringToArray {
    public static void main(String[] args) {
        String text = "id,name,lastname,age,username,password";
        String[] words = stringToArray(text);
        
        for (String word: words) System.out.println(word);
    }

    public static String[] stringToArray(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string, ",");
        String[] users = new String[tokenizer.countTokens()];
        
        for (int i = 0; tokenizer.hasMoreTokens(); i++) users[i] = tokenizer.nextToken();

        return users;
    }
}

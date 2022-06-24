package String;

import java.util.StringTokenizer;

public class StringTokenizerJava {

    public static void main(String[] args) {
        String text = "Uno, dos, tres y cuatro";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        
        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        
        text = "123,user,password,age,name,lastname";
        
        tokenizer = new StringTokenizer(text, ",");
        
        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    } 
}

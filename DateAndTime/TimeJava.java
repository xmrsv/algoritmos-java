package DateAndTime;

import java.time.LocalTime;
import java.util.StringTokenizer;

public class TimeJava {

    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        System.out.println("Hora sin formatear " + time);
        
        StringTokenizer st = new StringTokenizer(String.valueOf(time), ":");
        
        String[] datas = new String[3];
        
        System.out.print("Hora formateada: ");
        
        for (int i = 0; (st.hasMoreTokens()); i++) {
            datas[i] = st.nextToken();
            System.out.print(datas[i] + " ");
        }
        System.out.print("\nHora formateada y limpiada: ");
        
        st = new StringTokenizer(datas[2], ".");
        datas[2] = st.nextToken();
    
        for(String data: datas) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}  

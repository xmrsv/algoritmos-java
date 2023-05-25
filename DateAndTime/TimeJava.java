package DateAndTime;

import java.time.LocalTime;
import java.util.StringTokenizer;

public class TimeJava {

    public static void main(String[] args) {
        String[] datas = new String[3];
        LocalTime time = LocalTime.now();
        
        System.out.println("Formato (hh mm ss.ssssss)");
        System.out.println("Hora sin formatear: \n" + time);
        
        StringTokenizer st = new StringTokenizer(String.valueOf(time), ":");
        
        System.out.println("Hora formateada (separadas en un array de strings, sin dos puntos [:]):");
        
        for (int i = 0; (st.hasMoreTokens()); i++) {
            datas[i] = st.nextToken();
            System.out.print(datas[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Hora formateada (segundos sin decimales): ");
        
        st = new StringTokenizer(datas[2], ".");
        datas[2] = st.nextToken();
    
        for(String data: datas) System.out.print(data + " ");
        
        System.out.println();
    }
}  

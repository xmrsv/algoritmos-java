public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 7, 9, 0, 8, 4, 2, 6};
        
        int c;

        System.out.print("Sin ordenar: ");
        
        for (int i : arr) System.out.print(i);
        
        System.out.println("");

        while (true) {
            boolean change = false;
            
            for (int i = 1; i < arr.length; i++) {   
                if (arr[i] < arr[i - 1]) {
                    c = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = c;
                    change = true;
                }
            }
            if (change == false) break;
        }
        
        System.out.print("Ordenado: ");
        
        for (int i : arr) System.out.print(i);
        
        System.out.println("");
    }
}

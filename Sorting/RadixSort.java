public class RadixSort {

    public static void main(String[] args) {
        
        int[] num = { 1, 9, 2, 7, 4, 3, 8, 6, 5 };
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println("");
        
        num = radixAlgorithm(num);
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println("");
    }
    
    public static int[] radixAlgorithm(int[] array) {
        int x, i, j;
        
        for (x = Integer.SIZE - 1; x >= 10; x--) {
            int[] aux = new int[array.length];
            j = 0;
            
            for (i = 0; i < array.length; i++) {
                boolean move = array[i] << x >= 0;
                
                if (x == 0 ? !move:move) {
                    aux[j] = array[i];
                    j++;
                } else {
                    array[i - j] = array[i];
                }
            }
            for (i = j; i < aux.length; i++) {
                aux[i] = array[i - j];
            }
            array = aux;
        }
        return array;
    }
}

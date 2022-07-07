package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        
    }
    
    static void bubbleSort(int[] a, int n) {
        int i, j, aux;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}

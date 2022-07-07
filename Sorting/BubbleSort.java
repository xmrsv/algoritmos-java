package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {9, 0, 1, 8, 2, 7, 3, 6, 4, 5};
        String[] names = {"Anais", "Gumball", "Darwin", "Nicolle", "Richard"};
        
        bubbleInt(numbers, numbers.length);
        bubbleString(names, names.length);
        
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        
        System.out.println();
        
        for(String name: names) {
            System.out.print(name + " ");
        }
        
        System.out.println();

    }

    static void bubbleInt(int[] a, int n) {
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

    static void bubbleString(String[] a, int n) {
        String aux;
        int i, j;

        for (i = 1; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
}

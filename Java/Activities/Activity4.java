package activities;

import java.util.Arrays;

public class Activity4 {

	static void ascendingSort(int array[]) {        
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] numbers = { 45, 12, 67,8, 37, 22, 9, 14, 2, 3 };
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(numbers));
        ascendingSort(numbers);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(numbers));
    }
}
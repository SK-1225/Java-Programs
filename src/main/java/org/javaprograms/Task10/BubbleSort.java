package org.javaprograms.Task10;
import java.util.Arrays;
public class BubbleSort {
        public static void bubbleSortTest(int arr[]) {
            Boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j] < arr[j - 1]) {
                        //Swap
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        flag = true;
                    }
                }
                if (!flag || flag == false) {
                    break;
                }
            }
        }
        public static void main(String[] args){

            int arr1[] = {100, 200, 5, 8, 30, 45, -10, 5, 5, 8, 10, 89};
            bubbleSortTest(arr1);
            System.out.println(Arrays.toString(arr1));
        }
}
package com.bl.dsprograms;

public class BubbleSort {
    public static void main(String[] args) {
            BubbleSort sort = new BubbleSort();
            int array[] = {3,7,2,9,5,1,4,0};
            sort.bubbleSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        public void bubbleSort(int[] array) {
            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > (array[j + 1])) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

        }

}

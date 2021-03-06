package arrays;

import java.util.Arrays;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {
     static int a;
     static boolean b;


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int[] array = new int[size];
        array[0] = 3;
        array[1] = 5;
        array[2] = 15;
        array[3] = 1;
        array[4] = 23;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
       // System.out.println(Arrays.toString(array));
        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int twoD[][] = new int[x][y];
        int k = 1;
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                twoD[i][j] = k;
                k *= 2;
            }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
       int n = array.length;
       int index = 0;
       int newArray[] = new int[n+1];
       int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            if(i == index){
                newArray[i] = valueToAdd;
            }else{
                newArray[i] = array[j];
                j++;
            }
        }
        newArray[index] = valueToAdd;
        System.out.println("Array after adding new first value - " + Arrays.toString(newArray));
        return null;

    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return b =  true;
            }
        }
        return b = false;
    }
        /**
         * @param array An array to search in.
         * @param value The value to search for.
         * @return the first index of value in the array, if array does not contain given element return -1.
         */
        public static int indexOf ( int[] array, int value){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return  a = (array[0]);
                }
                }
            return a = -1;
        }

        /**
         * Remove the element by the given index.
         * Print new array
         */
        public static void remove ( int[] array, int index){
            int[] result = new int[array.length - 1];
            for (int i = 0; i < index; i++) {
                result[i]= array[i];
            }
            for (int i = index; i< array.length-1; i++) {
                result[i] = array[i + 1];
            }
            System.out.print(Arrays.toString(result) +" ");
        }

        /**
         * Calculate and return sum of array's elements.
         */
        public static long sum ( int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum = " + sum);
            return 0;
        }


        /**
         * Get the max value from the array.
         */
        public static int getMax ( int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }}
            System.out.println("Max = " + max);
            return 0;
        }

        /**
         * Get the minimum value from the array
         * @return
         */
        public static int getMin (int[] array){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
            }}
                System.out.println("Min = " + min);
            return 0;
        }



        /**
         * Calculate average of array
         */
        public static int getAvg ( int[] array){
            int sum = 0;
            int avg =1;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            avg = sum / array.length;
            System.out.println("Avg = " + avg);
            return 0;
        }


    }
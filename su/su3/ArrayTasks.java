package su3;

import java.util.*;

public class ArrayTasks {
    // Task 1
    public static int[] initializeAndPrintArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    // Task 2
    public static void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Average is " + (double) sum / array.length);
    }

    // Task 3
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task 4
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Task 5
    public static void sortStringsByLength(String[] array) {
        Arrays.sort(array, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(array));
    }

    // Task 6
    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // returns index
            }
        }
        return -1; // element not found
    }

    // Task 7
    public static void countPositivesAndNegatives(int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : array) {
            if (num > 0) positiveCount++;
            else if (num < 0) negativeCount++;
        }
        System.out.println("Positives: " + positiveCount + ", Negatives: " + negativeCount);
    }

    // Task 8
    public static void printCommonElements(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        System.out.print("Common elements: ");
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num);
            }
        }
        System.out.println();
    }

    // Task 9
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    // Task 10
    public static int[] removeOccurrences(int[] array, int value) {
        return Arrays.stream(array).filter(num -> num != value).toArray();
    }

    // Task 11
    public static void sortArrayAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // Task 12
    public static boolean hasDuplicates(String[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                return true;
            }
        }
        return false;
    }


    // Task 13
    public static boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Task 14
    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k %= n;
        reversePart(array, 0, n - 1);
        reversePart(array, 0, k - 1);
        reversePart(array, k, n - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void reversePart(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Task 15
    public static int findSecondLargest(int[] array) {
        int[] uniqueSortedArray = Arrays.stream(array).distinct().sorted().toArray();
        if (uniqueSortedArray.length < 2) {
            return -1;
        }
        return uniqueSortedArray[uniqueSortedArray.length - 2];
    }

    // Task 16
    public static void unionAndIntersection(int[] array1, int[] array2) {
        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array1) {
            unionSet.add(num);
        }
        for (int num : array2) {
            if (unionSet.contains(num)) {
                intersectionSet.add(num);
            }
            unionSet.add(num);
        }
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}

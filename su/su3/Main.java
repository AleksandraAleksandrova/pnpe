package su3;

import static su3.ArrayTasks.*;

public class Main {
    public static void main(String[] args){
        int[] arr = initializeAndPrintArray(); //  1 do 10
        calculateAverage();
        System.out.println("Max is " + findMax(arr)); // 10
        System.out.println("Sum is " + sumArray(arr)); // 55
        String[] strings = {"abc", "a", "aaaaa", "ab"};
        sortStringsByLength(strings);
        System.out.println(searchElement(arr, 2)); // 1
        System.out.println(searchElement(arr, 200)); // -1
        int[] arr2 = {-2, 4, -6, 8};
        countPositivesAndNegatives(arr); // 10 positives 0 negatives
        countPositivesAndNegatives(arr2); // 2 positives 2 negatives
        printCommonElements(arr, arr2); // 4 i 8
        reverseArray(arr2); // 8 -6 4 -2
        int[] without5 = removeOccurrences(arr, 5);
        System.out.println("new array with arr elements without 5");
        for(int i : without5){
            System.out.print(i + " ");
        }
        System.out.println();
        sortArrayAscending(arr2); // -6 -2 4 8
        String[] strings2 = {"a", "a", "ba"};
        System.out.println(hasDuplicates(strings)); // false
        System.out.println(hasDuplicates(strings2)); // true
        int[] palindrome = {1,2,3,3,2,1};
        System.out.println(isPalindrome(palindrome)); // true
        System.out.println(isPalindrome(arr)); // false
        rotateArray(arr2, 3); // -6 -2 4 8 => -2 4 8 -6
        rotateArray(arr2, 1); // -2 4 8 -6 => -6 -2 4 8
        System.out.println(findSecondLargest(arr)); // 9
        System.out.println(findSecondLargest(arr2)); // 4
        // union 1 -2 2 3 4 5 -6 6 7 8 9 10
        // intersection 4 8
        unionAndIntersection(arr, arr2);
        // union 1 2 3 4 -2 -6 8
        // intersection 1 2 3
        unionAndIntersection(arr2, palindrome);
    }
}

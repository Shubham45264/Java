package Shubham;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        int[] array = new int[]{12, 14, 15, 16, 121};
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


        char[] nums = {'a', 'b', 'z', 'c', 'b', 'a'};
          //                       i   j
        //isPalindrome(nums);
        boolean n = isPalindrome(nums);
        System.out.println("the values is"+n);
//        int i = 0;
//        int j = nums.length-1;
//
//        while(i < j) {
//            if(nums[i] != nums[j]) {
//                System.out.println("Not a Palindrome");
//                break;
//            }
//            i++;
//            j--;
//        }

//        System.out.println("a Palindrome");

    }

     static boolean isPalindrome(char[] nums) {

         int i = 0;
         int j = nums.length-1;

         while(i < j) {
             if(nums[i] != nums[j]) {
                 return false;
             }
             i++;
             j--;
         }
         return true;
     }

}
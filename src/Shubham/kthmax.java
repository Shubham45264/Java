package Shubham;

import java.util.Arrays;
import java.util.Scanner;

public class kthmax {
    public static void main(String[] args) {
        int[] arr = new int[] {121,934,677,85,90};
        Arrays.sort(arr);
        System.out.println("The sorted array is" +Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of k:");
        int k = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println("The kth maximum number is:" +arr[arr.length-k]);
            break;
        }

        // to takea specific element from an array == >  arrayName[index];
        // arr.lengtn - k ==> index
        // arr[arr.length - k]

        // 85  90  121 677 934
        // 0    1   2   3   4

        // arr.length = 5
        // But, indexing starts from 0 , so it will ends at 4
        // < arr.length or <= arr.length-1

        // k = 1 , i.e. last element ==> nums.length-1

        // k = 2 , i.e. 2nd last => nums.length - 2

        // k = k , i.e. kth last => nums.length - k

        // Take value of K from user
        // sout(nums.length - k);



    }
}

package Shubham;


import java.util.Arrays;

public class SecondLargestArray {


    public static void find2largest(int arr[]) {
    int size = arr.length;
    if(size<2){
        System.out.println("Invalid input");
        return;
    }
    Arrays.sort(arr);
        System.out.println(arr[size-2]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2000, 525, 651, 78};
        find2largest(arr);
    }
}

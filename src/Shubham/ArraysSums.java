package Shubham;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArraysSums{
    static int arr[] = {1,2,3,4,5};
    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                + sum());



    }
}

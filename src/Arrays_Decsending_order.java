import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class Arrays_Decsending_order {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements:");
        n=a.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=a.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("elements of array sorted in descending order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }
        Arrays.toString(arr);
    }
}

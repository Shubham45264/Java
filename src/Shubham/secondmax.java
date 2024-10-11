package Shubham;

import java.util.Arrays;

public class secondmax{
    public static void main(String[ ] s){
      int [] nums = new int[] {12,43,56,347,87};
      //  Arrays.sort(nums);
       // int a = 10;
        System.out.println("the sorted array is" +Arrays.toString(nums));
        int max1 = nums[0];
      int max2 = nums[0];
        for(int i=0;i<nums.length;i++){
    System.out.println("The Elements in the array are " +nums[i]);
}
      for(int i=0;i<nums.length;i++){
          if(nums[i]>max1){
              max2=max1;
              max1=nums[i];
          }
          else if(nums[i]>max2){
              max2=nums[i];
          }
      }

        System.out.println("Max 1 : " + max1 + " , Max 2 : " + max2);
}
}
package Shubham;

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Please enter your number:");
        int n = sc.nextInt(),temp,rem,result=0,count=0;

        temp=n;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("The number of digits are: " +count);

        int temp2 = temp;
        while(temp!=0){
            rem = temp%10;
            result += (int) Math.pow(rem,count);
            temp /=10;

        }
        if(temp2==result){
            System.out.println("its a armstrong"+n);
        }
        else{
            System.out.println("not a arms"+n);
        }


    }
}

package Shubham;

import java.util.Scanner;

public class Showroom implements Models,Buyers{
    @Override
    public void model_name() {
        System.out.println("Mercedes");
    }

    @Override
    public void Colors() {
        System.out.println("Navy Blue");
    }

    @Override
    public void Year_of_usage() {
        System.out.println("2020");
    }

    @Override
    public void Buyer_name() {
        System.out.println("Ramu kaka");
    }

    @Override
    public void Address() {
        System.out.println("delhi");
    }

    @Override
    public void mode_of_payment() {
        System.out.println("Online Upi");
    }

    @Override
    public void Documents() {
        System.out.println("Aadhar,pan,photo and licence");
    }
}
class Data{
    public static void main(String[] args) {
        Showroom s1 = new Showroom();
        s1.model_name();
        s1.Colors();
        s1.Buyer_name();
        s1.mode_of_payment();

        int arr[] = {12,23,4,5,6,7,8,89};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Scanner m = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size = m.nextInt();
        int[] array = new int[size];
        System.out.println("elements of array");
        for(int i=0;i<size;i++){
            array[i] = m.nextInt();

        }
        System.out.println("array elemnets");
        for(int num :array){
            System.out.println(num + " ");
        }
        m.close();


    }
}

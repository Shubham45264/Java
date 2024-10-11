package VAISHNAVI;


import java.util.Scanner;


public class Intro {
    public static void main(String[] args) {


        System.out.print("Hello");
        System.out.println("Vaishnavi");


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int n = sc.nextInt();

        System.out.println("Number is : " + n);

        /*

        declare
        initialize
        Updation.....


        datatype name = value;

        int a = 10;
        a = 20;


        Numbers ==> Without decimal or With decimal

            Vary in Range

            byte short int long
               1   2     4    8


            float double

            4 nibble = 1 bit

            8 bits = 1 byte
            1024 byte = 1 kb
            1024 kb = 1 mb
            1024 mb = 1gb
            1024gb =  1tb
            kb < mb < tb .....

2 ^ bits-1 to  (2^ bits - 1) - 1

            char

            boolean  = 1 bit


         */

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        double n1 = 2147.54;
    }
}

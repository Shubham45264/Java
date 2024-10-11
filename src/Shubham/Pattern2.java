package Shubham;

public class Pattern2 {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {
            int space = 5 - rows;
            for (int counter = 1;counter <= space; counter++) {

                System.out.print(" ");
            }
            for (int star = 1; star <= rows; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }


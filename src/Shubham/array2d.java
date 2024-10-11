package Shubham;
import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int arrays[][] = {{1,2,3,4},{64,76,98,9},{65,8,78}};


            for(int rows = 0;rows<arrays.length; rows++){
                for(int cols=0;cols<arrays[rows].length;cols++){
                    System.out.println("rows :"+rows+"and cols"+cols+"=" +arrays[rows][cols]);

                }

            }
            for(int rows=0;rows<arrays.length;rows++){
                System.out.println(Arrays.toString(arrays[rows]));
            }

        }
    }

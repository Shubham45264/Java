package Shubham;

public class dimension {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {45,65,89},
                {87,9,80}};
        for(int rows=0;rows<a.length;rows++){
            {
                for(int cols=0;cols<a[rows].length;cols++){
                    System.out.println(a[rows][cols]);
                }
            }
        }
    }
}

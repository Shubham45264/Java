package Shubham;

public class palimdrome {
    //    class Main {
    public static void main(String[] args) {
        String str = "radar";

boolean m = isPalinderome(str);
        System.out.println("hdeg76y"+m);
    }

    static boolean isPalinderome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//    }


package Shubham;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Shubham";
        String str2 = "Shubham";
        for(int i=0;i<str1.length();i++)
        {
            System.out.println("The chracrters are: "+str1.charAt(i));
        }
        String name1 = new String("Shubham");
        String name2 = new String("Shubham");

//        System.out.println("str1 : " + str1);
//        System.out.println("name : " + name);

//        .equals()   and ==

        if(name1.equals(name2)) {
            System.out.println("Both string are same");
        }
        else {
            System.out.println("Not string the same");
        }

        int n1 = 10;
        int n2 = 10;

//        if(n1 == n2) {
//            System.out.println("Both are same");
//        }
//        else {
//            System.out.println("Not the same");
//        }
    }

}

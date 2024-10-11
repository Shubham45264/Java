//package Shubham;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class Wrapper {
//    public static void main(String[] args) {
//        //Primitive Types ==> short byte int long float double char boolean
//        // Wrapper classes
//        /*
//
//        byte ==> Byte
//        int ==> Integer
//        long ==> Long
//        float ==> Float
//        double ==> Double
//        boolean = Boolean
//        char ==> Character
//        short ==> Short
//
//         */
//
//        int intPrimi = 24;
//        Integer intObject = intPrimi;  // Implicitly
//        Integer intObjectExpli = Integer.valueOf(intPrimi);
//
//        char s = 'a';
//        Character charobj = s;
//        Character chatobject = Character.valueOf(s);
//        System.out.println("the char is :" + charobj);
//
//        byte a = 1;
//        Byte by = a;
//        Byte bytessss = Byte.valueOf(a);
//        System.out.println("the bytes are:" + by);
//
//        long ls = 1234323856;
//        Long l = ls;
//        Long losss = Long.valueOf(ls);
//        System.out.println("the long is:" + l);
//
//        boolean b = true;
//        Boolean BS = b;
//        Boolean Bss = Boolean.valueOf(b);
//        System.out.println(b);
//
//
//        System.out.println("intPrimi : " + intPrimi + " and intObject : " + intObject);
//        System.out.println("init: " + intObjectExpli);
//
//        {
//            // Size of the
//            // ArrayList
//            int n = 5;
//
//            // Declaring the ArrayList with
//            // initial size n
//            var arr1 = new ArrayList<Integer>(n);
//
//            // Declaring the ArrayList
//            ArrayList<Student> arr2 = new ArrayList();
//
//
//            // Printing the ArrayList
//            System.out.println("Array 1:" + arr1);
//            System.out.println("Array 2:" + arr2);
//
//            // Appending new elements at
//            // the end of the list
//            for (int i = 1; i <= n; i++) {
//                arr1.add(i);
//                arr2.add(i);
//            }
//
//            arr2.add("Doraemon");
//            arr1.add(null);
//
//            // Printing the ArrayList
//            System.out.println("Array 1:" + arr1);
//            System.out.println("Array 2:" + arr2);
//        }
//    }
//    }
//

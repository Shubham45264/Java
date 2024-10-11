package Shubham;


//class Pair {
//    Object x;
//    Object y;
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//class Pair<T, X>{
//    T x;
//    X y;
//}
public class TrialBro {
    public static void main(String[] args) {
//        Pair<Integer, String> p = new Pair<Integer, String>();
//
//        p.x = 12;
//
//        p.y = "Doraemon";
//
//        String word = (String) p.x;

//        [12, 45, 87, 12, 5, 56]  TARGET = 12  Ans : 2

        Integer nums[] = {12, 45, 87, 12, 5, 56};
        Integer target = 12;


        Map<Integer, String> m = new HashMap<>();

        System.out.println("Number of Occurences : " + occurences(nums, target));



//
//        Studentist s1 = new Studentist();
//        EnggStudent s2 = new EnggStudent();
//
//        s1 = s2;

//        ArrayList<Studentist> s1 = new ArrayList<Studentist>();
//        ArrayList<EnggStudent> s2 = new ArrayList<EnggStudent>();
//
//        s1 = s2;

//        ArrayList<? > s1 = new ArrayList<>();
//        ArrayList<EnggStudent> s2 = new ArrayList<EnggStudent>();
//
//        s1 = s2;

//        ArrayList<? extends Studentist> s1 = new ArrayList<>();
//        ArrayList<EnggStudent> s2 = new ArrayList<EnggStudent>();
//
//        s1 = s2;

        // ? extends Studentist  ==> Studentist or it's child  Upper Bound
        // lower bound  == Studentist -------..... ----Object


//        ArrayList<? super Studentist> s1 = new ArrayList<>();
//        ArrayList<Object> s2 = new ArrayList<>();
//
//        s1 = s2;

        Studentist s1 = new Studentist();
        Studentist s2 = new Studentist();
        Studentist s3= new Studentist();
        Studentist s4 = new Studentist();
        Studentist s5 = new Studentist();
        Studentist s6 = new Studentist();

        System.out.println("Count is : " + s2.count);





    }


//    static int occurences(int[] nums, int target) {
//        int count = 0;
//        for(int e : nums) {
//            if(e == target) {
//                count++;
//            }
//        }
//        return count;
//    }

/*

int[] nums;

// Each element type will be what == ?? In our case "int"
for(int i=0; i<nums.length; i++) {}

for(elementType i: nums)
 */
    // paramter type returnT
//
//
//
// Type name(paramters....)
    static<T> Integer occurences(T nums[], T target) {
        Integer count = 0;
        for(T e : nums) {
            if(e == target) {
                count++;
            }
        }
        return count;
    }

}


class Studentist {
    static int count;

    Studentist() {
        count++;
//        System.out.println("Object count is : " + count);
    }
}

class EnggStudent extends Studentist {

}


class ManagementStudent extends Studentist {}


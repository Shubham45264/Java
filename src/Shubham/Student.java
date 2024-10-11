package Shubham;

// https://www.geekster.in/articles/abstraction-in-java/#:~:text=Abstraction%20in%20Java%20refers%20to,tools%20to%20create%20our%20own.
abstract class Student{
    int id;
    String name;

    Student(){
        System.out.println();
    }

    Student(int i,String n){
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println("The student id is "+id+" "+"The student name is "+name);
    }
     abstract int marks();

    public static void main(String[] args) {
//        ShubhamInterface s1 = new ShubhamInterface();
//        ShubhamInterface s2 = new ShubhamInterface();
//        int n1=s1.marks();
//        int n2=s2.marks();
//        System.out.println(n1);
//        System.out.println(n2);

        ShubhDancer s1 = new ShubhDancer();
        s1.music();
        s1.study();
    }

}

//
//class Parent1 {
//    void playtMusic() {
//        System.out.println("Play Classic");
//    }
//}
//
//class Parent2 {
//    void playtMusic() {
//        System.out.println("Play Hip Hop");
//    }
//}
//
//class Child extends
//{
//
//    }

class Shubham extends Student{
    @Override
    int marks() {
        return 0;
    }
//    int marks(){
//        System.out.println("The total marks is");
//        return 90;
//    }

}



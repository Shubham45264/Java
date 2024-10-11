package Shubham;

public class Inheritance {
        void eat(){System.out.println("eating...");}
    }
    class Dog extends  Inheritance{
        void bark(){System.out.println("barking...");}
    }
    class BabyDog extends Dog{
        void bark(){System.out.println("Barking...");}
    }
    class TestInheritance2{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.bark();
            d.eat();
        }}


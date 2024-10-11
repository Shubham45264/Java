package Shubham;

public class Polymorphism {
    static class Operation {
        static int Multiply(int a, int b)
        {
            return a * b;
        }
        static double Multiply(double a, double b)
        {
            return a * b;
        }
    }
    class Multiplication{
        public static void main(String[] args)
        {
            System.out.println(Operation.Multiply(2, 4));
            System.out.println(Operation.Multiply(5.5, 6.3));
        }
    }

}

package Shubham;

public class Abstract {
    abstract class Bus
    {
        abstract void accelerate();
    }
    class Volvo extends Bus
    {
        void accelerate()
        {
            System.out.println("Volvo::accelerate");
        }
    }
    class Main
    {
        public void main(String args[])
        {
            Bus obj = new Volvo(); //Bus object =>contents of Volvo
            obj.accelerate();  //call the method
        }
    }
}

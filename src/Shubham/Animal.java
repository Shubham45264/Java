package Shubham;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dogg extends Animal {
    // Implementing abstract method
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // Implementing abstract method
    public void makeSound() {
        System.out.println("Meow");
    }
}

class himanshu  {
    public static void main(String[] args) {
        Animal dogg = new Dogg();
        Animal cat = new Cat();

        dogg.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow

        dogg.sleep(); // Output: Zzz
        cat.sleep(); // Output: Zzz
    }
}

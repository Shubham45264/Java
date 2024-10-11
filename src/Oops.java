public class Oops {
    public static void main(String args[]) {
        Cat c = new Cat();

        c.name="Stella";
        c.breed="persian";
        c.noofkittens=5;
        c.calling();
        c.category();
        c.kittens();
        System.out.println(c.breed);
        System.out.println(c.noofkittens);


    }
}

class Cat{
    String name;
    String breed;
    int noofkittens;

    void calling() {
        System.out.println("The name of the cat is" + name);
    }

    void category() {

        System.out.println("The breed of the cat is" + breed);
    }

    int kittens() {
        System.out.println("The no of kittens are:" + noofkittens);
        return noofkittens;
    }
}

//    class Animal {
//            Cat c1 = new Cat();
//            Cat c2 = new Cat();
//            Cat c3 = new Cat();
//        }
//    }




/*



main() {
func1()
---
}


func1() [
---
func2()
----
}




func2() {
---
func1()
---
}

// Issue : Stack Overflow

 */

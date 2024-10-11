package Shubham;

public class Methodoverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(12,34);
        System.out.println("the addition is" +a.add(12,34));
        a.add(12,12.5);
        System.out.println("the addition is" +a.add(12,12.5));
        a.add(13.5,78);
        System.out.println("The divison is" +a.add(13.5,78));
        a.add(12.5,12.5);
        System.out.println("tha answer" +a.add(12.5,12.5));

    }
}
class Addition{
    int a;
    int b;
    float d;
    float e;
    double f;
    double g;

    void add(){
    }

    int add(int a,int b){
        int num =a+b;
        return num;
//        return a + b;
    }

    float add(int a, float d){
        float sum = a+d;
        return sum;
    }

    float add(float e,int b){
        float n=e/b;
        return n;
    }

    float add(float e,float d){
        float m=e*d;
        return m;
    }

    double add(double f,double g){
        double mod=f%g;
       return mod;
    }
}

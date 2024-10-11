import java.util.Scanner;

public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int n = sc.nextInt(),temp,rem,result=0;
        temp=n;





//         int num;
//         while(n<0) {
//            num = n/10;
//            n++;
//         }


         int count = 0,c;

         // Keeping records of the number of digits encountered
//         int myNum = n;
         while(n > 0) {
             n /= 10;
             count++;
         }
        System.out.println("the number of digits are :" + count);
        while(temp!=0)  // temp > 0
        {
            rem = temp%10;
            result += Math.pow(rem,3);
            temp /= 10;

        }
        if(result == temp)
        System.out.println(temp +" Its an armstrong number");
        else
        System.out.println(temp +"Its not an armstrong number");

    }
}



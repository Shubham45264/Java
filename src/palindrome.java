import java.util.Scanner;

import static java.lang.Long.reverse;

public class palindrome {
        public static void main(String args[]){
           int r,sum=0,temp;
           int reverse;
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();

           temp=n;
           while(n>0)
            {
                r=n%10;   // getting last digit
                sum=(sum*10)+r;
                reverse(n/10);  // removing last digit

            }
           if(temp==sum){
               System.out.println("Its a palindrome number");
           }
           else{
               System.out.println("Its not a palindrome no");
           }

        }
    }


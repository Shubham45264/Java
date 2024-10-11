package Shubham;

public class Loops {
    public static void main(String[] args) {
        // percentage > 90 => your grade is A
        // percentage > 801 => your grade is A
        // percentage > 70 => your grade is A
        // percentage > 60 => your grade is A
        // percentage > 50 => your grade is A
        // or if <= 50 => you are fail

        //WAP using if else and switch case

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter the marks:");
//       int percentage = sc.nextInt();
//
//        switch (percentage) {
//
//            case 1:
//                System.out.println("Your marks are 90%");
//                break;
//            case 2:
//                System.out.println("Your marks are 80%");
//                break;
//            case 3:
//                System.out.println("Your marks are 70%");
//                break;
//            case 4:
//                System.out.println("Your marks are 60%");
//                break;
//            default:
//                System.out.println("you are promoted");
//        }


        for (int i = 1; i < 10; i++) {
            System.out.println("I : " + i);
            if (i == 5) {
                break;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (i == 5) continue;
            System.out.println("J : " + i);

        }


        //        if(percentage>90)
//        {
//            System.out.println("Your grade is A: ");
//        }
//        else if(percentage>80)
//        {
//            System.out.println("Your percentage is B: ");
//
//        }
//        else if(percentage>70)
//       {
//            System.out.println("Your percentage is C:");
//
//        }
//        else if(percentage>60)
//        {
//            System.out.println("your percentage is D:");
//
//        }
//        else{
//            System.out.println("Your fail!");
//        }
//
//
//    }
//}
//
//


        //Initialize ar


    }}
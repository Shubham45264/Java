package Shubham;

import java.util.regex.*;
import java.util.regex.Pattern;

public class REGEX {

    /*


    Pattern
    Matcher

     */

    public static void main(String[] args) {

        // Shubham   ==> Shubhamuiydtrdw

        String regex = "Shubham";
        String word = "Shubhamuiydtrdw";


        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(word);


        while(matcher.find()) {
            System.out.println("Found");
        }



    }
}

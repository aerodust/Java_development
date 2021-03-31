package integra;

import java.util.*;
public class wk5_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String alpha = "";
        switch (st){
            case "a" : alpha = "vowel";
                break;
            case "e" : alpha = "vowel";
                break;
            case "i" : alpha = "vowel";
                break;
            case "o" : alpha = "vowel";
                break;
            case "u" : alpha = "vowel";
                break;
            default: alpha = "consonant";
                break;
        }
        System.out.println(alpha);
    }
}

package integra;
import java.util.*;
public class wk4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(Character.isUpperCase(input.charAt(0)) == true ? "UpperCase": Character.isLowerCase(input.charAt(0))==true ? "LowerCase" : Character.isDigit(input.charAt(0)) ? "Digit":"Error");
    }
}

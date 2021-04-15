package integra;
import java.util.*;
public class wk7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stars = sc.nextLine().split(" ");
        int a = stars[0].length();
        int b = stars[1].length();
        int c = stars[2].length();
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        for (int i = 0; i < max; i++) {

            if (a < max) {
                if (i < a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            } else {
                System.out.print(stars[0].charAt(i));
            }

            if (b < max) {
                if (i < max - b) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            } else {
                System.out.print(stars[1].charAt(i));
            }

            if (c < max) {
                if (i < max - c) {
                    System.out.println(" ");
                } else {
                    System.out.println("*");
                }
            } else {
                System.out.println(stars[2].charAt(i));
            }


        }
    }
}

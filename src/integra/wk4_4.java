package integra;
import java.util.*;
public class wk4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buff = sc.nextLine();
        String[] array = buff.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        double determinant = (b * b - 4 * a * c);
        double root = Math.sqrt(determinant);
        if (determinant > 0){
            System.out.println("True");
            System.out.printf("%.2f\n",(double) Math.round(((-b + root)/(2*a)) * 100) / 100);
            System.out.printf("%.2f\n",(double) Math.round(((-b - root)/(2*a)) * 100) / 100);
        } else if (determinant == 0) {
            if ((double) (-b/(2*a)) % 1 == 0){
                System.out.println("True");
                System.out.printf("%.1f\n",(double) -b/(2*a));
                System.out.printf("%.1f\n",(double) -b/(2*a));
            } else {
                System.out.println("True");
                System.out.printf("%.2f\n",(double) Math.round(-b/(2*a) * 100) / 100);
                System.out.printf("%.2f\n",(double) Math.round(-b/(2*a) * 100) / 100);
            }

        } else {
            System.out.println("False");
        }
    }
}

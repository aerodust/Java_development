package integra;
import java.util.Scanner;
public class wk3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buff = sc.nextLine();
        String[] array = buff.split(" ");
        int r = Integer.parseInt(array[0]);
        int h = Integer.parseInt(array[1]);
        double v = (r * r * h * Math.PI)/3;
        System.out.println((double) Math.round(v*1000)/1000); // 소수점 3자리에서 반올림
    }
}

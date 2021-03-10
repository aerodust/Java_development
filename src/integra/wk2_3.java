package integra;
import java.util.*;
public class wk2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int temp = x;
        x = y; y = z; z = temp;
        System.out.printf("%d%n"+"%d%n"+"%d",x,y,z);
    }
}

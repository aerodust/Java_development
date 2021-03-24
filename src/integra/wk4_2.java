package integra;
import java.util.*;
public class wk4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String buff = sc.nextLine();
        String[] array = buff.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        int d = Integer.parseInt(array[3]);
        int buff1 = (a<b) ? a:b;
        int buff2 = (c<d) ? c:d;
        System.out.println((buff1 < buff2) ? buff1:buff2);
    }
}

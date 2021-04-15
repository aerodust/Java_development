package integra;
import java.util.*;
public class wk6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] arr = new String[2];
        arr[0] = Integer.toString(a/10);
        arr[1] = Integer.toString(a%10);
        String as= arr[0]+arr[1];
        int b = 10*(a%10) + ((a/10 + a%10))%10;
        String[] arr2 = new String[2];
        arr2[0] = Integer.toString(b/10);
        arr2[1] = Integer.toString(b%10);
        String bs= arr2[0]+arr2[1];
        int i = 1;
        boolean j = true;
        if (a<100){
            while(j){
                if(a == b){
                    j = false;
                    System.out.println(i);
                    //System.out.println("final"+bs);
                } else {
                    b = 10*(b%10) + ((b/10 + b%10))%10;
                    arr2[0] = Integer.toString(b/10);
                    arr2[1] = Integer.toString(b%10);
                    bs= arr2[0]+arr2[1];
                    i++;
                }
            }

        }
    }
}

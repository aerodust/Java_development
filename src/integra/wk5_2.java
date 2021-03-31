package integra;
import java.util.*;
public class wk5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] array = st.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        char c = array[1].charAt(0);
        //System.out.println(array[1].getClass());
        if (c == '+'){
            System.out.println(a + b);
        } else if (c == '-'){
            System.out.println(a - b);
        } else if (c == '*'){
            System.out.println(a*b);
        } else if ( c == '/'){
            if ( b == 0) {
                System.out.println("error");
            } else if (a%b == 0){
                System.out.printf("%.1f", (double) Math.round(a*100/b) / 100);
            }
            else{
                System.out.printf("%.2f", (double) Math.round(a*100/b) / 100);
            }
        }
    }
}

package integra;
import java.util.Scanner;
public class wk6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        boolean result = st.matches("^[0-9a-zA-z]*$"); // ^:start $: end *:all
        //System.out.println(result);
        if (result){
            for(int i = st.length() - 1 ; i >= 0; i--){
                int a = st.charAt(i);
                System.out.printf("%d",a);
            }
        }
    }
}

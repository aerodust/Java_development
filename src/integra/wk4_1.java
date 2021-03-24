package integra;
import java.util.*;
public class wk4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(int i=0; i < st.length(); i++){
            int asc =st.charAt(i);
            System.out.printf("%d",asc);
        }
    }
}

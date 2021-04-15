package integra;
import java.util.*;
public class wk6_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int star = sc.nextInt();
        if (star > 3) {
            int j = 0;
            for(int i = star; i >= 0; i-=j){
                //System.out.printf("%d  %d\n", i, j);
                if(i <= j){
                    while(i > 0){
                            System.out.print("*");
                            i--;
                    }
                }else{
                    for(int k = 0; k<=j ; k++){
                        if(j==k){
                            System.out.println("*");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                j++;
                //System.out.printf("%d  %d\n", i, j);
            }
        }
    }
}

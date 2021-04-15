package integra;
import java.util.*;
public class wk7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int total = Integer.parseInt(st);
        /*
        if(total >= 1 && total<=10){

        } else {

        }*/
        //System.out.println(total);
        String[] book = new String[total];
        for(int i = 0; i < total; i++) {
            String stk = sc.nextLine();
            if(stk.charAt(2) == 'S' || stk.charAt(2) == 'D' || stk.charAt(2) == 'H' || stk.charAt(2) == 'C'){
                book[i] = stk;
            }
        }

        for(int k = 0; k<total; k++){

            boolean changed = false;
            for(int j =0; j<total - 1 - k; j++){
                String temp;
                if(book[j].charAt(0) < book[j+1].charAt(0)){
                    temp = book[j];
                    book[j]=book[j+1];
                    book[j+1]=temp;
                    changed = true;
                } //
            }
        if (!changed){break;}
        }
        for (int h = 0; h < total; h++){
            System.out.println(book[h]);
        }
    }
}

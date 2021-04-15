package integra;

import java.util.*;
public class wk7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        //System.out.println(st.length());
        int detect = 0;
        int count = 0;
        // null = 0, blank = 32

        while(detect < st.length() ){
            if(st.charAt(detect) == 32){
                count++;
            }
            detect++;
        }

        if(count == 1){
            String[] arr = st.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            String buff = "";
            String tape = "";
            String tape2 = "";

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape2 += buff;
                }
            }

            String[] tp1 = tape.split(" ");
            String[] tp2 = tape2.split(" ");
            int[] book = new int[tp1.length + tp2.length];
            for(int i = 0; i<tp1.length; i++){
                book[i] = Integer.parseInt(tp1[i]);
            }
            for(int i =0; i<tp2.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length; j++){
                    if(Integer.parseInt(tp2[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length + i] = Integer.parseInt(tp2[i]);
                }
            }

            //System.out.println(Arrays.toString(book));

            for(int i = 0; i<50; i++){
                boolean print = true;
                for(int j = 0; j < book.length; j++){
                    if(i+1 == book[j]){
                        print = false;
                        break;
                    }
                }
                if(print){
                    System.out.print((i+1)+" ");
                }
            }

        }
        else if(count == 2 ){
            String[] arr = st.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            String buff = "";
            String tape = "";
            String tape2 = "";
            String tape3 = "";


            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape2 += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= c; i++) {
                if (c % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape3 += buff;
                }
            }

            String[] tp1 = tape.split(" ");
            String[] tp2 = tape2.split(" ");
            String[] tp3 = tape3.split(" ");
            int[] book = new int[tp1.length + tp2.length + tp3.length];
            for(int i = 0; i<tp1.length; i++){
                book[i] = Integer.parseInt(tp1[i]);
            }
            for(int i =0; i<tp2.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length; j++){
                    if(Integer.parseInt(tp2[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length + i] = Integer.parseInt(tp2[i]);
                }
            }
            for(int i =0; i<tp3.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length + tp2.length; j++){
                    if(Integer.parseInt(tp3[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length +tp2.length+ i] = Integer.parseInt(tp3[i]);
                }
            }

            //System.out.println(Arrays.toString(book));

            for(int i = 0; i<50; i++){
                boolean print = true;
                for(int j = 0; j < book.length; j++){
                    if(i+1 == book[j]){
                        print = false;
                        break;
                    }
                }
                if(print){
                    System.out.print((i+1)+" ");
                }
            }
        }
        else{
            String[] arr = st.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);

            String buff = "";
            String tape = "";
            String tape2 = "";
            String tape3 = "";
            String tape4 = "";


            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape2 += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= c; i++) {
                if (c % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape3 += buff;
                }
            }
            buff = "";
            for (int i = 1; i <= d; i++) {
                if (d % i == 0) {
                    buff = Integer.toString(i) + " ";
                    tape4 += buff;
                }
            }

            String[] tp1 = tape.split(" ");
            String[] tp2 = tape2.split(" ");
            String[] tp3 = tape3.split(" ");
            String[] tp4 = tape4.split(" ");
            int[] book = new int[tp1.length + tp2.length + tp3.length + tp4.length];
            for(int i = 0; i<tp1.length; i++){
                book[i] = Integer.parseInt(tp1[i]);
            }
            for(int i =0; i<tp2.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length; j++){
                    if(Integer.parseInt(tp2[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length + i] = Integer.parseInt(tp2[i]);
                }
            }
            for(int i =0; i<tp3.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length + tp2.length; j++){
                    if(Integer.parseInt(tp3[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length +tp2.length+ i] = Integer.parseInt(tp3[i]);
                }
            }
            for(int i =0; i<tp4.length; i++){
                boolean plus = true;
                for(int j = 0; j < tp1.length + tp2.length + tp3.length; j++){
                    if(Integer.parseInt(tp4[i]) == book[j]){
                        plus = false;
                    }
                }
                if(plus){
                    book[tp1.length +tp2.length+ tp3.length + i] = Integer.parseInt(tp4[i]);
                }
            }

            //System.out.println(Arrays.toString(book));

            for(int i = 0; i<50; i++){
                boolean print = true;
                for(int j = 0; j < book.length; j++){
                    if(i+1 == book[j]){
                        print = false;
                        break;
                    }
                }
                if(print){
                    System.out.print((i+1)+" ");
                }
            }
        }

    }
}

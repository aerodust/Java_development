package integra;

import java.util.Arrays;

public class Letter {
    public static void main(String[] args) {
        for(int i=0; i<=31; i++){
            if(i==0 || i ==31) {
                if(i==0){
                    System.out.print('+');}
                else {System.out.println('+');}
            } else {
                System.out.print('-');
            }
        }
        System.out.printf("| ChungNam National University |\n" +
                "|                              |\n" +
                "|    Computer Programming 1    |\n" +
                "|                              |\n" +
                "|          2021.03.03          |\n");

        for(int i=0; i<=31; i++){
            if(i==0 || i ==31) {
                if(i==0){
                    System.out.print('+');}
                else {System.out.println('+');}
            } else {
                System.out.print('-');
            }
        }
    }

}

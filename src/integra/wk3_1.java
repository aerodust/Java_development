package integra;

import  java.util.*;

public class wk3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine(); //공백을 포함한 숫자들을 받는 용도
        String[] array = buffer.split(" "); // 공백을 기준으로 문자열을 array로 변환
        int n1 = Integer.parseInt(array[0]);
        int n2 = Integer.parseInt(array[1]);

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2  + " " + n1 % n2);

    }
}

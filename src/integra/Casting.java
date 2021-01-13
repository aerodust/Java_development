package integra;

import java.util.Arrays;

public class Casting {
    public static void main(String[] args) {
        double a=1.1;
        double b = 1;
        System.out.println(b); // 실수형이므로 1.0으로 출력

        int e = (int) 1.1;
        System.out.println(e); // real number -> int, losed 0.1

        // 122 to String
        String f = Integer.toString(122);
        System.out.println(f);
        System.out.println(f.getClass());
    }
}

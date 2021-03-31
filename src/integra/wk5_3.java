package integra;
import java.util.*;
public class wk5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] array = st.split(" ");
        double height = Double.parseDouble(array[0]) / 100;
        //System.out.println(height);
        double weight = Double.parseDouble(array[1]);
        double BMI;
        if (weight % (height*height) == 0) {
            BMI = (double) Math.round(weight * 100 / (height*height)) /100;
            //System.out.printf("%.1f", BMI);
        } else {
            BMI = (double) Math.round(weight * 100 / (height*height)) / 100;
            //System.out.printf("%.2f\n", BMI);
        }
        if (BMI >= 23){
            System.out.println("over");
        } else if (BMI >= 18.5) {
            System.out.println("standard");
        } else {
            System.out.println("under");
        }
    }
}

package 연습1_자바시작하기;

import java.util.ArrayList;
import java.util.Arrays;

public class EX03 {
    public static void main(String[] args) {
        ArrayList<Double> importation = new ArrayList<>();
        importation.add(8.62);
        importation.add(10.23);
        importation.add(12.48);
        importation.add(7.82);
        importation.add(9.54);
        double result = 0;
        for (int i = 0; i < 5; i++) {
            result += importation.get(i);
        }
        System.out.println(result);

        double a = 8.62;
        double b = 10.23;
        double c = 12.48;
        double d = 7.82;
        double e = 9.54;
        System.out.println(a+b+c+d+e);
    }
}

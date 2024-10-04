package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_11형변환과final {
    public static void main(String[] args) {
        // 문자열을 정수로 변환
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        // 문자열을 실수로 변환
        String num2 = "3.123"; // 문자열
        double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        // 정수를 문자열로 변환.
        int n3 = 555;
        //String num3 = "" + n3; //문자열 더하기 숫자는 문자열이 됨
        String num4 = String.valueOf(n3); // 2. String.Valuof(정수 변수)
        // String num5 = Integer.toString(n3); // 3. Interger.toString(정수 변수)
        System.out.println(num4);

        //실수를 문자열로 변환
        double d5 = 456.789;
        String num6 = Double.toString(d5);
        System.out.println(num6);

        // 정수를 실수로 변환
        int n4 = 123;
        double d2 = n4;
        System.out.println(d2);

        //실수를 정수로 변환(바로 변환 되지 않기 때문에 (int)를 적용)
        double d3 = 123.456;
        int n5 = (int) d3; // 캐스팅(변환티입)
        System.out.println(d3);

        // 형변환시 주의점(변환될 타입과 문자열 내용이 틀리면 에러)
        String num7 = "123.456";
        // int n6 = Integer.parseInt(num7); -> Double.parseDouble(num7)


        // final 키워드는 값을 한 번만 설정 고정값 바꿀 수 없음.
        final int n7 = 123;
        // n7 = 456; final을 적용했기 때문에 다른 값으로 설정할 수 없음.

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a.add("c"); // 추가하는 것은 문제없음.
        System.out.println(a);
        // a = new ArrayList<>(); final을 적용했기 때문에 다른 값으로 설정할 수 없음.
    }
}

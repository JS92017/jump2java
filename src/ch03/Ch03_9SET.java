package ch03;

import java.util.Arrays;
import java.util.HashSet;

public class Ch03_9SET {
    public static void main(String[] args) {
        //set: list 중 중복되지 않음, 순서가 없다.
        HashSet<String> set = new HashSet<>(Arrays.asList("h", "e", "l", "l", "o"));
        System.out.println(set);


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // 교집합 구하기
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); // 교집합 수행(s2와 같은 요소만 남음)
        System.out.println(intersection); // 교집합 출력

        // 합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1); //s1과 같음
        union.addAll(s2); // s2를 더하고 중복음 제거
        System.out.println(union); // 합집합 출력

        // 차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);
        substract. removeAll(s2); // s1에서 s2를 삭제
        System.out.println(substract); // 차집합 출력

        // 기본 메소드 add: 값을 추가 할 때 사용
        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump ");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3);

        // 기본 메소드 addAll: 값을 한꺼번에 여러개 추가할 때 사용
        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList(" And", "Home"));
        System.out.println(s4);

        // 기본 메소드 remove: 특정 값을 제거할 때 사용
        s4.remove("Home");
        System.out.println(s4);

    }
}

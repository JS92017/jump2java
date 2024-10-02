package ch03;

public class Ch03_4문자열 {
    public static void main(String[] args) {
        // 숫자(int, double), 문자(char), 불린(boolean) => 기초자료형
        // 문자열은 기초자료형이 아님
        // String a = "Happy Java"; 객체를 생성하지 않음(리터럴)
        String a = new String("Happy Java"); //객체를 생성
        String b = "a";
        String c = "123";

        // 문자열은 리터럴 표기방식을 사용하는 것이 좋다.
        // 리터럴 표기 = 객체를 생성하지 않고 고정된 값을 그대로 대입.

        // 내장 메서드
        a = "hello";
        b = "java";
        c = "hello";
        // 문자열 비교 메서드 equals (참)
        System.out.println(a.equals(b)); //false
        System.out.println(a.equals(c)); // true

        // indexOf: 특정 문자열이 시작되는 위치(인덱스 값)
        // 자바에서는 숫자를 0부터 셈
        a = "Hello Java";
        System.out.println(a.indexOf("Java"));

        // contains: 특정 문자열이 포함되어 있는지 여부를 리턴
        System.out.println(a.contains("Java")); // true

        // charAt: 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.charAt(6)); // "J"

        // replaceAll: 특정 문자열을 다른 문자열로 바꿀 때
        System.out.println(a.replaceAll("Java", "World"));

        // substring: 문자열에서 특정 문자열을 뽑아낼 때 사용
        System.out.println(a.substring(0,5));

        // toUpperCase: 대문자로 표시
        System.out.println(a.toUpperCase());

        // split: 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        a= "a:b:c:d";
        String[] result = a.split(":");
        System.out.println(result);

        // 문자열 포매팅(문자열 안에 특정 타입값을 입력)
        System.out.println(String.format("나는 사과를 %s개 먹었다", "5"));

        // 숫자를 입력
        System.out.println(String.format("나는 사과를 %d개 먹었다.", 10));

        // 두 개이상 입력
        System.out.println(String.format("나는 사과를 %d개 먹고 아파서 %s일 약을 먹었다.", 5, "3"));

        // 문자열 포맷 코드(%s: 문자열, %c: 문자1개, %d: 정수, %f: 부동소수)

        // 문자열 포맷 정렬과 공백 %자릿수s %10d
        System.out.println(String.format("%10s", "하이"));

        // -공백
        System.out.println(String.format("%-10s펭수", "하이"));

        // 소수점 표현(.소수점자릿수 짤리는 숫자는 반올림)
        System.out.println(String.format("%.4f", 3.42135234));

        // 전체 자릿수와 소수점자리
        System.out.println(String.format("%10.4f", 3.42135234));

        //print는 출력 메소드, println은 한줄을 출력함.
        System.out.print("출력!");
        System.out.print("출력!");
        System.out.println("한줄출력!");
        System.out.println("한줄출력!");

        // printf: 문자열 포맷을 포함하는 출력 메소드
        // Strting.format 메소드를 포함
        System.out.printf("나는 오늘 아침에 사과 %d개를 먹었다.", 3);

    }
}

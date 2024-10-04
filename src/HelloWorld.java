public class HelloWorld {
    //     주석 ctrl+/(단축키)
//     클래스는 자바프로그래밍 기본이고 대문자로 시작
    public static void main(String[] args) {
//    메서드 : 프로그램 시작과 끝을 관리하는 함수
//    자동정렬 : ctrl + alt + l

        int score;
        score = 90;
        int result = score + 10;
        System.out.println(result);

        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간"+ " " + minute + "분");

        int total = hour *60 + minute;
        System.out.println(total + "분");
    }
}

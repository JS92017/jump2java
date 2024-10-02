package 연습1_자바시작하기;

public class EX08 {
    public static void main(String[] args) {
        int second = 7582;
        int minute = 60;
        int hour = second/minute;
        int remainder = second%minute;
        System.out.println(hour);
        System.out.println(remainder);
    }
}

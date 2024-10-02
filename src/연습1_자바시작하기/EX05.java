package 연습1_자바시작하기;

public class EX05 {
    public static void main(String[] args) {
        int euro = 52;
        int dollars = 32;

        double eurowon = 1281.62664;
        double dollarswon = 1091.70306;

        double result = 0;

        result = euro*eurowon + dollars*dollarswon;
        System.out.println(result);
    }
}

package 연습2_메소드;

public class Ex08_Audition {
    public static void main(String[] args) {
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double kateVocal = 9.2;
        double kateDance = 7.8;

        System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
        System.out.printf("kate의 오디션 결과: %s\n", test(kateVocal, kateDance));
    }
    public static String test(double vocal, double dance) {
        String test = (vocal*dance >=70)? "합격" : "불합격";
        return test;
    }
}

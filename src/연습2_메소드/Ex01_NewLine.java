package 연습2_메소드;

public class Ex01_NewLine {
    public static void main(String[] args) {
        System.out.println("라인 1");
        threeLines();
        System.out.println("라인 2");
    }

    private static void threeLines() {
        oneLine();
        oneLine();
        oneLine();
    }

    private static void oneLine() {
        System.out.println(); //한줄 띄움
    }
}

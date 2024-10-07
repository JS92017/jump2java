package 연습_메소드;

public class Ex09_Elevator {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 16;

        System.out.println(guide(a));
        System.out.println(guide(b));
        System.out.println(guide(c));
    }

    public static String guide(int a) {
        String result = "";
        if (a >= 11) {
            result = "고층 엘베";
        } else {
            result = "저층 엘베";

        }
        return result;
    }
}

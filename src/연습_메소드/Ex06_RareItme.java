package 연습_메소드;

public class Ex06_RareItme {
    public static void main(String[] args) {
        wear(2400,2000);
        wear(1200,3800);
        wear(2000,1200);
    }

    public static void wear(int a, int b) {
        if (a >= 2000) {
            if (b >= 2000) {
                System.out.println("장착");
            } else {
                System.out.println("마나 부족");
            }
        } else {
            System.out.println("체력 부족");
        }
    }
}
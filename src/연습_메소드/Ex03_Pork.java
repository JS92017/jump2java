package 연습_메소드;

public class Ex03_Pork {
    public static void main(String[] args) {
        int eat = 3;
        double result = porkKcal(eat);
        System.out.printf("삼겹살 %d인분: %.2f 칼로리",eat, result);

    }
    static double porkKcal(int eat){
        return eat * 5.179 *180;
    }
}

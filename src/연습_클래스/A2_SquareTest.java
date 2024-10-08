package 연습_클래스;

class Square{
    int lenght;
    int area(){
        return lenght*lenght;
    }
}

public class A2_SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.lenght = 4;
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.lenght, s.area());
    }
}

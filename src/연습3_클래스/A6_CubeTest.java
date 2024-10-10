package 연습3_클래스;
class Cube{
    int lenght;

    public Cube(int lenght) {
        this.lenght = lenght;
    }
    public int volume() {
        return lenght*lenght*lenght;
    }
    public int surfaceArea() {
        return 6*lenght*lenght;
    }
}


public class A6_CubeTest {
    public static void main(String[] args) {
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
        System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());
    }
}


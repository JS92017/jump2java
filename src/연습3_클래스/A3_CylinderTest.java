package 연습3_클래스;
class CylinderTest {
    int r;
    int h;
    double getVolume() {
        return Math.PI * r * r * h;
    }
    double getArea() {
        return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
    }
}

public class A3_CylinderTest {
    public static void main(String[] args) {
        CylinderTest sum = new CylinderTest();
        sum.r = 4;
        sum.h = 5;

        System.out.printf("원기둥의 부피: %.2f\n", sum.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", sum.getArea());
    }
}
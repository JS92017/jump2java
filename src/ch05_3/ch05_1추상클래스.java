package ch05_3;

abstract class Animal {
    // 필드변수
    int a = 0;
    String k = "동물";

    // 추상 메소드
    public abstract void color();
    public abstract void height();

    // 일반 메소드
    public void printName(String name){
        System.out.println(name);
    }
}

// 추상클래스를 상속받은 클래스는 추상메서드를 구현해야함(에러남)
class Cat extends Animal {
    @Override
    public void color() {
        System.out.println("고양이 색");
    }

    @Override
    public void height() {
        System.out.println("고양이 키");
    }
}

public class ch05_1추상클래스 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color();
        cat.height();
        cat.printName("고양이");
    }
}

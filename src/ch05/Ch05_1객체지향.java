package ch05;

/**
 *  별도의 계산기 클래스
 */
class Calculator{
    int result = 0;

    // 클래스 안의 함수를 메소드라 함

    /**
     * 정수를 입력해 더해 준 결과 값을 리턴
     * @param num 입력 정수
     * @return result 결과
     */
    int add(int num){
        result += num;
        return result;
    }
}

class Animal{
    String name; // 객체변수

    void setName(String name){
        this.name = name;
    }
}

public class Ch05_1객체지향 {
    public static void main(String[] args) {
        Calculator  cla1 = new Calculator();
        Calculator  cla2 = new Calculator();
        System.out.println(cla1.add(3));
        System.out.println(cla1.add(4));

        System.out.println(cla2.add(3));
        System.out.println(cla2.add(7));

        // 클래스로 객체(object)를 만든다.
        // 클래스로 만든 객체를 인스턴스(intstance)라고 한다.
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal pig = new Animal();

        cat.setName("고양이");
        System.out.println(cat.name);
        dog.setName("강아지");
        System.out.println(dog.name);
    }
}

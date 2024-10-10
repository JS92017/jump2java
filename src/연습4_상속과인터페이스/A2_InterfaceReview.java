package 연습4_상속과인터페이스;

import java.util.ArrayList;
import java.util.List;

interface Soungding{
    void sound(); // 소리내기 추상메서드 0개의 사용위치
}

class Dog implements Soungding{
    public void sound(){
        System.out.println("Dog: 멍멍!");
    }
}

class Baby implements Soungding{
    public void sound(){
        System.out.println("Baby: 응애!");
    }
}

class Tiger implements Soungding{
    public void sound(){
        System.out.println("Tiger: 어흥!");
    }
}

class Robot implements Soungding{
    public void sound(){
        System.out.println("Robot: 삐빕!");
    }
}

public class A2_InterfaceReview {
    public static void main(String[] args) {
        Soungding dog = new Dog();
        Soungding baby = new Baby();
        Soungding tiger = new Tiger();
        Soungding robot = new Robot();

        //ArrayList에 넣기
        ArrayList<Soungding> list = new ArrayList<Soungding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        for (Soungding s : list) {
            s.sound();
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }
    }
}

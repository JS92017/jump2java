package ch05_2;
interface Predator{
    // 추상메서드 (구현이 되지 않은 메서드로 {몸통} 없음)
    String getFood();
}
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Tiger extends Animal implements Predator{

    @Override
    public String getFood() {
        return "사과";
    }
}
class Lion extends Animal implements Predator{

    @Override
    public String getFood() {
        return "바나나";
    }
}
class ZooKeeper{
        public void feed(Predator p){
            System.out.println("먹이주기: " + p.getFood());
        }
}

public class Ch05_1인터페이스 {
    public static void main(String[] args) {
        Tiger 호랑이 = new Tiger();
        Lion 사자 = new Lion();
        ZooKeeper z = new ZooKeeper();
        
        z.feed(호랑이); // 인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(사자);

    }
}

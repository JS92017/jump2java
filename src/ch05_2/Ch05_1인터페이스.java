package ch05_2;
interface Predator{
    // 추상메서드 (구현이 되지 않은 메서드로 {몸통} 없음)
    public String getFood();
    // 디폴트 메서드 (실제 구현된 메서드 앞에 default 표시)
    default void printFood(){
        System.out.printf("내 사료는: %s다\n", getFood());
    }
}
interface Barkable{
    void bark();
}

class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }

    // 하나의 객체가 여러 자료형 타입 Tiger 와 Lion 은 Animal 타입 선언
    // 호랑이와 사자타입의 메소드를 따로 만들 필요가 없음.
    void barkAnimal(Animal animal) {
        // instanceof 는 객체가 클래스 타입과 같으면 참 아니면 거짓
        if(animal instanceof Tiger){
            System.out.println("어흥~~");
        } else if (animal instanceof Lion){
            System.out.println("으르렁~~");
        }
    }
}

class Tiger extends Animal implements Predator, Barkable{
    @Override
    public String getFood() {
        return "사과";
    }

    @Override
    public void bark() {
        System.out.println("호랑이는 어흥");
    }
}

class Lion extends Animal implements Predator, Barkable{
    @Override
    public String getFood() {
        return "바나나";
    }

    @Override
    public void bark() {
        System.out.println("사자는 으르렁");
    }
}

class ZooKeeper{
            // 인터페이스 Predator 를 구현한 객체를 입력가능
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
        // Predator p = new Predator() 인터페이스를 바로 객체 안됨
        Predator p1 = new Tiger();
        p1.printFood(); //디폴트 메서드
        Predator p2 = new Lion();
        p2.printFood();

        Animal animal = new Animal();
        animal.barkAnimal(호랑이);
        animal.barkAnimal(사자);
    }
}

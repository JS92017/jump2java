package ch05;

// 부모 클래스
class Anima{
    String name;
    void setName(String name){
        this.name = name;
    }
}

// 자식 클래스 Anima 클래스를 상속
class Dog extends Anima{
    
    // 생성자는 클래스명과 똑같고 리턴이 없음
    // 그 중에 디폴트 생성자는 입력변수가 없음(생략가능)
    Dog(){
        System.out.println("도그객체 생성!");
    }
    
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog{
    @Override // 없어도 상관없음
    void sleep() {
            System.out.println(this.name + " zzz in Home");
        }
        // 메서드는 이름외에 리턴타입과 입력변수가 똑같지 않으면 새로운 매서드임
        void sleep(int hour){
            System.out.println(this.name + " zzz in Home " + hour + "시간");
        }
    }

public class Ch05_3상속 {
    public static void main(String[] args) {
        // Anima a = new Dog();  상속관계일 때 부모타입으로 선언 가능
        // Dog b = new Anima(); 자식타입 선언하고 부모객체는 안됨
        Dog d = new Dog();
        d.setName("퍼피");
        System.out.println(d.name);
        d.sleep();

        // 메서드 오버라이딩: 부모메서드와 똑같은 이름의 메서드를 새로만듬
        HouseDog h = new HouseDog();
        h.setName("해피");
        h.sleep();

        // 메서드 오버로딩(overloading) : 이름은 같지만 입력변수가 틀리다.
        h.sleep(10);
    }
}

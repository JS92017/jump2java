package 연습4_상속과인터페이스;
class Car{
    protected String name;

    public Car(String name){
        this.name=name;
    }
    public String toString(){
        return String.format("[자동차]{name: %s}",name);
    }
}
class Truck extends Car{
    double ton;
    public Truck(String name , double ton) {
        super(name);
        this.ton=ton;
    }
    public String toString(){
        return String.format("[트럭]{name: %s, ton: %.1f}",name,ton);
    }
}


public class B2_CarTest {
    public static void main(String[] args) {
        Car smallCar = new Car("티코");
        Car truck = new Truck("봉고",1.5);
        Car[] cars = {smallCar,truck};
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}

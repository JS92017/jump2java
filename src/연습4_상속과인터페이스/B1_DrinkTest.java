package 연습4_상속과인터페이스;
class Drink {
    String name;
    int price;
    public void order(){
        System.out.println("주문되었습니다.");
    }
}

class Juice extends Drink{
}

class Coffee extends Drink{
}

class Beer extends Drink{
}

class Water extends Drink{
}

class Tea extends Drink{
}

public class B1_DrinkTest {
    public static void main(String[] args) {
        Drink juice = new Juice();
        Drink coffee = new Coffee();
        Drink beer = new Beer();
        Drink water = new Water();
        Drink tea = new Tea();

        Drink[] drinks = {juice, coffee, beer, water, tea};
        for (Drink drink : drinks) {
            drink.order();
        }
    }
}

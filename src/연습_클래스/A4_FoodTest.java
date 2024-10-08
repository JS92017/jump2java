package 연습_클래스;
class Food{
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name: " + name + ", price: " + price + "원");
    }
}

public class A4_FoodTest {
    public static void main(String[] args) {
        Food a = new Food("치킨", 18000);
        Food b = new Food("피자", 28000);
        Food c = new Food("초밥세트", 22000);

        Food[] foods = { a, b, c };

        for(int i = 0; i<foods.length; i++) {
            System.out.println(foods[i].toString());
        }
    }
}

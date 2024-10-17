package 연습5_자바API;

import java.util.ArrayList;

class Chicken {
    String name;
    int price;

    public Chicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class B1_TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        order.add(new Chicken("로스트", 9900));
        order.add(new Chicken("파닭", 12900));
        order.add(new Chicken("마늘아", 13900));

        int sum =0;
        for (Chicken chicken : order) {
            sum += chicken.getPrice();
        }
        System.out.printf("총합: %d\n", sum);
    }
}


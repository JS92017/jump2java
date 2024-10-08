package 연습_클래스;

class Menu {
    String name;
    int price;

    public Menu(String food, int p) {
        name = food;
        price = p;
    }
}

class Order {
    Menu[] menus;
    int orderNum;

    public Order(int p, Menu[] m) {
        orderNum = p;
        menus = m;
    }

    public int TotalPrice() {
        int total = 0;
        for (int i = 0; i < menus.length; i++) {
            total = total + menus[i].price;
        }return total;
    }


}

public class A8_ChinesRestaurant {
    public static void main(String[] args) {
        Menu a = new Menu("짜장", 4900);
        Menu b = new Menu("짬뽕", 5900);
        Menu c = new Menu("탕슈", 13900);

        Menu[] menu = {a, b, c};
        Order o = new Order(1, menu);

        System.out.printf("주문합계: %d원\n", o.TotalPrice());
    }
}

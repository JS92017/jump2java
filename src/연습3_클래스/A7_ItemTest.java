package 연습3_클래스;
class Item {
    String name;
    int power;

    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public String toString() {
        return String.format("Item {name: %s: power: %d}", name, power);
    }
}

public class A7_ItemTest {
    public static void main(String[] args) {
        Item storm = new Item("스톰브레이커", 600);
        Item gaumtlet = new Item("인피니트 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡틴아메리카의 방패", 50);

        Item[]items = {storm, gaumtlet, bow, shield};

        for(int i = 0; i<items.length; i++) {
            System.out.println(items[i].toString());
    }
}
}

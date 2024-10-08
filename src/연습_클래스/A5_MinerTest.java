package 연습_클래스;

class Miner{
    String name;
    int coins;

    public Miner(String str) {
        this.name = str;
        coins = 2;
    }
    public String toString() {
        return String.format("Miner{ name: %s,  coins: %d}", name, coins );
    }
    public void mine(){
        coins += 1;
    }
}

public class A5_MinerTest {
    public static void main(String[] args) {
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        malon.mine();
        System.out.println(malon.toString());
        System.out.println(gloria);

    }
}

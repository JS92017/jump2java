package 연습4_상속과인터페이스;
class Currency{
    String name;
    double money;
    String names;

    public Currency(String name, double money,String names){
        this.name = name;
        this.money = money;
        this.names = names;
   } public String toString() {
        return String.format("%s: %.2f%s",name,money,names);
    }
}

class Krw extends Currency{
    public Krw(String name, double money, String names) {
        super(name, money, names);
    }
}

class Usd extends Currency{
    public Usd(String name, double money, String names) {
        super(name, money, names);
    }
}

class Eur extends Currency{
    public Eur(String name, double money, String names) {
        super(name, money, names);
    }
}

class Jpy extends Currency{
    public Jpy(String name, double money, String names) {
        super(name, money, names);
    }
}

public class B3_CurrenryTest {
    public static void main(String[] args) {
        Currency krw = new Krw("KRW", 1500.00, "원");
        Currency usd = new Usd("USD", 100.50, "달러");
        Currency eur = new Eur("EUR", 260.87, "유로");
        Currency jpy = new Jpy("JPY", 1400.00, "엔");

        Currency[] currencies = {krw, usd, eur, jpy};
        for (Currency c : currencies) {
            System.out.println(c.toString());
        }


    }
}

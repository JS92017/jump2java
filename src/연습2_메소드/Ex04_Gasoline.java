package 연습2_메소드;

public class Ex04_Gasoline {
    public static void main(String[] args) {
        double gasoline = 8.86;
        double chargeCar = 182.736;
        double result = gasMileage(gasoline, chargeCar);
        System.out.printf("연비: %2fkm/L",result);
    }
    static double gasMileage(double gasoline, double chargeCar) {
        return chargeCar/gasoline;
    }
}

package 연습_메소드;

public class Ex09_Elevator {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;
        System.out.printf("%d -> %s\n",a,guide(a));
        System.out.printf("%d -> %s\n",b,guide(b));
        System.out.printf("%d -> %s\n",c,guide(c));
    }
    public static String guide(int elv){
        if (elv<=10){
            return "저층 엘리베이터";
        }else if (elv<=20){
            return "고층엘리베이터";
        }
        return "";
    }
}

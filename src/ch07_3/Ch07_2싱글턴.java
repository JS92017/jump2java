package ch07_3;

class Singleton{
    private static Singleton one;
    // 생성자를 private 해서 다른 클래스에서 객체를 만들지 못하게 함
    private Singleton() {}
    /* static 메서드로 유일한 객체를 가져오기만 함 */
    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton(); // 단 한번 생성
        }
        return one;
    }
}

public class Ch07_2싱글턴 {
    public static void main(String[] args) {
        /* 단 하나의 객체만 생성 */
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

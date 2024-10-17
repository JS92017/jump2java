package ch07_3;

class Counter {
    static int count = 0;
    // static 변수는 공유됨
    public Counter() {
        count++; // count 값 1 증가
        System.out.println(count); // count 값 출력
    }
    /* 메서드 앞에 static 붙고 객체 상관없이 사용가능 */
    public static int getCount() {
        return count;
    }
}

public class Ch07_1스테틱변수 {
    public static void main(String[] args) {
         // static 은 객체 만들기 전에 이미 있음
        Counter.count = 10;
        System.out.println(Counter.getCount());
        Counter c1 = new Counter(); // 11
        Counter c2 = new Counter(); // 12
        Counter c3 = new Counter(); // 13
        System.out.println(Counter.getCount()); // 13
    }
}

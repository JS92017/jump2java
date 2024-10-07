package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_1IF {
    public static void main(String[] args) {
        /* ctrl + shift + / = 여러주석 */
        /* if 문 */
        int money = 2000;
        boolean hasCard = true;
        // 논리 연산자: and(&&), or(||), not(!x), 여러 번 사용 가능
        if (money >= 3000 || hasCard){
            System.out.println("택시를 타고 간다.");
        } else {
            System.out.println("걸어간다.");
        }

        // if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("smartPhone");
        pocket.add("money");
        if(pocket.contains("money")){
            System.out.println("택시를 타고 간다");
        }else {
            System.out.println("걸어가라");
        }
    }
}

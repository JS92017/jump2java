package 연습5_자바API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class A1_SimpleLottoMachine {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        for (int i = 1; i < 45; i++) {
            lotto.add(i);
        }
        Collections.shuffle(lotto);
        int[] picked = new int[6];
        for (int i = 0; i < 6; i++) {
            picked[i] = lotto.get(i);
        }
        System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
    }
}

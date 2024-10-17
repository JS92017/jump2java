package 연습5_자바API;

import java.util.Random;

class LottoMachine{
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = LottoNumbers;
    }

    public int[] LottoNumbers() {
        int[] pickedNumbers = new int [6];
        Random rand = new Random();
        for (int i = 1; i <= 6; i++) {
            pickedNumbers[i] = rand.nextInt(6);
        }return pickedNumbers;
    }

}

public class B2_Lotto {
    public static void main(String[] args) {
        LottoMachine m = new LottoMachine();
    }
}

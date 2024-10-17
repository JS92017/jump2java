package ch07;

import ch07.house.*;
import java.util.*;

public class Ch07_1패키지 {
    public static void main(String[] args) {
        String str = "미리 임포트 된 패키지 java.lang";
        ArrayList<Integer> list = new ArrayList<>();
        double pi = Math.PI;
        Random r = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();
    }
}

package ch03;

import java.util.HashMap;

public class Ch03_8맵 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // put: 맵은 추가를 put으로 함.
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get: 자료를 가져올 때 get(키) 사용.
        System.out.println(map.get("people"));

        // containsKey 앱에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball"));

        // remove(키): 삭제된 값이 리턴
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));

        // size: 개수
        System.out.println(map.size());

        // keySet: 맵의 모든 key를 리턴
        map.put("apple", "사과");
        System.out.println(map.keySet());

        // values: 맵의 모든 value 값을 리턴
        System.out.println(map.values());
    }
}

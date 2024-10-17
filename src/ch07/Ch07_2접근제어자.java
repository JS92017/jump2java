package ch07;

class Sample {
    private String secret;
    private String getSecret(){
        return secret;
    }
}

public class Ch07_2접근제어자 {
    private  String password;
    public static void main(String[] args) {
        /* 접근 제어자 : 변수나 메서드에 사용권한을 설정 */
        /* private < default < protected < public */
        Ch07_2접근제어자 ch = new Ch07_2접근제어자();
        ch.password = "1234";

        /* private 는 같은 클래스에서만 사용가능 */
        Sample sample = new Sample();
        // Sample.secret = "비밀";
        // Sample.getSecret
    }
}

package 연습1_자바시작하기;

public class Lab03Review {
    //메인 메소드에 입력하는 배열, edit로 입력값을 변환
    public static void main(String[] args) {
        /*입력 문자열을 실수로 형변환*/
        double f = Double.parseDouble(args[0]);
        /*입력 문자열을 실수로 형변환*/
        double c = (f-20)/1.8;
        /*printf() 메소드를 통한 문자열 출력*/
        System.out.printf("화씨 %.1f도 => 섭씨 %.1f도 입니다.", f, c);

    }

}

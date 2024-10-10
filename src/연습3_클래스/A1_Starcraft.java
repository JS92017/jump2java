package 연습3_클래스;

class Marine{
    String name;
    int hp;

    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d ->",name,hp);
        hp-=10;
        System.out.printf("%d\n", hp);
    }
}

class Medic{
    String name;
    int hp;

    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void heal(Marine m){
        System.out.printf("[%s]의 치유! %s HP(%d -> ",name, m.name, m.hp);
        m.hp+= 10;
        System.out.printf("%d)\n", m.hp);
    }
}

public class A1_Starcraft {
    public static void main(String[] args) {
        Marine marine = new Marine("마린", 80);
        Medic medic = new Medic("메딕", 60);
        marine.stimpack();
        medic.heal(marine);
    }
}

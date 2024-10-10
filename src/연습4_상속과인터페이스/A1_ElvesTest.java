package 연습4_상속과인터페이스;

class Elf{
    String name;
    int hp;

    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("[엘프] Name: %s HP: %d", name, hp);
    }
}

class HighElf extends Elf{
    int mp; // mp 추가
    // 생성자 상속 시 부모객체를 먼저 만듬.
    public HighElf(String name, int hp, int mp) {
        super(name, hp); //super는 부모클래스의 생성자
        this.mp = mp;
    }
    public String toString(){
        return String.format("[하이엘프] Name: %s HP: %d MP: %d", name, hp, mp);
    }
}

class ElfLord extends HighElf{
    int shield;
    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }
    public String toString(){
        return String.format("[엘프로드] Name: %s HP: %d MP: %d SH:%d", name, hp, mp, shield);
    }
}

public class A1_ElvesTest {
    public static void main(String[] args) {
        Elf elf = new Elf("티란데", 100);
        HighElf highElf = new HighElf("말퓨리온", 160, 100);
        ElfLord elfLord = new ElfLord("마이에브", 230, 140, 100);

        //객체 배열에 넣기
        Elf[] elves = {elf, highElf, elfLord};
        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }

        // forEach 단축어 iter
        for (Elf e : elves) {
            System.out.println(e);
        }
    }
}

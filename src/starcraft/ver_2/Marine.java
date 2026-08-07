package starcraft.ver_2;

/**
 * <h1>마린</h1>
 * 마린 객체 생성을 위한 클래스
 *
 * <p><b>수정 이력:</b></p>
 * <ul>
 *   <li>2026.07.31 - 각 클래스의 attack 메서드 오버로딩 적용에 따른 호출부 반영</li>
 * </ul>
 *
 * @author 최병권
 * @version 2.0
 */
public class Marine {
    private String name; // null
    private int power;   // 0
    private int hp;      // 0
    private boolean alive;

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
        alive = true;
    }

    // get
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public boolean getAlive() {
        return alive;
    }

    // 메서드

    // 1. 질럿이 저글링을 공격한다
    public void attack(Zergling zergling) {
        if (alive) {
            System.out.println(this.name + "이 " + zergling.getName() + "를 공격했습니다");
            zergling.beAttacked(power);
        } else {
            System.out.println("이 캐릭터는 움직일 수 없습니다.");
        }
    }

    // 2. 질럿이 마린을 공격합니다
    public void attack(Zealot zealot) {
        if (alive) {
            System.out.println(this.name + "이 " + zealot.getName() + "를 공격했습니다");
            zealot.beAttacked(power);
        } else {
            System.out.println("이 캐릭터는 움직일 수 없습니다.");
        }
    }

    // 3. 자기 자신(마린)이 공격을 당합니다
    public void beAttacked(int power) {
        if (alive) {
            System.out.println(this.name + "이 공격을 당합니다");
            this.hp -= power;
            if (hp <= 0) {
                alive = false;
                System.out.println(name + "이 쓰러졌습니다");
            }
        } else {
            System.out.println(name + "은 이미 쓰러졌습니다");
        }
    }

    // 4. 내 현재 상태 출력(콘솔) 기능 만들기
    public void showInfo() {
        System.out.println("---------상태창---------");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
        System.out.println("현재 상태 : " + ((alive) ? "생존" : "사망"));
    }
}

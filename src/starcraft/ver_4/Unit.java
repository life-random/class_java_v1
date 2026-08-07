package starcraft.ver_4;

/**
 * StarCraft 유닛 최상위 부모 클래스
 *
 * @author 최병권
 * @version 4.0
 *
 * <p><b>수정 이력:</b></p>
 * <ul>
 *   <li>2026.08.03 - [v4.0] ver_4 메서드 attack에 다형성 적용으로 코드 최적화</li>
 *   <li>2026.07.31 - [v3.0] ver_3 패키지 개편에 따른 유닛 공통 부모 클래스 최초 신설</li>
 * </ul>
 */

public class Unit {
    protected String name; // null
    protected int power;   // 0
    protected int hp;      // 0
    protected boolean alive;

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

    // 저글링을 공격한다
    public void attack(Unit unit) {
        if (alive) {
            System.out.println(this.name + "이 " + unit.getName() + "를 공격했습니다");
            unit.beAttacked(power);
        } else {
            System.out.println("이 캐릭터는 움직일 수 없습니다.");
        }
    }

    // 3. 자기 자신이 공격을 당합니다
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

    // 내 현재 상태 출력(콘솔) 기능
    public void showInfo() {
        System.out.println("---------상태창---------");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
        System.out.println("현재 상태 : " + ((alive) ? "생존" : "사망"));
    }

}

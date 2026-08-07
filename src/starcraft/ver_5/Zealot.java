package starcraft.ver_5;

/**
 * <h1>StarCraft 게임 실행 테스트 클래스</h1>
 * 메인 메뉴를 통해 유닛(마린, 질럿, 저글링)을 선택하고,
 * 각 유닛 간의 공격 및 상태 확인 동작을 콘솔 환경에서 제어합니다.
 *
 * <p><b>수정 이력:</b></p>
 * <ul>
 *   <li>2026.07.31 - Zealot 클래스가 Unit 클래스의 상속을 받도록 수정</li>
 *   <li>2026.07.31 - 각 클래스의 attack 메서드 오버로딩 적용에 따른 호출부 반영</li>
 * </ul>
 *
 * @author 최병권
 * @version 3.0
 */

public class Zealot extends Unit implements ProtossPassive{

    private final int MAX_SHIELD = 60;
    private int shield;

    public Zealot(String name) {
        super.name = name;
        super.power = 5;
        super.hp = 80;
        super.alive = true;
        shield = 60;
    }

    @Override
    public void shieldCharge() {
        if (alive){
            this.shield = ( ( shield + 1) > MAX_SHIELD) ? MAX_SHIELD : shield + 1;
        }
    }

    @Override
    public int beAttackedShied(int power) {
        if (power > shield){
            power -= shield;
            shield = 0;
            return power;
        } else {
            shield -= power;
            return 0;
        }
    }

    //자기 자신이 공격을 당합니다
    public void beAttacked(int power) {
        if (alive) {
            System.out.println(this.name + "이 공격을 당합니다");
            beAttackedShied(power);
            this.hp -= power;
            shieldCharge();
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
        System.out.println("현재 실드 : " + shield);
        System.out.println("현재 생명력 : " + hp);
        System.out.println("현재 상태 : " + ((alive) ? "생존" : "사망"));
    }
}

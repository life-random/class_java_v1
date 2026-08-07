package starcraft.ver_4;

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

public class Zealot extends Unit {
    public Zealot(String name) {
        super.name = name;
        super.power = 5;
        super.hp = 80;
        super.alive = true;
    }
}

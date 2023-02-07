package 게임만들기;

//동작에 대한 메소드는 인터페이스
public interface GameAction {
    double pAttack(); // 물리공격력
    double mAttack(); // 마공
    int ultimate();// 궁극ㄱ기 ㄱㅇ겨격
    boolean setDamage(double damage); //

}

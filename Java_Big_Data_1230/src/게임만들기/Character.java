package 게임만들기;

public class Character extends Unit implements GameAction{

    //생성자의 매개변수로 전달 받는 값으로 케릭터의 기본 능력치를 설정
    public Character(String name, int pP, int mP,double pH, double mH, int ultra,int hp){
        this.name = name;
        this.pPpwer = pP;
        this.mpower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp=hp;
    }

    @Override
    public double pAttack() {

        return pPpwer * pHit;
    }

    @Override
    public double mAttack() {
        return mpower * mHit;
    }

    @Override
    public int ultimate() {
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) { // 받는 피해량
        if(hp > damage){
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false; //살아 있음.
        }else {
            System.out.println(name + "이 죽었습니다. 게임을 종료합니다.");
            return true; //죽음
        }
    }
}

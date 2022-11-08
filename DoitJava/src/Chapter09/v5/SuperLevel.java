package Chapter09.v5;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("######### 고급자 레벨입니다. #########");
    }
}

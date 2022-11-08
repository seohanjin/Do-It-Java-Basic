package Chapter09.v5;

public class Player {
    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showInfo();
    }

    public void play(int count) {
        this.level.go(count);
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.level = playerLevel;
        level.showInfo();
    }
}

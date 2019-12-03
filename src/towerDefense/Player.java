package towerdefense;


public class Player {
    public int coin;
    public int health;

    public Player() {
        this.health = towerdefense.User.DEFAULT_HEALTH;
        this.coin = towerdefense.User.DEFAULT_COIN;

    }
}

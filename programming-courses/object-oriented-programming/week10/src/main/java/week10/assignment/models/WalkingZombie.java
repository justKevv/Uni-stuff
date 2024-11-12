package week10.assignment.models;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void destroyed() {
        health -= (health * 20 / 100);
    }

    public String getZombieInfo() {
        return "Walking Zombie Info: \n" + super.getZombieInfo();
    }
}

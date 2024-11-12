package week10.assignment.models;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        health += (health * 30 / 100);
    }

    @Override
    public void destroyed() {
        health -= (health * 10 / 100);
    }

    public String getZombieInfo() {
        return "Jumping Zombie Info: \n" + super.getZombieInfo();
    }
}

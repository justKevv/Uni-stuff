package week10.assignment;

import week10.assignment.interfaces.Destroyable;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public void heal() {
        health += 10;
    }

    @Override
    public void destroyed() {
        health = 0;
    }

    public String getZombieInfo() {
        return "Health = " + health + "\n" +
                "Level = " + level + "\n";
    }
}

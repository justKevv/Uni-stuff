package week2;

public class Dragon {
    int x, y, width, height;

    void moveLeft() {
        x--;
    }

    void moveRight() {
        x++;
    }

    void detectCollision() {
        if (x > width) {
            System.out.println("Dragon collided with right wall");
        } else if (x < 0) {
            System.out.println("Dragon collided with left wall");
        } else if (y > height) {
            System.out.println("Dragon collided with top wall");
        } else if (y < 0) {
            System.out.println("Dragon collided with bottom wall");
        }

        System.out.println("Game Over");
        
    }

    void moveUp() {
        y--;
    }

    void moveDown() {
        y++;
    }
}

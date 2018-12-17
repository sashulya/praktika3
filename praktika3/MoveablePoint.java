package move;

public class MoveablePoint implements Moveable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        ++y;
    }

    @Override
    public void moveDown() {
        --y;
    }

    @Override
    public void moveRight() {
        ++x;
    }

    @Override
    public void moveLeft() {
        --x;
    }
}

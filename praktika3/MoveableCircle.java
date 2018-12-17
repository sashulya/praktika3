package move;

public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}

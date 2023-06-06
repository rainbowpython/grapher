
public class Point {
  private int x;
  private int y;
  private boolean isGraphed;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
    isGraphed = false;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String toString() {
    return "" + x + "" + y + "" + isGraphed;
  }

  public void graph() {
    isGraphed = true;
  }

  public boolean isGraphed() {
    return isGraphed;
  }

}

import java.util.ArrayList;

public class Display {
  int row;
  int height;
  Point[][] points;

  public Display(Point[][] newPoints) {
    points = newPoints;
  }

  public void showChords() {
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        System.out.print("" + x + "" + y + " ");
      }
      System.out.println();
    }
  }

  public void graph() {
    for (int y = points.length; y >= 0; y--) {
      for (int x = 0; x < points[y].length; x++) {

        if (points[y][x].isGraphed()) {
          System.out.println("x");
        } else if (points[y][x].getX() == 0) {

          System.out.println(points[y][x].getY());
        } else if (points[y][x].getY() == 0) {

          System.out.println(points[y][x].getX());
        } else {
          System.out.println(" ");
        }
      }
      System.out.println();
    }
  }
}

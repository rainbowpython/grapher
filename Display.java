import java.awt.Point;
import java.util.ArrayList;

public class Display {
  int row;
  int height;
  Point[][] points;

  public Display(Point[][] newPoints) {
    points = newPoints;
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        System.out.print("" + x + "" + y + " ");
      }
      System.out.println();

    }
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
        if(points[y][x].getIsGraphed()){
          
        }
      }
      System.out.println();
    }
  }
}

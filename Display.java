import java.awt.Point;
import java.util.ArrayList;

public class Display {
  int row;
  int height;
  ArrayList points;

  public Display(ArrayList newPoints) {
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
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        for (Point position : points) {
          if(position.getX() == x || position.getY() == y){
            System.out.println("X");
          }
          else{
            System.out.println("O");
          }
        }
      }
      System.out.println();
    }
  }
}

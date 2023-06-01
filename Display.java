public class Display {
  int row;
  int height;

  public Display() {
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
        System.out.print("" + x + "" + y + " ");
      }
      System.out.println();
    }
  }
}

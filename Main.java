import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Display display = new Display();
    Grapher graper = new Grapher("y=3x+2");
    System.out.println("input equation (format: y on one side and no spaces)\nEX:y=5x+3");

  }
}

import java.util.ArrayList;
import javax.script.*;

public class Grapher {
  // right hand side of equation
  private String xSide;

  private String eqaution;
  private double yIntercept;
  private double slope;
  private ArrayList<Point> graph = new ArrayList<Point>();
  private Display display;

  public Grapher(double newSlope, double newYIntercept) {
    new ScriptEngineManager().getEngineFactories();
    slope = newSlope;
    yIntercept = newYIntercept;
    calculate();

  }

  private void calculate() {
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        
      }
    }
    System.out.println(graph);
  }
}

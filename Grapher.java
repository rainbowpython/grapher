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

  private int xRange;
  private int yRange;
  private int yStart;
  private int xStart;
  public Grapher(double newSlope, double newYIntercept) {
    slope = newSlope;
    yIntercept = newYIntercept;
    xRange = 20;
    yRange = 20;
    xStart = -10;
    yStart = -10;    
    for (int y = yStart+yRange; y >= yStart; y--) {
      for (int x = xStart; x < xStart+xRange; x++) {
        graph.add(new Point(x, y));
      }
    }
    calculate();
  
  }

  
  
  private void calculate() {
    for (int y = yStart+yRange; y >= yStart; y--) {
      for (int x = xStart; x < xStart+xRange; x++) {
        if(x*slope + yIntercept == y){
          graph.get().graph();
        }
      }
    }
    System.out.println(graph);
  }
}

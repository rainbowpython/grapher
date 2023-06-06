import java.util.ArrayList;
import javax.script.*;

public class Grapher {
  // right hand side of equation
  private String xSide;

  private String eqaution;
  private double yIntercept;
  private double slope;
  private Point[][] graph;
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
    graph = new Point[xRange][yRange];
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart; y--) {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) {
        graph[yCount][xCount] = new Point(x, y);
        xCount++;
      }
      yCount++;
    }
    calculate();
    Display display = new Display(graph);
    display.graph();
  }

  public Grapher(double newSlope, double newYIntercept, int xStart, int yStart, int xRange, int yRange) {
    slope = newSlope;
    yIntercept = newYIntercept;
    this.xRange = xRange;
    this.yRange = xRange;
    this.xStart = xStart;
    this.yStart = xStart;
    graph = new Point[xRange][yRange];
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart+1; y--) {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) {
        graph[yCount][xCount] = new Point(x, y);
        xCount++;
      }
      yCount++;
    }
    calculate();
    Display display = new Display(graph);
    display.graph();
  }

  private void calculate() {
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart; y--) {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) {
        if (x * slope + yIntercept == y) {
          graph[yCount][xCount].graph();
          //System.out.println("bing " + graph[yCount][xCount]);
          
        }
        xCount++;
        
      }
      yCount++;
    }
  }

  public int getXRange() {
    return xRange;
  }

  public int getYRange() {
    return yRange;
  }

  public int getXStart() {
    return xStart;
  }

  public int getYStart() {
    return yStart;
  }
  
}

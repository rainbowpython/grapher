import java.util.ArrayList;

public class LinearGrapher 
{
  private double yIntercept;
  private double slope;
  private Point[][] graph;
  private Display display;

  private int xRange;
  private int yRange;
  private int yStart;
  private int xStart;

  public LinearGrapher(double newSlope, double newYIntercept) 
  {
    this(newSlope, newYIntercept, -10 ,-10 , 20, 20);
  }

  public LinearGrapher(double newSlope, double newYIntercept, int xStart, int yStart, int newXRange, int newYRange) 
  {
    slope = newSlope;
    yIntercept = newYIntercept;
    this.xRange = newYRange;
    this.yRange = newYRange;
    this.xStart = xStart;
    this.yStart = yStart;
    graph = new Point[yRange][xRange];
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart; y--) 
    {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) 
      {
        graph[yCount][xCount] = new Point(x, y);
        xCount++;
      }
      yCount++;
    }
    calculate();
    Display display = new Display(graph);
    display.graph();
  }

  private void calculate() 
  {
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart; y--) 
    {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) 
      {
        if (x * slope + yIntercept == y) {
          graph[yCount][xCount].graph();

        }
        xCount++;
        
      }
      yCount++;
    }
  }

  public int getXRange() 
  {
    return xRange;
  }

  public int getYRange() 
  {
    return yRange;
  }

  public int getXStart() 
  {
    return xStart;
  }

  public int getYStart() 
  {
    return yStart;
  }
}

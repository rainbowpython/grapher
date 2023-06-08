public class QuadraticGrapher
{
  double xPowerOf2Slope;
  private double yIntercept;
  private double slope;
  private Point[][] graph;
  private Display display;

  private int xRange;
  private int yRange;
  private int yStart;
  private int xStart;
  
  public QuadraticGrapher(double xPowerOf2Slope, double newSlope, double newYIntercept) 
  {
    this(xPowerOf2Slope, newSlope, newYIntercept, -10 ,-10 , 20, 20);
  }
  
  public QuadraticGrapher(double xPowerOf2Slope, double newSlope, double newYIntercept, int xStart, int yStart, int newXRange, int newYRange)
  {
    slope = newSlope;
    yIntercept = newYIntercept;
    this.xPowerOf2Slope = xPowerOf2Slope;
    this.xRange = newYRange+1;
    this.yRange = newYRange+1;
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
  
  public void calculate()
  {
    int yCount = 0;
    int xCount = 0;
    for (int y = yStart + yRange; y > yStart; y--) 
    {
      xCount = 0;
      for (int x = xStart; x < xStart + xRange; x++) 
      {
        if (xPowerOf2Slope*(x*x)+ x * slope + yIntercept == y) 
        {
          graph[yCount][xCount].graph();
        }
        xCount++;
      }
      yCount++;
    }
  }
}
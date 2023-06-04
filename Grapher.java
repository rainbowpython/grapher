import java.util.ArrayList;
import javax.script.*;

public class Grapher {
  // right hand side of equation
  private String xSide;
  private int yIntercept;
  private int xCoefficent;
  private int slope;
  private ArrayList<Point> graph = new ArrayList<Point>();
  private Display display;
  
  public Grapher(double slope, double yIntercept) {
    new ScriptEngineManager().getEngineFactories();
    this.slope = slope; 
    this.yIntercept = yIntercept;
    
    calculate();

  }

  private void calculate() {
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        if(x*slope+yIntercept == y){
          graph.add(new Point(x, y));
        }
      }
    }
    System.out.println(graph);
  }
}

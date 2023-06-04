import java.util.ArrayList;
import javax.script.*;

public class Grapher {
  // right hand side of equation
  private String xSide;

  private String eqaution;
  private int yIntercept;
  private int xCoefficent;
  private int slope;
  private ArrayList<Point> graph = new ArrayList<Point>();
  private Display display;

  public Grapher {
    new ScriptEngineManager().getEngineFactories();
    eqaution = newEquation;
    createXSide();
    calculate();

  }

  private void createXSide() {
    xSide = eqaution.substring(eqaution.indexOf("=") + 1);
    System.out.println(xSide);
    xCoefficent = Integer.parseInt(eqaution.substring(eqaution.indexOf("x") - 1, eqaution.indexOf("x")));
  }

  private void calculate() {
    for (int y = 10; y >= 0; y--) {
      for (int x = 0; x < 10; x++) {
        
      }
    }
    System.out.println(graph);
  }
}

import java.util.ArrayList;
import javax.script.*;
import org.graalvm.js;

public class Grapher {
  // right hand side of equation
  private String xSide;

  private String eqaution;
  private int yIntercept;
  private int xCoefficent;
  private ScriptEngineManager mgr = new ScriptEngineManager(null);
  private ScriptEngine engine = mgr.getEngineByName("JavaScript");
  private ArrayList<Point> graph = new ArrayList<Point>();

  public Grapher(String newEquation) {
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
        String input = "" + (x * xCoefficent) + eqaution.substring(eqaution.indexOf(x) + 1);
        try {
          if (Integer.parseInt(engine.eval(input).toString()) == y) {
            graph.add(new Point(x, y));
          }
        } catch (NumberFormatException | ScriptException e) {
          if (e instanceof NullPointerException) {
            System.out.println("ERROR: incorrect format");
          }
          System.out.println(graph);
        }
      }
    }
    System.out.println(graph);
  }
}

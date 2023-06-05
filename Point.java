
public class Point {
  int x;
  int y;
  boolean isGraphed;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
    isGraphed = false;
  }
  
  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
  
  public String toString(){
    return "" + x + "" + y;
  }

  public void graph(){
    isGraphed = true;
  }
}

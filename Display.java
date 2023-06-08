import java.util.ArrayList;

public class Display 
{
  int row;
  int height;
  Point[][] points;

  public Display(Point[][] newPoints) 
  {
    points = newPoints;
  }

  public void showChords() 
  {
    for (int y = 10; y >= 0; y--) 
    {
      for (int x = 0; x < 10; x++) 
      {
        System.out.print("" + x + "" + y + " ");
      }
      System.out.println();
    }
  }

  public void graph() 
  {
    for (int y = 0; y < points.length - 1; y++) 
    {
      for (int x = 0; x < points[y].length - 1; x++) 
      {
        if (points[y][x].isGraphed()) 
        {
          if(points[y][x].getY() == 0||points[y][x].getX() == 0)
          {
            System.out.print("█x");
          }
          else
          {
            System.out.print(" x");
          }
          
        } else if (points[y][x].getY() == 0) 
        {
          if(!ArgumentManager.isBlocks)
          {
            if (points[y][x].getX() < 0) 
            {
  
              System.out.print(" " + (points[y][x].getX() * -1));
            } 
            else 
            {
              System.out.print(" " + (points[y][x].getX()));
            }
          }
          else
          {
            System.out.print("██");
          }
        } else if (points[y][x].getX() == 0) 
        {
          if(!ArgumentManager.isBlocks)
          {
            if (points[y][x].getY() < 0) 
            {
              System.out.print("  " + (points[y][x].getY() * -1));
            }
            else 
            {
              System.out.print("  " + (points[y][x].getY()));
            }
          }
          else{
            System.out.print("██");
          }
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}

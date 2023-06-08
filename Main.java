import java.util.Scanner;

public class Main 
{

  public static void main(String[] args) throws Exception 
  {
    Scanner scanner = new Scanner(System.in);
    ArgumentManager argumentManager = new ArgumentManager(args);

    System.out.println("Integer graph. low value integers values work best");

    while (ArgumentManager.type == null) 
    {
      System.out.println("What type of graph would you like? Enter corresponding number");
      System.out.println("1:linear");
      System.out.println("2:quadratic");
      System.out.println("3:edit graph size");
      int input = scanner.nextInt();
      if (input == 1) 
      {
        ArgumentManager.type = "linear";
      } 
      else if ((input == 2)) 
      {
        ArgumentManager.type = "quadratic";
      } 
      else 
      {

        System.out.println("how long should the x axis go for");
          ArgumentManager.xRange = scanner.nextInt();

      
        System.out.println("how long should the y axis go for");
        ArgumentManager.yRange = scanner.nextInt();
        System.out.println("where should x start at");
        ArgumentManager.xStart = scanner.nextInt();
        System.out.println("where should y start at");
        ArgumentManager.yStart = scanner.nextInt();
    }
    }
    if(ArgumentManager.type.equals("linear"))
    {
      if(ArgumentManager.linearSlope == null)
      {
        System.out.println("Input slope");
        ArgumentManager.linearSlope = scanner.nextDouble();
      }
      if(ArgumentManager.yIntercept == null)
      {
        System.out.println("Input y intercept");
        ArgumentManager.yIntercept = scanner.nextDouble();
      }
      if(ArgumentManager.xStart == null)
      {
        LinearGrapher l = new LinearGrapher(ArgumentManager.linearSlope, ArgumentManager.yIntercept);
      }
      else
      {
        LinearGrapher l = new LinearGrapher(ArgumentManager.linearSlope, ArgumentManager.yIntercept, ArgumentManager.xStart, ArgumentManager.yStart, ArgumentManager.xRange, ArgumentManager.yRange);
      }
    }
    if(ArgumentManager.type.equals("quadratic"))
    {
      if(ArgumentManager.quadraticSlope == null)
      {
        System.out.println("Input quadratic slope");
        ArgumentManager.quadraticSlope = scanner.nextDouble();
      }
      if(ArgumentManager.linearSlope == null)
      {
        System.out.println("Input slope");
        ArgumentManager.linearSlope = scanner.nextDouble();
      }
      if(ArgumentManager.yIntercept == null)
      {
        System.out.println("Input y intercept");
        ArgumentManager.yIntercept = scanner.nextDouble();
      }
      
      if(ArgumentManager.xStart == null)
      {
        QuadraticGrapher l = new QuadraticGrapher(ArgumentManager.quadraticSlope,ArgumentManager.linearSlope, ArgumentManager.yIntercept);
      }
      else{
        QuadraticGrapher l = new QuadraticGrapher(ArgumentManager.quadraticSlope, ArgumentManager.linearSlope, ArgumentManager.yIntercept, ArgumentManager.xStart, ArgumentManager.yStart, ArgumentManager.xRange, ArgumentManager.yRange);
      }
    }

  }
}
                                            
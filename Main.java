import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    ArgumentManager argumentManager = new ArgumentManager(args);
    for (String a : args) {
      System.out.println(a);
    }
    System.out.println("Integer graph. Integers values work best");
    
    while (ArgumentManager.type == null) {
      System.out.println("What type of graph would you like? Enter corresponding number");
      System.out.println("1:linear");
      System.out.println("2:quadratic");
      System.out.println("3:edit graph size");
      if(scanner.nextInt() == 1){
        ArgumentManager.type = "linear";
      }
      else if((scanner.nextInt() == 1)){
        ArgumentManager.type = "quadratic";
      }
      else{
        if (ArgumentManager.xRange == null) {
          System.out.println("how long should the x axis go for");
      ArgumentManager.xRange = scanner.nextInt();
    }
      }
    }
    
    
    System.out.println("Input slope and y intercept");
   
  }
}

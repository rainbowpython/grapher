import java.util.*;

public class ArgumentManager{
  public static String[] arguments;
  public static boolean isBlocks = true;
  public static boolean singleRun;
  public static String type;
  //graph information
  public static Integer xRange;
  public static Integer yRange;
  public static Integer xStart;
  public static Integer yStart;
  //data for initializing a Line;
  public static Double linearSlope;
  public static Integer linearXCoeffient;
  
  public ArgumentManager(String[] args){
    //String acceptedArguments = {"--help", "--isBlocks"};
    arguments = args;
    singleRun = true;
    for (String a : args) {
      switch(a){
        case "--help" :
          System.out.println("A command line integer only grapher");
          System.out.println("--isBlocks: if using blocks or numbers for axis");
          break;
        case "--isBlocks":
          if (args[indexOf("--isBlocks") + 1].equals("true") || args[indexOf("--isBlocks") + 1].equals("false")) {
            isBlocks = Boolean.parseBoolean(args[indexOf("--isBlocks") + 1]);
          }
          break;
        case "--Linear":
          type = "linear";
          break;
        case "--Quadratic":
          type = "quadratic";
          break;
        case "--xRange":
          xRange = Integer.parseInt(args[indexOf("--xRange") + 1]);
          break;
        case "--yRange":
          xRange = Integer.parseInt(args[indexOf("--yRange") + 1]);
          break;

        case "--xStart":
          xRange = Integer.parseInt(args[indexOf("--xStart") + 1]);
          break;
        case "--yStart":
          xRange = Integer.parseInt(args[indexOf("--yStart") + 1]);
          break;
      }
    }
  }
  
  private int indexOf(String arg){
    int index = -1;
    for(String a : arguments){
      index++;
      if(a.equals(arg)){
        return index;
      }
    }
    return -1;
  }
}

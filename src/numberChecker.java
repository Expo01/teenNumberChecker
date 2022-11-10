public class numberChecker {

  public static boolean hasTeen(int teenOne, int teenTwo, int teenThree){
      return (isTeen(teenOne) || isTeen(teenTwo) || isTeen(teenThree));
  }

  public static boolean isTeen(int testNumber){
      if(testNumber <= 19 && testNumber >= 13){
          return true;
      } else return false;
  }

}

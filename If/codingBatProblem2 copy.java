
/** 
 * Coding Bat warmup if and else statements.
 * Determines when you are allowed to sleep-in.
 * 
 * @author DevRomu
 * @version 1.0.0
 */
public class codingBatProblem2 {
  public static void main(String[] args)
  {
    boolean aSmile = true; 
    boolean bSmile = false;
    
    
    // TODO: Code all the unit tests detailed on CodingBat.
    System.out.println(monkeyTrouble(aSmile, bSmile));
  }
 
 /**
  * TODO: JavaDoc

  * @param aSmile
  * @param bSmile
  * @return
  */
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
  { 
    if(aSmile && bSmile)
    {
      return true;
    }
    if(!aSmile && bSmile)
    {
      return true;
    }
      return false;
  }
}
package If;

/** 
 * Coding Bat warmup if and else statements.
 * Determines when you are allowed to sleep-in.
 * 
 * @author DevRomu
 * @version 1.0.0
 */
public class codingBatProblem1 {
  public static void main(String[] args)
  {
    boolean sleepIn = false; 
    boolean weekday = true;
    boolean vacation = true;
    
    // TODO: Code all the unit tests detailed on CodingBat.
    System.out.println(sleepIn(weekday, vacation));
  }
 
  /**
   * TODO: JavaDoc
   *
   * @param weekday
   * @param weekday
   * @return 
   */
  public static boolean sleepIn(boolean weekday, boolean vacation)
  { 
    if(weekday & vacation)
    {
      return true;
    }
    else(!weekday & vacation)
    {
      return false;
    }
  }
}

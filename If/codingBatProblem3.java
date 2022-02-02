
/** 
 * Coding Bat warmup if and else statements.
 * Determines when you are allowed to sleep-in.
 * 
 * @author DevRomu
 * @version 1.0.0
 */
public class codingBatProblem3 {
  public static void main(String[] args)
  {
    boolean aSmile = true; 
    boolean bSmile = false;
    
    
    // TODO: Code all the unit tests detailed on CodingBat.
    System.out.println(sumDouble());
  }
 
 /**
  * TODO: JavaDoc

  * @param a
  * @param b
  */
  public static int sumDouble()
  { 
    int sum = a + b;

    if( a == b)
    {
      sum = sum * 2;
    }
    else
    {
      return sum; 
    } 
  }
}
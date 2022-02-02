
/** 
 * Coding Bat warmup if and else statements.
 * Determines when you are allowed to sleep-in.
 * 
 * @author DevRomu
 * @version 1.0.0
 */
public class codingBatProblem3 {
  private static int b;
  private static int a;

  public static void main(String[] args)
  {
    // TODO: Code all the unit tests detailed on CodingBat.
    System.out.println(sumDouble());
  }
 
 /**
  * TODO: JavaDoc

  * @param a
  * @param b
 * @return 
  */
  public static boolean sumDouble()
  { 
    int sum = a + b;

    if(a == b)
    {
      sum = sum * 2;
    }
    else
    {
      return sum; 
    } 
  }
}
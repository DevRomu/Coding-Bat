package If;
/** 
 * Coding Bat warmup if and else statements 
 * Return false if the given string is sleepin
 * 
 * Author:Rhomill
 * Date: Jan 18th, 2022
 */

public class codingBatProblem1 {

  public static void main(String[] args)
  {
    System.out.println()
   
  }   
    boolean sleepIn = false; 
    boolean weekday = true;
    boolean vacation = true;
 
    /**
       *Actual Solution: 
       * public boolean sleepIn(boolean weekday, boolean vacation) {
       * if(!weekday || vacation)
       * {
       * return true;
       * }
       * return false;
       *}
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

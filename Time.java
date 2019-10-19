import java.util.*;

public class Time{
  public static void main(String[]args){
      int min;
      int h;
      int tm;
      int hr =60 ;
      int ft;
      
      Scanner b = new Scanner(System.in);
      
      System.out.print("Enter number of minutes: ");
      min = b.nextInt();
      tm = min /hr;
      ft = min % hr;
      System.out.println(min + " minutes is " + tm + " hours and " + ft + " minutes.");
  }
}
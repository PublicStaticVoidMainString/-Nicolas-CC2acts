import java.util.Scanner;
public class XandY{
  public static void main(String[] jk){
  int x = 0;
  int y = 0;
  int m = 0;
  int r = 0;
  
  
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Enter value of x: ");
   x = s.nextInt();
  
  System.out.print("Enter value of y: ");
  y = s.nextInt();
  int difference = x - y;
   
  if(difference<0){
    r = x + y;
    
  }else if(difference == 0){
    r = (x*2) + (y*2);
  }else{
    r = x + y;
    }
    System.out.println(r);
    System.out.println(x);
    System.out.println(y);
  }
 }
  
  
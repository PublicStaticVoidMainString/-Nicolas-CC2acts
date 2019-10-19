import java.util.*;

public class KamoteSayote{
  public static void main(String [] jk){
  Scanner s = new Scanner(System.in);
  
  int n =0;
  int m =0;
  int k =0;
  int x;
  int y;
  
  if(n<=1000 && m<=1000 && k<=1000){
    System.out.print("Enter input: ");
    n = s.nextInt();
    m = s.nextInt();
    k = s.nextInt();
    
    x = n/m;
    y = n%m*k;
    
    System.out.println(x +" kamotes");
    System.out.println(y +" sayotes");
  }else{
  System.out.println("Invalid input");  
    }
  }
}
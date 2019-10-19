import java.io.*;
import java.text.DecimalFormat;
public class Room{
  public static void main(String[] jk)throws IOException{
      double l =0;
      double w = 0;
      
      DecimalFormat d = new DecimalFormat("0.00");
       
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("Enter length: ");
      l = Double.parseDouble(b.readLine());
      System.out.print("Enter width: ");
      w = Double.parseDouble(b.readLine());
      System.out.println("The floor space of the room is " + d.format(l*w) + " square units.");  
  }
}
import java.lang.Math;
public class CC2_Lab5{
  public static void main(String[] jk){
    double messageCount =Math.random() * 1000;;
    float charges = 0.5f;
    double lim = 200;
    int rand = (int)messageCount;
    
    
    if(messageCount>200){
      System.out.println("You have sent " + rand +" messages."
        +"\nYou have incurred " + (rand - lim)*charges + " PHP in charges.");
    }else{
      System.out.println("You have sent " + rand +" messages.");
    }
  }
}
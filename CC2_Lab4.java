import java.util.*;
public class CC2_Lab4{
  public static void main(String[] jk){
    Scanner s = new Scanner(System.in);
    
    String name;
    int age = 0;
    
    System.out.println("Enter name: ");
    name = s.nextLine();
    
    System.out.println("Enter age: ");
    age = s.nextInt();
    
    if(name.equals("Jhim")||name.equals("Ethan")){
      if(age<6 || age >9){
      System.out.println("Hamster,Dog");
      }else if(age<11 || age>14){
      System.out.println("Spider,Dog");
      }else if(age<17 || age>19){
      System.out.println("Dog, Snake");
      }else if(age==21){
      System.out.println("No Pets, Not Interested");
      }
    }else if(name.equals("Sally")||name.equals("Joy")){
    if(age<6 || age >9){
      System.out.println("Hamster,Cat");
      }else if(age<11 || age>14){
      System.out.println("Cat,Rabbit");
      }else if(age<17 || age>19){
      System.out.println("Cat");
      }else if(age>21){
      System.out.println("No Pets, Not Interested");
      }
    }
  }
}
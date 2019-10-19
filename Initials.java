import javax.swing.*;

public class Initials{
  public static void main(String[] jk){
  
  String n1,n2,n3;
  n1 = "";
  n2 = "";
  n3 = "";

  n1 = JOptionPane.showInputDialog("Enter your first name's intial: ");
  n2 = JOptionPane.showInputDialog("Enter your middle name's initial: ");
  n3 = JOptionPane.showInputDialog("Enter your last name's initial: ");
  
  char k = n1.charAt(0);
  char a = n2.charAt(0);
  char n = n3.charAt(0);
  JOptionPane.showMessageDialog(null, k +"."+a+"."+n);
  }
}
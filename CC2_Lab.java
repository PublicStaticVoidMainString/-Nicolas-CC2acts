public class CC2_Lab3{
  public static void main(String[] jk){
  char k ='K';
  char r = 'R';
  char i = 'I';
  char s = 'S';
  char a = '!';
  
  
  int q = k;
  int w = r;
  int e = i;
  int t = s;
  int y = a;
  int sum = q+w+e+t+y;
  int pro = q*w*e*t*y;
  double avg = sum/5;
  int rem = pro %avg;
  
  System.out.print(k + " - " + q
      +"\n"+ r + " - " + w
      +"\n"+ i + " - " + e
      +"\n"+ s + " - " + t
      +"\n"+a + " - " + y
      +"\n" + k+r+i+s+a
      +"\n"+"Sum: " + sum
      +"\n"+"Product: " +pro
      +"\n"+"Average: " +avg
      +"\n"+"Remainder: " +rem);
  }
}
  

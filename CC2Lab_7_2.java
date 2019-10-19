import java.util.*;
public class CC2Lab_7_2{
  public static void main(String[] jk){
    Scanner sc = new Scanner(System.in);
    
    int b=0;
    int n=0;
    int m=0;
    String S="";

        System.out.print("Enter # of operations: ");
        b= sc.nextInt();
          
        if(b>=1 &b<=100){
            System.out.print("Enter all operations in one line: ");
            for(int z=1;z<=b;z++){
              S = sc.next();
            if(S.equals("negate")){
                n = sc.nextInt();
              System.out.println(-1*n);
            }else if(S.equals("add")){ 
                n = sc.nextInt();
                m = sc.nextInt();
                System.out.println(n+m);
            }else if(S.equals("max")){
                n = sc.nextInt();
                m = sc.nextInt();
                if(n>m)
                  System.out.println(n);
                else if(m==n)
                  System.out.println(n);
                else
                  System.out.println(m);
                    
                }
            }
        
    }
    }
}          
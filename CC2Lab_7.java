import java.util.*;
public class CC2Lab_7{
	public static void main(String[] jk){
		Scanner s = new Scanner(System.in);
		int grade = 0;
		
		grade = s.nextInt();//gets input from user
			//in this area, the program will evaluate the input
			if(grade>91 || grade==100){
			System.out.print("A");
			}else if(grade>86 || grade==91){
			System.out.print("B+");
			}else if(grade>82 || grade==86){
			System.out.print("B");
			}else if(grade>78 || grade==82){
			System.out.print("C+");
			}else if(grade>74 || grade==78){
			System.out.print("C");
			}else if(grade>69 || grade==74){
			System.out.print("D");
			}else{
			System.out.print("F");	
		}
	}
}
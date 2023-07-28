import java.util.Scanner;
public class DoWhileLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		int num=0;
		int num2=1;
		int result=0;
		
		System.out.println(num);
		System.out.println(num2);
		
		do {
			result=num+num2;
			System.out.println(result);
			num=num2;
			num2=result;
			i++;
		} while (i<20);
		

	}

}

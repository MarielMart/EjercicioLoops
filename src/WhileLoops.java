import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
	
		Scanner console=new Scanner(System.in);
		int num;
		System.out.print("Ingresa un número entero: ");
		num=console.nextInt();
		System.out.println("Tabla de multiplicar de" + num);
		int i=1;
		while (i<=10) {
			System.out.println(num*i);
			i++;
		}

	}

}

import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa un nombre: ");
		String nombre = in.next();
		int i=0;
		for (i=0; i<nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		

	}

}

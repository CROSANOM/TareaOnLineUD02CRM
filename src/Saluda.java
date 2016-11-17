import java.util.Scanner;
public class Saluda {

	public Saluda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String nombre;
		System.out.println("hola humana ¿cómo te llamas?");
		System.out.println("Introduce tu nombre");
		nombre=sc.nextLine();
		System.out.println(nombre);
		System.out.println("Hola"+" "+nombre);
		// TODO Auto-generated method stub

	}

}

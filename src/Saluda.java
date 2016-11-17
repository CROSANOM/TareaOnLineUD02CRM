import java.util.Scanner;

public class Saluda {

	private static String nombre = null;

	public static String getNombre() {
		return nombre;/*
						 ** metodo get devuelve valos nombre
						 */
	}

	public static void setNombre(String nombre) {
		Saluda.nombre = "Raquel";/*
									 ** Metodo que asigna un valor para nombre
									 *
									 * 
									 */
		pideNombre();/*
						 * 
						 * Metodo pide nombre
						 */

	}

	public static void pideNombre() {

		Scanner sc = new Scanner(System.in);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("hola humana1 ¿cómo te llamas?");
		System.out.println("Introduce tu nombre");
		setNombre(sc.nextLine());
		System.out.println("Hola ahora  Cris se llama" + " " + getNombre());
		System.out.println("Hola humana2 ¿y tú cómo te llamas?, introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Me llamo" + nombre);
		setNombre(sc.nextLine());
		System.out.println("Hola ahora la humana2, tambien se llama" + " " + nombre);// TODO
																						// Auto-generated
																						// method
																						// stub
		setNombre(sc.nextLine());
		;

	}
}

import java.util.Scanner;
public class Saluda {

	public Saluda() {/*
**Esto es el metodo porque lleva parentesis 
*/
		// TODO Auto-generated constructor stub
	}
	

	
 public static void main(String[] args) {
		 String nombre =null;
		Scanner sc=new Scanner (System.in);
		System.out.println("hola humana ¿cómo te llamas?");
		System.out.println("Introduce tu nombre");
		nombre=sc.nextLine();
		System.out.println(nombre);
		System.out.println("Hola"+" "+nombre);
		System.out.println("hola humana2 ¿y cómo te llamas?, introduce tu nombre");
		nombre=sc.nextLine();
		System.out.println("Hola"+" "+nombre);
		// TODO Auto-generated method stub

	}

}

import java.util.Scanner;

/*Crear un programa donde se introduzcan los tres ángulos internos de un triángulo y 
 * se determine si el triángulo es válido o no.
*/

public class AngulosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner angulo = new Scanner (System.in);
		System.out.println("Introduce el primer ángulo del triángulo");
		int ang1 = angulo.nextInt();
		System.out.println("Introduce el segundo ángulo del triángulo");
		int ang2 = angulo.nextInt();
		System.out.println("Introduce el tercer ángulo del triángulo");
		int ang3 = angulo.nextInt();
		int suma = ang1+ ang2 + ang3;
		
		if(suma == 180) {
			System.out.println("Los ángulos ingresados son de un triángulo");
		}else {
			System.out.println("Los ángulos ingresados no son de un triángulo");
		}
		
		angulo.close();
		
		
		

	}

}

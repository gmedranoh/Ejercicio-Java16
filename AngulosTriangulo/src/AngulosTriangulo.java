import java.util.Scanner;

/*Crear un programa donde se introduzcan los tres �ngulos internos de un tri�ngulo y 
 * se determine si el tri�ngulo es v�lido o no.
*/

public class AngulosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner angulo = new Scanner (System.in);
		System.out.println("Introduce el primer �ngulo del tri�ngulo");
		int ang1 = angulo.nextInt();
		System.out.println("Introduce el segundo �ngulo del tri�ngulo");
		int ang2 = angulo.nextInt();
		System.out.println("Introduce el tercer �ngulo del tri�ngulo");
		int ang3 = angulo.nextInt();
		int suma = ang1+ ang2 + ang3;
		
		if(suma == 180) {
			System.out.println("Los �ngulos ingresados son de un tri�ngulo");
		}else {
			System.out.println("Los �ngulos ingresados no son de un tri�ngulo");
		}
		
		angulo.close();
		
		
		

	}

}

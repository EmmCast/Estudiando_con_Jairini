/*Elabore un algoritmo que lea los 3 lados de un triangulo cualquiera y calcule su área, 
 * considerar: si A,B y C son los lados, y S el semi perímetro 
 * A=√S*(S-A)*(S-B)*(S-C) 
 */
package Estudio;
public class T006_AareaTriangulo2 {
	public static void main (String arg[]) {
		StringBuffer impt=new StringBuffer();
		double A=FHERON(5, 6, 8);	
		impt.append("el area del triangulo por metod de Heron es ")
		.append(A);
		System.out.println(impt.toString());
	}
/**
 * es un metodo para calcular un area usando la formula de heron que es A=√S*(S-A)*(S-B)*(S-C) 
 * @param a lado a
 * @param b lado b
 * @param c lado c
 * @return ya regresara el area 
 */
	private static double FHERON(double a,double b,double c) {
		double res=0.0;
		double P=a+b+c;
		double S=P/2;
		res=Math.sqrt(S*(S-a)*(S-b)*(S-c));
		return res;
	}
}

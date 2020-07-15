//Se desea obtener el promedio simple de un estudiante a partir de sus 3 notas parciales
package Estudio;
public class T2_promedio {
	public static void main(String arg[]) {
		// double cal1,cal2,cal3;
		double prom = calt(8, 9, 10);
		System.out.println("el promedio es: " + prom);
	}
	/**
	 * un metodo que da el premedio a partir de susu 3 calificaciones 
	 * @param cal1 
	 * @param cal2 
	 * @param cal3
	 * @return retornara la calificacion de 3 parciales promediados
	 */
	public static Double calt(double cal1, double cal2, double cal3) {
		double res = ((cal1 + cal2 + cal3) / 3);
		return res;
	}
}

/*Elaborar un algoritmo que permita calcular el numero de CDs necesarios para hacer una copia de seguridad, de la información almacenada en un 
 * disco cuya capacidad se conoce, considerar que el disco duro esta lleno de información además expresando en gb y un cd virgen tiene 700 mb 
 * de capacidad y un gb es igual a 1024 mb
 */
package Estudio;
public class T007_memoria2 {
	public static void main (String arg[]) {
		StringBuffer impt=new StringBuffer();
		double R=ND(2.0);
		impt.append("El numero de discos que se necesitan para " )
		.append(R);
		System.out.println(impt.toString());
		
	}

	private static double ND(double G) {
		double res=0;
		res=Math.ceil((G*1024)/700);
		return res;
	}
}

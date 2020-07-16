/*Elaborar un algoritmo que solicite la edad de 2 hermano y 
 * muestree un mensaje indicando la edad del mayor y cuantos años es la diferencia con el menos 
 */
package Estudio;
public class T010_diferenciaedad {
	public static void main (String arg[]) {
		StringBuffer impt=new StringBuffer();
		String dif=Edad(15,18);
		impt.append(dif);
		System.out.println(impt.toString());
		
	}
	public static String Edad(int a,int b) {
		if (a>b) {
			return "El esmano A es mayor por "+ (a-b);
		}else if (a<b){
			return "El esmano B es mayor por "+ (a-b);
		}else {
			return "Ambos hermanos tienen la misma edad";
		}
	}
}

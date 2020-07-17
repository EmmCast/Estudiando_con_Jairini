/*Elabore un algoritmo que permita averiguar si una persona debe sacar su CUIL, sabiendo su año de nacimiento. 
 * El código único de identificación Laboral CUIL es el numero que se otorga a todo trabajador al inicio de su actividad laboral 
 *   en relaciona de dependencia (mayores de 17 años) que pertenezca ak sustenta u tefradi de jubilaciones (SIKP) y a 
 *   toda otra persona que gestione alguna presentación o servicio de seguridad social en la republica de argentina.
 */
package Estudio;
import java.time.*;
import java.util.*;
public class T009_CULI {
	public static void main(String[] args) {
		StringBuffer impt= new StringBuffer();
		int nac=Nacimiento(1991);
		
		//impt.append();
        
		
	}
	public static int Nacimiento(int nac){
		int res=0;
		Date date = new Date(); 
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
		int año = localDate.getYear();
		res=año-nac;
		if(res>17) {
			System.out.println("ya puedes sacar tu CULI ya tienes " + res);
		}else {
			System.out.println("aun te faltan no puede sacar tu CULI tienes " + res);
		}
		
		return res;
 		
	}
}

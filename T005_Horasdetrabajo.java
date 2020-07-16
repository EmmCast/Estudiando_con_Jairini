/*Se requiere un algoritmo para elaborar la plantilla de un empleado. 
 * Para ello se dispone de sus horas laboradas en el mes asi como la tarifa por hora.
 */
package Estudio;
public class T005_Horasdetrabajo {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		double sueldo=sueldo(31, 4, 8, 5500);
		int horas=horas(31, 4, 8);
		impt.append("las horas laboradas del mes son ")
		.append(horas)
		.append(" lo que cobro por hora es: ")
		.append(sueldo);
		System.out.println(impt.toString());
	}
	/**
	 * un metodo que indica cuanto cobro por hora tomando en cuenta las horas laboradas en ciertos dias
	 * @param DL dias del mes 
	 * @param DD dias descansados de dicho mes
	 * @param J  joprnada laboral 
	 * @param S  sueldo del mes 
	 * @return   devolvera el sueldo por dia 
	 */
	public static double sueldo(int DL,int DD,int J,double S) {
		double res0=0.0;
		res0=(S/(DL-DD))/J;
		return res0;	
	}
	/**
	 * un metodo para ver cuantas horas trabajo en un mes sin contar sus dias de descanso 
	 * @param DL dias del mes
	 * @param DD dias descansados de dicho mes 
	 * @param J  horas de jornada laboral
	 * @return  devolvera las horas de dichos dias 
	 */
	public static int horas(int DL,int DD, int J) {
		int res1=0;
		res1=(DL-DD)*J;
		return res1;
		
	}
}

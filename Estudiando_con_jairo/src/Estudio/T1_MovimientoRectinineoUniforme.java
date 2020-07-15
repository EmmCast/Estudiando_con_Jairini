/* Se desea calcular la distancia recorrida (m) por un automóvil que tiene velocidad constante (m/s) durante un Tiempo (seg),
 *  considerar que es un MRU(Movimiento rectilíneo uniforme).
 */
package Estudio;
public class T1_MovimientoRectinineoUniforme {
	public static void main(String[] args) {
		double Resultado=MRU(25, 5, 0, "distancia");
		System.out.println("el resultado es: " + Resultado);
	}
	/**
	 * el metodo en el cual se calcula el movimiento rectilinio uniforme 
	 * @param mts  es la unidad en la que se deve ungresar la distancia 
	 * @param tiem el tiempo se ingrsara en min 
	 * @param vel la velocidad recorrida
	 * @param Nececito el dato que se desea saber 
	 * @return regresa la operacion 
	 */
	public static Double MRU(double mts, double tiem, double vel, String Nececito) {
		double res=0.0;
		if(Nececito.equalsIgnoreCase("distancia")) {
			res= ((mts)*(tiem*60));
		}else if(Nececito.equalsIgnoreCase("Velocidad")) {
			res=((mts)/(tiem*60));
		}else if(Nececito.equalsIgnoreCase("distancia")){
			res=(mts/(tiem*60));
		}
		
		return res;		
	}
}

/*Se tiene los puntos A y B en el cuadrante positivo del plano cartesiano 
 * elaborar un algoritmo que permita obtener la distancia entre A y B
 */
package Estudio;
public class T008_planoCartesiano {
	public static void main (String arg[]) {
		StringBuffer impt=new StringBuffer();
		//double sum=Distancia(-3,6,5,1);
		double sum2=Distancia2(-3,1,1,-2);
		impt.append("la distancia es1  ")
		//.append(sum)
		//.append("\nla distancia es2  ")
		.append(sum2);
		System.out.println(impt.toString());
		
	}

	/**private static double Distancia(int x2,int x1,int y2,int y1 ) {
		double res=0;
		double c1=Math.pow(x2-x1,2);
		double c2=(y2-y2)*(y2-y2);
		res= Math.sqrt(c1+c2);
		return res;
	}
	*/
	/**
	 * metodo para Hayar la distancia entre 2 puntos en un plano cartesiano en sus 4 cuadrantes
	 * apoyado de la clase Math 
	 * @param x1  primera ubicacion en el plano carteciano 
	 * @param y1  primera ubicacion en el plano carteciano 
	 * @param x2  segunda ubicacion en el plano carteciano 
	 * @param y2  segunda ubicacion en el plano carteciano
	 * @return   ya retorna la distancia entre punto A y punto B 
	 */
	private static double Distancia2(int x1,int y1,int x2,int y2 ) {
		double res=0;
		//double c1=Math.pow(x2-x1,2)+Math.pow(y2-y1, 2);
		res= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		return res;

	}
}//
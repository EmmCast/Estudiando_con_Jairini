/*
 * Elabnora un algoritmo que permita ingresar el numero de partidos ganados perdidos y empatados, por algún equipo en el torneo de apertura,
 *  se debe de mostrar su puntaje total teniendo en cuenta que por cada partido ganado obtendrá 3 puntos, empatado 1 punto y perdido 0 puntos
 */
package Estudio;
public class T4_PuntajePartido {
	public static void main(String[] args) {
		StringBuffer impt=new StringBuffer();
		int P= Puntaje(3, 1, 0);
		impt.append("El puntaje total es de: ")
		.append(P);
		System.out.println(impt.toString());
	}
	/**
	 * metodo creado dar la puntuacion de un partido 
	 * @param G //partidos ganados 
	 * @param E //partidos perdidos
	 * @param P //partidos perdidos
	 * @return retornara el puntaje total del partido
	 */
	public static int Puntaje(int G, int E, int P) {
		int res = 0;
		res = (G * 3) + ((E * (1)) + (P * 0));
		return res;
	}
}

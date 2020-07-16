/*
 * Elaborar un algoritmo que solicite el número de respuestas correctas, incorrectas y en blanco correspondiente a postulantes y demuestre su puntaje 
 * final considerando, que por cada respuesta correcta tendrá 4 puntos, respuesta incorrecta -1 y respuesta en blanco 0.
 */
package Estudio;
public class T003_PuntosExamen {
	public static void main(String[] args) {
		StringBuffer impt = new StringBuffer();
		int P;
		P = Puntaje(2, 7, 0);
		impt.append("El puntaje total es de: ")
		.append(P);
		System.out.println(impt.toString());
	}
	/** un metodo sencillo en el cual se evalua el puntaje de un test de N preguntas
	 * @param C son las respuestas Correctas y tienen un valor de 4 cada 1
	 * @param I son las preguntas incorrectas y tienen un valor de -1 cada 1
	 * @param B son respuestas en blanco y tienen balor nulo
	 * @return regresara solo la operacion
	 */
	public static int Puntaje(int C, int I, int B) {
		int res = 0;
		res = (C * 4) + ((I * (-1)) + (B * 0));
		return res;
	}
}

package app;

import gui.Prueba;

/*cambio el comentario de prueba*/
public class Main {
	private static Ari ari = new Ari();
	
	public static void main(String[] args) {
		
		/*inicio app*/
		Prueba app = new Prueba();
		app.setVisible(true);
		
		// === Ejemplo del TP ==================================		
		ari.setCantColumnas(4);
		
		
		ari.setResultadoFila(1,10);
		ari.setResultadoFila(2,7);
		ari.setResultadoFila(3,8);
		ari.setResultadoFila(4,7);
		
		ari.setResultadoColumna(1, 7);
		ari.setResultadoColumna(2, 9);
		ari.setResultadoColumna(3, 9);
		ari.setResultadoColumna(4, 6);
		

		//jugar(int fila, int colu, int valor)
		ari.jugar(1, 1, 2);
		ari.jugar(1, 2, 1);
		ari.jugar(1, 3, 1);
		ari.jugar(1, 4, 1);
		
		ari.jugar(2, 1, 1);
		ari.jugar(2, 2, 2);
		ari.jugar(2, 3, 3);
		ari.jugar(2, 4, 1);

		ari.jugar(3, 1, 2);
		ari.jugar(3, 2, 4);
		ari.jugar(3, 3, 3);
		ari.jugar(3, 4, 3);

		ari.jugar(4, 1, 2);
		ari.jugar(4, 2, 2);
		ari.jugar(4, 3, 2);
		ari.jugar(4, 4, 1);
		
		System.out.println(ari.toString());
		System.out.println("Resuelto: " + ari.resuelto()+"\n\n");

		// === Ejemplo 2 =======================================		
		ari.setCantColumnas(2);
		
		ari.setResultadoColumna(1, 4);
		ari.setResultadoColumna(2, 3);
		
		ari.setResultadoFila(1,3);
		ari.setResultadoFila(2,4);
		
		ari.jugar(1, 1, 2);
		ari.jugar(1, 2, 1);
		
		ari.jugar(2, 1, 2);
		
		System.out.println(ari.toString());
		System.out.println("Resuelto: " + ari.resuelto()+"\n\n");

		ari.jugar(2, 2, 2);
		System.out.println(ari.toString());
		System.out.println("Resuelto: " + ari.resuelto()+"\n\n");
		
		// === Ejemplo 3 =======================================		
		ari.setCantColumnas(3);
		ari.llenarResultadosAleatorios();
		
		System.out.println(ari.toString());
		
		// =====================================================		
	}	
}

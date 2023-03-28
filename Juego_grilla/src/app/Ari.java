package app;

import java.util.Random;

public class Ari {

	private static int COLUMNAS = 4;
	private static int FILAS = COLUMNAS;
	private static int MAXIMOCELDA = COLUMNAS;
	private static int MAXIMORESULTADO = COLUMNAS*COLUMNAS;

	private static int [][] Tablero = new int[99][99];
	private static int [] TablaResulFilas = new int[99];
	private static int [] TablaResulColumnas = new int[99];

	//==================================================================

	public Ari() {
		reiniciar();
	}

	public Ari(int pColumnas) {
		if( pColumnas >0 && pColumnas < 100 ){		
			COLUMNAS = pColumnas;
		}

		reiniciar();
	}

	public void reiniciar(){
		MAXIMOCELDA= COLUMNAS*COLUMNAS;
		MAXIMORESULTADO= MAXIMOCELDA*MAXIMOCELDA;

		iniciarGrilla(Tablero);
		iniciarGrillaResultados(TablaResulFilas, TablaResulColumnas);
	}

	public void llenarResultadosAleatorios(){
		llenarResultadosAleatorios(TablaResulFilas, TablaResulColumnas);
	}

	// carga la matriz "Tablero" con todos ceros
	private static void iniciarGrilla(int [][] miGrilla){
		for (int fila=0;fila<FILAS;fila++)
			for (int colu=0;colu<COLUMNAS;colu++){
				miGrilla[fila][colu] = 0;
			}
	}

	private static void llenarResultadosAleatorios(int [] miGrillaFilas, int [] miGrillaColumnas ){
		int [][] miGrilla = Tablero; // creo la misma matriz que el de la variables de instancia
		int suma = 0;

		// carga una grilla con un numero random de columnas definidas
		llenarGrillaAleatoria(miGrilla,COLUMNAS);

		for (int fila=1; fila<=FILAS; fila++) {
			suma= totalFila( miGrilla, fila);
			setResultadoCelda(miGrillaFilas, fila, suma);
		}

		for (int colu=1; colu<=COLUMNAS; colu++){
			suma= totalColumna( miGrilla, colu);
			setResultadoCelda(miGrillaColumnas, colu, suma);
		}
	}

	//carga
	private static void llenarGrillaAleatoria(int [][] miGrilla, int tope ){
		for (int fila=0;fila<tope;fila++)
			for (int colu=0;colu<tope;colu++){
				miGrilla[fila][colu] = aleatorio(tope);
			}
	}


	private void iniciarGrillaResultados(int [] miGrillaFilas, int [] miGrillaColumnas){
		for (int fila=0;fila<FILAS;fila++)
			miGrillaFilas[fila] = 0;
		for (int colu=0;colu<COLUMNAS;colu++)
			miGrillaColumnas[colu] = 0;
	}

	private static int aleatorio(int tope){		
		Random rnd = new Random();
		return (rnd.nextInt(tope)+1);
	}

	public void jugar(int fila, int colu, int valor){
		if( (valor >0 && valor <= MAXIMOCELDA) && ( fila >0 && fila <= FILAS) && (colu >0 && colu <= COLUMNAS))
		{
			Tablero[fila-1][colu-1] = valor;
		}
	}

	public int valorResultadoFila(int fila){
		int valor = 0;

		if( fila >0 && fila <= FILAS) 
			valor= TablaResulFilas[fila-1];

		return valor;
	}

	public int valorResultadoColumna(int colu){
		int valor = 0;

		if( colu >0 && colu <= COLUMNAS) 
			valor= TablaResulColumnas[colu-1];

		return valor;
	}

	private static void setResultadoCelda(int [] miGrillaResultados, int celda, int valor){
		if( (valor >= COLUMNAS && valor <= MAXIMORESULTADO) && ( celda >0 && celda <= COLUMNAS) )
			miGrillaResultados[celda-1] = valor;
	}

	// ------carga los resultados finales de las filas y columnas -------
	public void setResultadoFila(int fila, int valor){
		if( (valor >= FILAS && valor <= MAXIMORESULTADO) && ( fila >0 && fila <= FILAS) )
			TablaResulFilas[fila-1] = valor;
	}

	public void setResultadoColumna(int colu, int valor){
		if( (valor >= COLUMNAS && valor <= MAXIMORESULTADO) && ( colu >0 && colu <= COLUMNAS))
			TablaResulColumnas[colu-1] = valor;
	}
	//-------------------------------------------------------------------
	public int totalFila( int fila){
		return totalFila(Tablero, fila);
	}	

	public int totalColumna( int colu){
		return totalColumna(Tablero, colu);
	}	

	private static int totalFila(int [][] miGrilla, int fila){
		int suma= 0;

		if( (fila >0 && fila <= FILAS))
			for (int colu=0;colu<COLUMNAS;colu++){
				suma+= miGrilla[fila-1][colu];
			}


		return suma;
	}

	private static int totalColumna(int [][] miGrilla, int colu){
		int suma= 0;

		if( (colu >0 && colu <= COLUMNAS))
			for (int fila=0;fila<FILAS;fila++)
				suma+= miGrilla[fila][colu-1];

		return suma;
	}

	public boolean resuelto( ){
		return resuelto(Tablero, TablaResulFilas, TablaResulColumnas);
	}	

	public void setCantColumnas(int columnas){
		if ((columnas >1) && (columnas<100)) {
			COLUMNAS= columnas;
			FILAS= COLUMNAS;
			reiniciar();
		}
	}


	public int cantColumnas(){
		return COLUMNAS;
	}

	private static boolean resuelto(int [][] miGrilla,int [] miTablaResulFilas,int [] miTablaResulColumnas){
		for (int fila=0; fila<FILAS; fila++)
			if (miTablaResulFilas[fila] != totalFila(miGrilla,fila+1))
				return false;

		for (int colu=0; colu<COLUMNAS; colu++)
			if (miTablaResulColumnas[colu] != totalColumna(miGrilla,colu+1))
				return false;

		return true;
	}

	// Duvuelve el valor de un casillero de la matriz
	public int valor(int fila, int colu){
		int v = 0;

		if( ( fila >0 && fila <= FILAS) && (colu >0 && colu <= COLUMNAS))
			v= (Tablero[fila-1][colu-1]);

		return v;
	}

	//carga un valor en casillero de la matriz 
	public void valor(int fila, int colu, int valor){
		if( ( fila >0 && fila <= FILAS) && (colu >0 && colu <= COLUMNAS))
			Tablero[fila-1][colu-1]= valor;
	}

	public String toString(){		
		String s = "";

		s = s + "  ";
		for(int colu=1;colu<=cantColumnas();colu++)
			s= s + "______";
		s= s + "\n";

		for(int fila=1;fila<= cantColumnas();fila++){
			s = s + " | ";
			for(int colu=1;colu<= cantColumnas();colu++)
				s= s + String.format("%2d  | ", valor(fila, colu));

			s= s + String.format("%3d  \n", valorResultadoFila(fila)) ;
		}

		s = s + "  ";
		for(int colu=1;colu<=cantColumnas();colu++)
			s= s + "______";
		s= s + "\n";

		s = s + "  ";
		for(int colu=1;colu<=cantColumnas();colu++)
			s= s + String.format("%3d   ", valorResultadoColumna(colu));
		s= s + "\n";

		return s;
	}

}

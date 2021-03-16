package Dominio.Clases;

/**
 * Clase para las casillas Blancas, donde se colocan los n�meros
 * @author V�ctor Villarejo
 */

public class Blanca extends Cell{
	/**
	 * El n�mero que contiene la casilla Blanca.
	 * Por defecto ser� el 0.
	 */
  private int numero;

  /**
   * N�mero usado para la comprobaci�n de soluciones.
   */
  private int numero_correcto;
  
  /**
   * N�mero usado para el numero de la fila al que se juega.
   */
  private int numero_fila;
  /**
   * N�mero usado para el numero de la columna al que se juega.
   */
  private int numero_columna;
  /**
   * N�mero usado para el numero de celdas que componen la fila jugable.
   */
  
  private int celdas_fila;
  
  /**
   * N�mero usado para el numero de celdas que componen la columna jugable.
   */
  
  private int celdas_columna;
  
  
  public Blanca(){
	  
  }
	/**
	 * Creadora de Blanca con par�metros.
	 * @param numero N�mero introducizo.
	 * @param numero_correcto N�mero correcto de la soluci�n.
	 */
  public Blanca(int numero, int numero_correcto) {
      this.numero = numero;
      this.numero_correcto = numero_correcto;
  }
  
  
	/**
	 * Consulta el numero escrito en la casilla.
	 * @return N�mero de casilla.
	 */
  public int getNumero(){
    return numero;
  }
  
	/**
	 * Consulta el n�mero correcto de una casilla de un kakuro.
	 * @return N�mero correcto de casilla.
	 */
  public int getNumeroCorrecto(){
    return this.numero_correcto;
  }
  
  /**
   * Modifica el n�mero de la casilla.
   * @param x N�mero a introducir en la casilla.
   */
  public void setNumero(int x){
	  if(x < 10 && x >= 0) {
		  numero = x;
	  }
    
  }
  
/**
 * Asigna el n�mero correcto de la casilla para un kakuro.
 * @param y N�mero a a�adir.
 */
  public void setNumeroCorrecto(int y){
	  if(y < 10 && y >= 0) {
		  this.numero_correcto = y;
	  }
	  
  }
	/**
	 * Consulta el numero de fila
	 * @return N�mero de fila
	 */ 
  	public int getNumero_fila() {
		return numero_fila;
	}
  	/**
  	 * Asigna el numero pasado como parametro a numero fila.
  	 * @param numero_fila N�mero a asignar a numero fila.
  	 */
  	
	public void setNumero_fila(int numero_fila) {
		this.numero_fila = numero_fila;
	}
	/**
	 * Consulta el numero de columna
	 * @return N�mero de columna
	 */ 
	public int getNumero_columna() {
		return numero_columna;
	}
	/**
  	 * Asigna el numero pasado como parametro a numero columna.
  	 * @param numero_columna N�mero a asignar a numero columna.
  	 */
	public void setNumero_columna(int numero_columna) {
		this.numero_columna = numero_columna;
	}
	
	/**
	 * Consulta el numero de celdas jugables de la fila
	 * @return N�mero de celdas fila
	 */
	public int getCeldas_fila() {
		return celdas_fila;
	}
	/**
  	 * Asigna el numero pasado como parametro a celdas fila.
  	 * @param celdas_fila N�mero a asignar a celdas fila.
  	 */
	public void setCeldas_fila(int celdas_fila) {
		this.celdas_fila = celdas_fila;
	}
	/**
	 * Consulta el numero de celdas jugables de la columna
	 * @return N�mero de celdas columna
	 */
	public int getCeldas_columna() {
		return celdas_columna;
	}
	/**
 	 * Asigna el numero pasado como parametro a celdas columna.
  	 * @param celdas_columna N�mero a asignar a celdas columna.
  	 */
	public void setCeldas_columna(int celdas_columna) {
		this.celdas_columna = celdas_columna;
	}
}

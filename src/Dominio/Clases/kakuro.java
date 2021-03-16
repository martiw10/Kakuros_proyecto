/**
 * Clase kakuro
 */
package Dominio.Clases;

/**
 * Clase encargada de las funciones leer, escribir, guardar kakuro en fichero y crear el tablero
 * @author F�lix Forroll
 */

public class kakuro  {
  /**
   * Matriz de tipo Cell que representa el tablero del kakuro
   */
  private Cell[][] tablero;
  /**
   * N�mero de filas
   */
  private int n;
  /**
   * N�mero de columnas
   */
  private int m;
  /** 
   * N�mero de blancas que dispone el tablero
   */
  private int numeroBlancas;
  /** 
  * N�mero de identificador del tablero
  */
 private int identificador;
 
  /**
   * Creadora de kakuro
   */
  public kakuro() {
	 
  }
  /**
   * Creadora de kakuro con par�metros
   * @param tablero Matriz de tipo Cell
   * @param n N�mero de filas
   * @param m N�mero de columnas
   * @param numeroBlancas N�mero de blancas que dispone el tablero
   */
  public kakuro(Cell[][] tablero, int n, int m, int numeroBlancas, int id) {
	  this.tablero = tablero;
	  this.n = n;
	  this.m = m;
	  this.numeroBlancas = numeroBlancas;
	  this.identificador= id;
  }
  /**
   * Consulta el tablero
   * @return Tablero
   */
  public Cell[][] getTablero(){
	  return tablero;
  }
  /**
   * Consulta el n�mero de filas
   * @return N�mero de filas
   */
  public int getN(){
	  return n;
  }
 
  /**
   * Consulta el n�mero de columnas
   * @return N�mero de columnas
   */
  public int getM(){
	  return m;
  }
  /**
   * Consulta el n�mero de blancas que dispone el tablero
   * @return N�mero de blancas
   */
  public int getnumeroBlancas(){
	  return numeroBlancas;
  }
  
  /**
   * Consulta el identificador del tablero
   * @return identificador
   */
  public int getid(){
	  return identificador;
  }
  
  /**
   * Modifica el tablero
   * @param tablero Matriz de tipo Cell
   */
  public void setTablero(Cell[][]tablero){
	  this.tablero = tablero;
  }
/**
   * Modifica el n�mero de filas
   * @param N�mero de filas
   */
  public void setN(int n){
	  this.n = n;
  }
 
  /**
   * Modifica el n�mero de columnas
   * @param N�mero de columnas
   */
  public void setM(int m){
	  this.m = m;
  }
  /**
   * Modifica el n�mero de blancas que dispone el tablero
   * @param N�mero de blancas
   */
  public void setnumeroBlancas(int numeroBlancas){
	  this.numeroBlancas = numeroBlancas;
  }
  
  /**
   * Modifica el identificador del tablero
   * @param identificador
   */
  public void setid(int id){
	  this.identificador = id;
  }
  
  
}
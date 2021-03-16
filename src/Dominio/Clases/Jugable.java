package Dominio.Clases;
import java.util.*;

/**
 * Clase para las casillas Negras encargadas de guardar el valor de sus respectivas filas/columnas
 * @author F�lix Forroll
 */

public class Jugable extends Negra{
	/**
	 * Numero de la Fila 
	 */
  private int num_Fila;
  	/**
	 * Numero de la Columna 
	 */
  private int num_Columna;
  	/**
	 * Set que guarda los numeros existentes para una fila concreta 
	 */
  private Set<Integer> set_fila = new HashSet<Integer>();
  	/**
	 * Set que guarda los numeros existentes para una columna concreta 
	 */
  private Set<Integer> set_columna = new HashSet<Integer>();
  
  /**
   * Numero de celdas disponibles
   */
  private int celdas_dispo;

 
  /**
   * Creadora de Jugable
   */
  public Jugable() {
	 
  }
	/**
	 * Creadora de Jugable con par�metros
	 * @param num_fila N�mero de la fila
	 * @param num_Columna N�mero de la columna
	 * @param set_fila Contiene los n�meros existentes para una fila concreta
	 * @param set_columna Contiene los n�meros existentes para una columna concreta
	 */
  public Jugable(int num_fila, int num_Columna, Set<Integer> set_fila, Set<Integer> set_columna) {
	  this.num_Fila = num_fila;
	  this.num_Columna = num_Columna;
	  this.set_fila = set_fila;
	  this.set_columna = set_columna;
  }
  
  	/**
	 * Consulta el numero de columna
	 * @return N�mero de columna
	 */
  public int getnum_Columna(){
	  return num_Columna;
  }
  	/**
	 * Consulta el numero de fila
	 * @return N�mero de fila
	 */
  public int getnum_Fila(){
	  return num_Fila;
  }
  	/**
	 * Modifica el set de n�meros de una fila
	 */
  public void setnum_Fila(int y){
	  this.num_Fila = y;
  }
  	/**
	 * Modifica el set de n�meros de una columna
	 */
  public void setnum_Columna(int x){
	  this.num_Columna = x;
  }
  
  /**
   * Modifica el numero de celdas disponibles
   * @param x Nuevo numero de celdas disponibles
   */
  public void setceldas_dispo(int x) {
	  this.celdas_dispo = x;
  }
  	/**
	 * A�ade un n�mero a la suma total de la fila
	 * @param y N�mero a sumar
	 */
  public void actualizaF(int y){
	  this.num_Fila += y;
  }
  	/**
	 * A�ade un n�mero a la suma total de la columna
	 * @param x N�mero a sumar
	 */
  public void actualizaC(int x){
	  this.num_Columna += x;
  }
  
  /**
   * Comprueba si ya existe un n�mero en el set de fila, y si no, lo a�ade
   * @param x N�mero a a�adir
   * @return El resultado de intentar a�adir el n�mero(True/False)
   */
  public Boolean add_setfila(int x) {
	  return set_fila.add(x);
  }
  /**
   * Comprueba si ya existe un n�mero en el set de columna, y si no, lo a�ade
   * @param x N�mero a a�adir
   * @return El resultado de intentar a�adir el n�mero(True/False)
   */
  public Boolean add_setcol(int x) {
	  return set_columna.add(x);
  }
  
  /**
   * Elimina un n�mero en el set de fila, si existe
   * @param x N�mero a eliminar
   */
  public void del_setfila(int x) {
	  set_fila.remove(x);
  }
  
  /**
   * Elimina un n�mero en el set de columna, si existe
   * @param x N�mero a eliminar
   */
  public void del_setcol(int x) {
	  set_columna.remove(x);
  }
  
/**
 * Consulta el set de columna
 * @return Set de columna
 */
  public Set<Integer> getset_Columna(){
	  return this.set_columna;
}
/**
* Consulta el set de fila
* @return Set de fila
*/
  public Set<Integer> getset_Fila(){
	  return this.set_fila;
}
  
  
  
/**
 * Detecta si la suma de una fila es correcta
 * @param actSuma True si queremos actualizar el valor de num_Fila
 * @return Devuelve si el n�mero supera la suma de la casilla (True/False)
 */
  public Boolean sumafila(boolean actSuma) {
	 int suma = 0;
	  Iterator<Integer> it = set_fila.iterator();
	  while(it.hasNext()) {
			  suma += it.next();
		  }
	  if(actSuma) num_Fila = suma;
	  if(num_Fila >= suma) return true;
	  else return false;
  }
  
  
  /**
   * Detecta si la suma de una columna es correcta
   * @param actSuma True si queremos actualizar el valor de num_Columna
   * @return Devuelve si el n�mero supera la suma de la casilla (True/False)
   */
  public Boolean sumacol(boolean actSuma) {
	  int suma = 0;
	  Iterator<Integer> it = set_columna.iterator();
	  while(it.hasNext()) {
			  suma += it.next();
		  }
	  if(actSuma) num_Columna = suma;
	  if(num_Columna >= suma) return true;
	  else return false;
  }
  
  /**
   * Compara si las sumas actuales de una fila y columna coincide con la suma que deberia tener
   * @return El resultado de comprobar si las sumas son las que deberian(True/False)
   */
  public Boolean comprSumas() {
	  int sumaF = 0;
	  int sumaC = 0;
	  Iterator<Integer> it = set_fila.iterator();
	  Iterator<Integer> it2 = set_columna.iterator();
	  while(it.hasNext()) {
			  sumaF += it.next();
		  }
	  while(it2.hasNext()) {
		  sumaC += it2.next();
	  }
	  if(num_Fila != sumaF || num_Columna != sumaC) return false;
	  else return true;
  }
}

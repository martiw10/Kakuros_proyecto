package Dominio.Controladores;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import Dominio.Clases.Usuario;
import Persistencia.CtrlPersistencia;
/**
 * Clase para las operaciones relacionadas con Usuarios
 * @author Martí Westermeyer
 */
public class CtrlUsuario {
	/**
	 * Booleano para saber si se ha modificado la tabla
	 */
	private boolean dirty;
	/**
	 * Set de Usuarios
	 */
	HashSet<Usuario> usuarios = new HashSet<Usuario>();
	/**
	 * Guarda en el set los uusarios del txt
	 */
	public void cargar_usuarios() {
		
        try {
        	List<List<String>> aux = CtrlPersistencia.cargarTablaUsuarios();

            for (List<String> fila : aux) {
                usuarios.add(new Usuario(fila.get(0), fila.get(1)));
            }
        }
        catch (Exception e) {
		    System.out.println(e);
        } 
        /*
        Iterator<Usuario> iter = usuarios.iterator();
        while (iter.hasNext()) System.out.println(iter.next().getUsuario());
        */
	}
	
	/**
	 * Devuelve el numero de usuarios en usuarios
	 * @return el numero de usuarios
	 */
	public int getNumUsuarios() {
		return this.usuarios.size();
	}
	
	/**
	 * Consulta los usuarios
	 * @return Set de usuarios
	 */
	public HashSet<Usuario> getUsuarios() {
		return usuarios;
	}
	/**
	 * Consulta un único Usuario
	 * @param nombre Nombre del Usuario
	 * @return Usuario seleccionado
	 */
	public Usuario getUsuario(String nombre) {
      for (Usuario aux : usuarios) {
        if (Objects.equals(aux.getUsuario(), nombre)) 
          return aux;
      }
      return null; 
	}
	/**
	 * Borra el Usuario pasado por parámetro
	 * @param nombre Nombre del Usuario
	 */
	public void eliminarUsuario(String nombre) {
	  Usuario aux = getUsuario(nombre);
      if (aux != null) {
              dirty = usuarios.remove(aux);
      }
      else System.out.println("No existe el usuario");
      end();
      dirty = false;
	}
	/**
	 * Añade el Usuario pasado por parámetro
	 * @param nombre Nombre del Usuario
	 * @param contraseña Contraseña del Usuario
	 * @return Si el usuario se ha añadido correctamente
	 */
	public boolean añadirUsuario(String nombre, String contraseña) {
		boolean ret = false;
		  Usuario aux = getUsuario(nombre);
	      if (aux == null) {
	    	  Usuario nuevo = new Usuario(nombre, contraseña);
	    	  ret = usuarios.add(nuevo);
	    	  dirty = ret;
	      }
	      else System.out.print("Ya existe ese Usuario");
	      end();
	      dirty = false;
	      return ret;
	}
	/**
	 * Comprueba contraseña correcta
	 * @param nombre Nombre del Usuario
	 * @param contraseña Contraseña del Usuario
	 * @return true si la contraseña es correcta, en caso contrario false
	 */
    public boolean comprobarContraseña(String nombre, String contraseña) {
      boolean ret = false;
  	  Usuario aux = getUsuario(nombre);
      if (aux != null) {
          ret = aux.contraseñaCorrecta(contraseña);
      }
      else System.out.print("No existe el usuario");
      return ret;
    }
    /**
     * Modifica la contraseña del Usuario pasado por parámetro
     * @param nombre Nombre del Usuario
     * @param nuevaContraseña Nueva Contraseña del Usuario
     */
	public void modificarUsuarioContraseña(String nombre, String nuevaContraseña) {
		  Usuario aux = getUsuario(nombre);
	      if (aux != null) {
	    	  aux.setContraseña(nuevaContraseña);
	          dirty = true;
	      }
	      else System.out.println(dirty);
	      end();
	      dirty = false;
	}
	/**
	 * Función para modificar el fichero si ha habido cambios
	 */
	private void end() {
		if (dirty) {
	        try {
	            CtrlPersistencia.guardarTablaUsuarios(usuarios);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	}
}

package Dominio.Clases;
/**
 * Clase para los Usuarios
 * @author F�lix Forroll
 */
public class Usuario {
	/**
	 * Nombre del usuario, no se puede repetir
	 */
	private String usuario;
	/**
	 * Contrase�a del usuario
	 */
	private String contrase�a;
	/**
	 * Creadora por defecto de Usuario
	 */
    public Usuario() {
    	usuario = null;
    	contrase�a = null;
    }
    /**
     * Creadora con valores del usuario
     * @param usuario Nombre del usuario
     * @param contrase�a Contrase�a del usuario
     */
    public Usuario(String usuario, String contrase�a) {
    	this.usuario = usuario;
    	this.contrase�a = contrase�a;
    }
    /**
     * Consulta el nombre del Usuario
     * @return Nombre del Usuario
     */
    public String getUsuario() {
    	return usuario;
    }
    /**
     * Consulta la contrase�a del Usuario
     * @return Contrase�a del Usuario
     */
    public String getContrase�a() {
    	return contrase�a;
    }
	/**
	 * Modifica el nombre del Usuario
	 * @param usuario Nombre del Usuario
	 */
    public void setUsuario(String usuario) {
    	this.usuario =  usuario;
    }
    
    /**
     * Modifica la contrase�a del Usuario
     * @param contrase�a Contrase�a del Usuario
     */
    public void setContrase�a(String contrase�a) {
    	this.contrase�a =  contrase�a;
    }
    /**
     * Comprueba si la contrase�a es correcta
     * @param contrase�a Contrase�a del Usuario
     * @return True si es correcta, en caso contrario false
     */
    public boolean contrase�aCorrecta(String contrase�a) {
        return usuario != null && this.contrase�a.equals(contrase�a);
    }
}

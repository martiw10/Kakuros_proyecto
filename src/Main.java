import Presentacion.CtrlPresentacion;

/**
 * Mï¿½todo principal para Kakuro
 * @author Martï¿½ Westermeyer
 */
public class Main {
    private static CtrlPresentacion CP;
    
    public static void main (String[] args) throws Exception {
    	javax.swing.SwingUtilities.invokeLater (
    			new Runnable() {
    				public void run () {
    	    	    	System.out.println("Iniciando controlador de presentación...");
    	    	    	CP = new CtrlPresentacion();
    				}
    			}
    	);
    }
}
import Presentacion.CtrlPresentacion;

/**
 * M�todo principal para Kakuro
 * @author Mart� Westermeyer
 */
public class Main {
    private static CtrlPresentacion CP;
    
    public static void main (String[] args) throws Exception {
    	javax.swing.SwingUtilities.invokeLater (
    			new Runnable() {
    				public void run () {
    	    	    	System.out.println("Iniciando controlador de presentaci�n...");
    	    	    	CP = new CtrlPresentacion();
    				}
    			}
    	);
    }
}
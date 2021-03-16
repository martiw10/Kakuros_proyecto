package Dominio.Controladores.Tests;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;

import Dominio.Clases.Pair;
import Dominio.Clases.Usuario;
import Dominio.Controladores.CtrlRankings;
import Dominio.Controladores.CtrlUsuario;

/**
 * Driver del Controlador De Usuarios
 * @author Rub�n Montagut
 */

public class DriverCtrlUsuarios {

	
	/**
   	 * Carga los todos los usuarios que haya
   	 * @param CU CtrlUsuario
   	 */
    public static void testCargarUsuarios(CtrlUsuario CU) throws Exception{
        CU.cargar_usuarios();
    };
    
    
    /**
   	 * Imprime por pantalla el numero de usuarios que hay en CU
   	 * @param CU CtrlUsuario
   	 */
    public static void testGetNumUsuarios(CtrlUsuario CU) throws Exception{
        System.out.println("Cantidad de Usuarios: " + CU.getNumUsuarios());
    };
	
    
    /**
   	 * Imprime por pantalla todos los nombres de los usuarios
   	 * @param CU CtrlUsuario
   	 */
    public static void testGetUsuarios(CtrlUsuario CU) throws Exception{
        HashSet<Usuario> aux = CU.getUsuarios();
        Iterator<Usuario> it = aux.iterator();
        
        while(it.hasNext()) {
        	System.out.println(it.next().getUsuario());
        }
    };
    
    
    /**
   	 * Imprime por pantalla el nombre y la contrase�a del usuario especificado
   	 * @param CU CtrlUsuario, nombre String
   	 */
    public static void testGetUsuario(CtrlUsuario CU, String nombre) throws Exception{
        Usuario aux = CU.getUsuario(nombre);
        System.out.println(aux.getUsuario() + " " + aux.getContrase�a());
    };
    
    /**
   	 * Elimina el usuario especificado con el nombreusuario = nombre
   	 * @param CU CtrlUsuario, nombre String
   	 */
    public static void testEliminarUsuario(CtrlUsuario CU, String nombre) throws Exception{
    	CU.eliminarUsuario(nombre);
    };
    
    
    /**
   	 * A�ade un usuario con nombreusuario nombre y contrase�a contrase�a
   	 * @param CU CtrlUsuario, nombre String, contrase�a String
   	 */
    public static void testA�adirUsuario(CtrlUsuario CU, String nombre, String contrase�a) throws Exception{
    	CU.a�adirUsuario(nombre, contrase�a);
    };
    
    
    /**
   	 * Comprueba si la contrase�a especificada corresponde al usuario con el nombre especificado
   	 * @param CU CtrlUsuario, nombre String, contrase�a String
   	 */
    public static void testComprobarContrase�a(CtrlUsuario CU, String nombre, String contrase�a) throws Exception{
    	boolean aux = CU.comprobarContrase�a(nombre, contrase�a);
    	if (aux) System.out.println("Contrase�a correcta");
    	else System.out.println("Contrase�a incorrecta");
    };
    
    
    /**
   	 * Modifica el usuaro con nombreusuario nombre y le asigna la nueva contrase�a novacontrase�a
   	 * @param CU CtrlUsuario, nombre String, novacontrase�a String
   	 */
    public static void testModificarUsuarioContrase�a(CtrlUsuario CU, String nombre, String novacontrase�a) throws Exception{
    	CU.modificarUsuarioContrase�a(nombre, novacontrase�a);
    };
    
    
    
public static void main (String [] args) throws Exception{
    	
    	Scanner s = new Scanner(System.in);
    	
    	CtrlUsuario CU = new CtrlUsuario();
    	System.out.println("Introduce el n�mero correspondiente a la funci�n que se quiera testear:");
        System.out.println("1- Test CargarUsuarios()");
        System.out.println("2- Test GetNumUsuarios()");
        System.out.println("3- Test GetUsuarios()");
        System.out.println("4- Test GetUsuario()");
        System.out.println("5- Test EliminarUsuario()");
        System.out.println("6- Test A�adirUsuario()");
        System.out.println("7- Test ComprobarContrase�a()");
        System.out.println("8- Test ModificarUsuarioContrase�a()");
        System.out.println("-1- Salir");
  

        int op = s.nextInt();
        while(op != -1){
            switch (op) {
                case 1: testCargarUsuarios(CU);
                        break;
                case 2: testGetNumUsuarios(CU);
                        break;
                case 3: testGetUsuarios(CU);
                        break;
                case 4: System.out.println("Introduce el nombre del usuario que quieres obtener");
                		String b = s.next();	
                		testGetUsuario(CU,b);
                        break;
                case 5: System.out.println("Introduce el nombre del usuario que quieres eliminar");
        				String c = s.next();
                		testEliminarUsuario(CU, c);
                        break;
                case 6: System.out.println("Introduce el nombre y la contrase�a del usuario que quieres a�adir");
						String d = s.next();
						String e = s.next();
		        		testA�adirUsuario(CU, d, e);
		                break;
                case 7: System.out.println("Introduce el nombre del usuario y la contrase�a para comprobar si es la correcta");
						String f = s.next();
						String g = s.next();
		        		testComprobarContrase�a(CU, f, g);
		                break;
                case 8: System.out.println("Introduce el nombre del usuario que quieres cambiar la contrase�a y la nueva contrase�a");
						String h = s.next();
						String i = s.next();
		        		testModificarUsuarioContrase�a(CU, h, i);
		                break;
		                
              }
	            System.out.println("Introduce el n�mero correspondiente a la funci�n que se quiera testear:");
	            System.out.println("1- Test CargarUsuarios()");
	            System.out.println("2- Test GetNumUsuarios()");
	            System.out.println("3- Test GetUsuarios()");
	            System.out.println("4- Test GetUsuario()");
	            System.out.println("5- Test EliminarUsuario()");
	            System.out.println("6- Test A�adirUsuario()");
	            System.out.println("7- Test ComprobarContrase�a()");
	            System.out.println("8- Test ModificarUsuarioContrase�a()");
	            System.out.println("-1- Salir");
	            op = s.nextInt();
        }
    	
    
    }
    
}

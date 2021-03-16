package Dominio.Controladores.Tests;

import java.util.Scanner;


import Dominio.Clases.Pair;
import Dominio.Clases.Ranking;
import Dominio.Clases.Usuario;

/**
 * Driver del Usuario
 * @author V�ctor Villarejo
 */

public class DriverUsuario {
	
	/**
   	 * Retorna el nombre del usuario
   	 * @param usuario Usuario
   	 */
    public static void testGetUsuario(Usuario usuario) throws Exception{
        System.out.println(usuario.getUsuario());   
    };
    
    
    /**
   	 * Retorna la contrase�a del usuario
   	 * @param usuario Usuario
   	 */
    public static void testGetContrase�a(Usuario usuario) throws Exception{
        System.out.println(usuario.getContrase�a());   
    };
    
    
    /**
   	 * Configura el nombre usuario de usuario
   	 * @param usuario nombre usuario
   	 * @param nomU String
   	 */
    public static void testSetUsuario(Usuario usuario, String nomU) throws Exception{
        usuario.setUsuario(nomU);   
    };
    
    
    /**
   	 * Configura la contrase�a de usuario
   	 * @param usuario Usuario
   	 * @param contr String
   	 */
    public static void testSetContrase�a(Usuario usuario, String contr) throws Exception{
        usuario.setContrase�a(contr);   
    };
    
    
    /**
   	 * Comprueba si es la contrase�a es correcta
   	 * @param usuario Usuario
   	 * @param contr String
   	 */
    public static void testContrase�aCorrecta(Usuario usuario, String contr) throws Exception{
        boolean aux = usuario.contrase�aCorrecta(contr);   
        if (aux) System.out.println("Contrase�a correcta");
        else System.out.println("Contrase�a incorrecta");
    };
    
    
    
public static void main (String [] args) throws Exception{
    	
    	Scanner s = new Scanner(System.in);
    	
    	Usuario usuario = new Usuario();
    	System.out.println("Introduce el n�mero correspondiente a la funci�n que se quiera testear:");
        System.out.println("1- Test GetUsuario()");
        System.out.println("2- Test GetContrase�a()");
        System.out.println("3- Test SetUsuario()");
        System.out.println("4- Test SetContrase�a()");
        System.out.println("5- Test Contrase�aCorrecta()");
        System.out.println("-1- Salir");
  

        int op = s.nextInt();
        while(op != -1){
            switch (op) {
                case 1: testGetUsuario(usuario);
                        break;
                case 2: testGetContrase�a(usuario);
                        break;
                case 3: System.out.println("Introduce el nombre de usuario");
                		String n = s.next();
                		testSetUsuario(usuario,n);
                        break;
                case 4: System.out.println("Introduce la contrase�a del usuario");
                		String m = s.next();
                		testSetContrase�a(usuario,m);
                        break;
                case 5: System.out.println("Introduce el nombre de usuariola contrase�a para comprobar si es la correcta");
        				String l = s.next();
                		testContrase�aCorrecta(usuario,l);
                        break;
              }
	            System.out.println("Introduce el n�mero correspondiente a la funci�n que se quiera testear:");
	            System.out.println("1- Test GetUsuario()");
	            System.out.println("2- Test GetContrase�a()");
	            System.out.println("3- Test SetUsuario()");
	            System.out.println("4- Test SetContrase�a()");
	            System.out.println("5- Test Contrase�aCorrecta()");
	            System.out.println("-1- Salir");
	            op = s.nextInt();
        }
    	
    
    }
}

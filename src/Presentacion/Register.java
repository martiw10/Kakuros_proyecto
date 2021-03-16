package Presentacion;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;


/** \file Register.java
 *  Clase destinada a registrar un nuevo usuario
 *
 */

public class Register {

	private JFrame frame;
	private CtrlPresentacion CP;
	
	private JLabel titulo;
	private JLabel userLabel;
	private JTextField userText;
	private JLabel passwordLabel;
	private JPasswordField passwordText;
	private JLabel passwordLabel2;
	private JPasswordField passwordText2;
	private JButton Registrar;
	private BasicArrowButton retorno;
	private JLabel logo;
	private JLabel fondo;


	
	public Register(CtrlPresentacion CP) {
		
		this.CP = CP;
		initialize();
		frame.setVisible(true);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	    int height = pantalla.height;
	    int width = pantalla.width;
	    frame.setSize(width/2, height/2);
	    frame.setLocationRelativeTo(null);
	    frame.setResizable(false);
	    frame.setSize(new java.awt.Dimension(800, 600));
	}

	
	private void initialize() {
		frame = new JFrame("KAKURO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();	
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		logo = new JLabel();
		logo.setIcon(new javax.swing.ImageIcon("src/Presentacion/img/logo.png"));
		logo.setBounds(682, 26, 44, 53);
		panel.add(logo);
		Image icon = Toolkit.getDefaultToolkit().getImage("src/Presentacion/img/icon.png");
		frame.setIconImage(icon);
		
		retorno = new BasicArrowButton(BasicArrowButton.WEST);
		retorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retornoActionPerformed(e);
			}
		});
		retorno.setBounds(36, 30, 50, 25);
		panel.add(retorno);
		
		titulo = new JLabel("Registro");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Segoe Print", Font.PLAIN, 36));
		titulo.setBounds(0, 31, 784, 54);
		panel.add(titulo);
		
		userLabel = new JLabel("Usuario");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		userLabel.setBounds(0, 125, 392, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(331, 125, 392, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Contrase�a");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		passwordLabel.setBounds(0, 196, 392, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(331, 196, 392, 25); 
		panel.add(passwordText);
		
		passwordLabel2 = new JLabel("Confirmar contrase�a");
		passwordLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel2.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		passwordLabel2.setBounds(0, 262, 392, 25);
		panel.add(passwordLabel2);

		passwordText2 = new JPasswordField(20);
		passwordText2.setBounds(331, 265, 392, 25);
		panel.add(passwordText2);

		Registrar = new JButton("Registrar usuario");
		Registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarActionPerformed(e);
			}
		});
		Registrar.setBounds(316, 365, 150, 50);
		panel.add(Registrar);
		
		fondo = new JLabel();
		fondo.setIcon(new javax.swing.ImageIcon("src/Presentacion/img/fondo.png"));
		fondo.setBounds(0, 0, 784, 561);
		panel.add(fondo);
	}
	
	public void RegistrarActionPerformed(ActionEvent e) {
        String nombre = userText.getText();
        String contrase�a = String.valueOf(passwordText.getPassword());
        String contrase�a2 = String.valueOf(passwordText2.getPassword());
        if (nombre.equals("") || contrase�a.equals("")) JOptionPane.showMessageDialog(frame, "Rellena las casillas!",
                "Error", JOptionPane.WARNING_MESSAGE);
        else if (nombre.length() > 10) JOptionPane.showMessageDialog(frame, "El nombre de usuario tiene un m�ximo de 10 car�cteres!",
                "Error", JOptionPane.WARNING_MESSAGE);
        else {
            if (!(contrase�a.equals(contrase�a2))) JOptionPane.showMessageDialog(frame, "No coinciden las Contrase�as!",
                    "Error", JOptionPane.WARNING_MESSAGE);
            else {
                if (CP.a�adirUsuario(nombre, contrase�a)) {
                	JOptionPane.showMessageDialog(frame, "Usuario creado correctamente");
                    SignIn SI = new SignIn(CP);
                    frame.dispose();
                }
                else {
                	JOptionPane.showMessageDialog(frame, "Ya existe el Usuario!",
                            "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
	}
	public void retornoActionPerformed(ActionEvent e) {
		 SignIn SI = new SignIn(CP);
         frame.dispose();
	}

}


/** @class Register
 *  Clase destinada a registrar un nuevo usuario
 *	@author F�lix Forroll
 */
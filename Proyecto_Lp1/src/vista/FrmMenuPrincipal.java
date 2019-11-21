package vista;


import java.awt.EventQueue;
import hilos.Hilo_Tiempo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import Animacion.Animacion;
import AppPackage.AnimationClass;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Button;
import java.awt.CardLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.Point;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Component;
import keeptoo.KGradientPanel;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;

public class FrmMenuPrincipal extends JFrame {

	private JPanel contentPane;
	public static JLabel lblFecha;
	public static JLabel lblReloj;
	public static JLabel lblCargo;
	public static JLabel lblUsuario;
	private JLabel lblComercial;
	private JLabel lblReportes;
	private JPanel panel_1;
	private JDesktopPane dktBody;
	public static JLabel lblUser2;
	private JLabel lblAlmacen;
	private JLabel lblTablero;
	private JPanel panel_2;
	private JLabel label_8;
	private JPanel panel_3;
	private JPanel panel_7;
	private JLabel label_5;
	private JLabel label_7;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JPanel panel_ventas;
	private JLabel label;
	private JPanel panel_compras;
	private JPanel panel_8;
	private JLabel label_6;
	private JLabel lblNewLabel_3;
	private JLabel lblArial;
	private JLabel lblNewLabel_4;
	private JLabel label_4;
	private String colorCeleste="#26a2fc";
	private String colorMenu="#343957";
	private String colorHover="#222b38";
	private JLabel lblArchivo;
	private JPanel panel_4;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JPanel panel_oculto;
	private JPanel panel_9;
	private JPanel panel_5;
	private JPanel panel_oculto2;
	private JLabel label_16;
	private JLabel lblCambiarContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenuPrincipal frame = new FrmMenuPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMenuPrincipal() {
		try {
			FrmMenuPrincipal.setDefaultLookAndFeelDecorated(true);
		
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		setTitle("ARIAL PERU BIOFARMACEUTICA SAC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1700, 950);
		
		/*---------------------------------------------------*/
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				panel_1 = new JPanel();
				panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
				panel_1.setBounds(221, 0, 1464, 911);
				contentPane.add(panel_1);
				panel_1.setLayout(new CardLayout(0, 0));
				
				dktBody = 	new JDesktopPane();
				dktBody.setBounds(new Rectangle(0, 0, 1490, 0));
				dktBody.setBackground(Color.decode("#f8f9fc"));
				dktBody.setBorder(new EmptyBorder(0, 0, 0, 0));
				panel_1.add(dktBody, "name_995467860582600");
				
				lblTablero = new JLabel("DASHBOARD");
				lblTablero.setFont(new Font("Tahoma", Font.BOLD, 19));
				lblTablero.setForeground(Color.decode("#aaaaa9"));
				lblTablero.setBounds(27, 114, 151, 37);
				dktBody.add(lblTablero);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(Color.WHITE);
				panel_6.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(78, 115, 223)));
				panel_6.setBounds(27, 209, 227, 79);
				dktBody.add(panel_6);
				panel_6.setLayout(null);
				
				JLabel label_1 = new JLabel("Clientes");
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_1.setForeground(new Color(78, 115, 223));
				label_1.setBounds(89, 0, 138, 30);
				panel_6.add(label_1);
				
				JLabel label_3 = new JLabel("2500");
				label_3.setBounds(99, 41, 46, 14);
				panel_6.add(label_3);
				
				lblNewLabel_2 = new JLabel("");
				
				lblNewLabel_2.setBounds(148, 16, 33, 25);
				panel_6.add(lblNewLabel_2);
				
				panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#1cc88a")));
				panel_2.setBackground(Color.WHITE);
				panel_2.setBounds(381, 209, 227, 79);
				dktBody.add(panel_2);
				
				label_8 = new JLabel("Ganancia");
				label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_8.setBounds(86, 11, 80, 17);
				panel_2.add(label_8);
				label_8.setForeground(new Color(28, 200, 138));
				
				JLabel label_2 = new JLabel("2500");
				label_2.setBounds(96, 39, 46, 14);
				panel_2.add(label_2);
				
				panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#36ba9cc")));
				panel_3.setBackground(Color.WHITE);
				panel_3.setBounds(757, 209, 227, 79);
				dktBody.add(panel_3);
				
				label_5 = new JLabel("Ventas");
				label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_5.setForeground(new Color(54, 185, 204));
				label_5.setBounds(90, 11, 74, 14);
				panel_3.add(label_5);
				
				label_7 = new JLabel("2500");
				label_7.setBounds(100, 40, 46, 14);
				panel_3.add(label_7);
				
				panel_7 = new JPanel();
				panel_7.setLayout(null);
				panel_7.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#f6c23e")));
				panel_7.setBackground(Color.WHITE);
				panel_7.setBounds(1073, 209, 227, 79);
				dktBody.add(panel_7);
				
				label_9 = new JLabel("Proveedores");
				label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
				label_9.setForeground(new Color(246, 194, 62));
				label_9.setBounds(68, 11, 103, 14);
				panel_7.add(label_9);
				
				label_10 = new JLabel("2500");
				label_10.setBounds(100, 40, 46, 14);
				panel_7.add(label_10);
				
				JLabel lblEstadisticasImportantesDe = new JLabel("Estadisticas importantes de la empresa");
				lblEstadisticasImportantesDe.setFont(new Font("Arial", Font.BOLD, 30));
				lblEstadisticasImportantesDe.setBounds(250, 265, 579, 100);
				dktBody.add(lblEstadisticasImportantesDe);
				
				lblNewLabel_3 = new JLabel("___________________________________________________________________________________________________________________________________________________________________________________________________________________");
				lblNewLabel_3.setBounds(27, 152, 1273, 14);
				lblNewLabel_3.setForeground(Color.decode("#aaaa9"));
				dktBody.add(lblNewLabel_3);
				
				panel_5 = new JPanel();
				panel_5.setBounds(1292, 0, 170, 53);
				panel_5.setBackground(Color.WHITE);
				dktBody.add(panel_5);
				panel_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						int et1=panel_oculto.getY();
						int et2=panel_oculto2.getY();
						if(et1==0) {
							
							Animacion.bajar(0, 50, 4, panel_oculto);
							Animacion.bajar(50, 100, 4, panel_oculto2);
						}
						else {
							Animacion.subir(50, 0, 4, panel_oculto);
							Animacion.subir(100, 0, 4, panel_oculto2);
						}
						
					}
				});
				panel_5.setLayout(null);
				
				label_15 = new JLabel("");
				label_15.setBounds(128, 11, 32, 32);
				panel_5.add(label_15);
				label_15.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent arg0) {
						int et1=panel_oculto.getY();
						int et2=panel_oculto2.getY();
						if(et1==0) {
							
							Animacion.bajar(0, 50, 4, panel_oculto);
							Animacion.bajar(50, 100, 4, panel_oculto2);
						}
						else {
							Animacion.subir(50, 0, 4, panel_oculto);
							Animacion.subir(100, 0, 4, panel_oculto2);
						}
						
						
						
						
					}
				});
				label_15.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/iconos/iconfinder_basics-08_296826.png")));
				label_15.setCursor(new Cursor(12));
				
				lblCargo = new JLabel("");
				lblCargo.setBounds(52, 1, 79, 42);
				panel_5.add(lblCargo);
				lblCargo.setFont(new Font("Agency FB", Font.PLAIN, 14));
				lblCargo.setForeground(Color.BLACK);
				
				lblUser2 = new JLabel("");
				lblUser2.setBounds(0, 1, 50, 42);
				panel_5.add(lblUser2);
				
				panel_oculto2 = new JPanel();
				panel_oculto2.setBounds(1088, 0, 169, 53);
				dktBody.add(panel_oculto2);
				panel_oculto2.setLayout(null);
				
				lblCambiarContrasea = new JLabel("Cambiar Contrase\u00F1a");
				lblCambiarContrasea.setBounds(62, 11, 97, 31);
				panel_oculto2.add(lblCambiarContrasea);
				
				panel_oculto = new JPanel();
				panel_oculto.setBounds(1292, 0, 169, 53);
				dktBody.add(panel_oculto);
				panel_oculto.setLayout(null);
				
				JLabel lblMiPerfil = new JLabel("Mi perfil");
				lblMiPerfil.setFont(new Font("Agency FB", Font.PLAIN, 25));
				lblMiPerfil.setBounds(50, 0, 119, 53);
				lblMiPerfil.setHorizontalAlignment(SwingConstants.CENTER);
				panel_oculto.add(lblMiPerfil);
				
				label_16 = new JLabel("");
				label_16.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/img/user.png")));
				label_16.setBounds(22, 0, 30, 53);
				panel_oculto.add(label_16);
				
				lblFecha = new JLabel("");
				lblFecha.setBounds(1043, 91, 93, 14);
				dktBody.add(lblFecha);
				lblFecha.setForeground(Color.WHITE);
				
				lblReloj = new JLabel("");
				lblReloj.setBounds(1072, 91, 86, 14);
				dktBody.add(lblReloj);
				lblReloj.setForeground(Color.WHITE);
				
				lblUsuario = new JLabel("");
				lblUsuario.setBounds(1019, 91, 77, 14);
				dktBody.add(lblUsuario);
				
				lblArchivo = new JLabel("Archivo");
				lblArchivo.setBounds(39, 91, 61, 14);
				dktBody.add(lblArchivo);
				lblArchivo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblArchivo.setForeground(Color.white);
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblArchivo.setForeground(Color.decode("#6f6f6f"));
						
					}
				});
				lblArchivo.setFont(new Font("Arial", Font.PLAIN, 15));
				lblArchivo.setForeground(Color.decode("#6f6f6f"));
				
				panel_9 = new JPanel();
				panel_9.setBackground(Color.WHITE);
				panel_9.setBounds(0, 0, 1293, 53);
				dktBody.add(panel_9);
				
				panel_4 = new JPanel();
				panel_4.setBounds(0, 0, 222, 911);
				panel_4.setBackground(Color.decode("#343957"));
				contentPane.add(panel_4);
				panel_4.setLayout(null);
				
				lblArial = new JLabel("ARIAL");
				lblArial.setBounds(42, 5, 84, 44);
				panel_4.add(lblArial);
				lblArial.setForeground(Color.decode("#ffffff"));
				lblArial.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
				panel = new JPanel();
				panel.setBounds(0, 142, 222, 51);
			
				panel_4.add(panel);
				panel.addMouseListener(new MouseAdapter() {
					
					public void mouseEntered(MouseEvent e) {
						
						panel.setBackground(Color.decode(colorHover));
						
						
						label_11.setOpaque(true);
					
					}
					@Override
					public void mouseExited(MouseEvent e) {
						
						panel.setBackground(Color.decode(colorMenu));
						
						label_11.setOpaque(false);
						
					}
				});
					panel.setBackground(Color.decode("#343957"));
					panel.setLayout(null);
					
					JLabel lblDashboard = new JLabel("Dashboard");
					lblDashboard.setBounds(58, 0, 125, 51);
					panel.add(lblDashboard);
					lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
					lblDashboard.setFont(new Font("Arial", Font.PLAIN, 16));
					lblDashboard.setForeground(new Color(255, 255, 255));
					
				
					lblDashboard.setHorizontalTextPosition(SwingConstants.CENTER);
					
					lblNewLabel_1 = new JLabel("");
					lblNewLabel_1.setBounds(0, 0, 60, 51);
					lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					panel.add(lblNewLabel_1);
					lblNewLabel_1.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/iconos/IconoDashBoard.png")));
					
					label_11 = new JLabel("");
					label_11.setBounds(213, 0, 10, 50);
					label_11.setBackground(Color.decode("#26a2fc"));
					label_11.setOpaque(false);
					panel.add(label_11);
					
					
			
					
					panel_ventas = new JPanel();
					panel_ventas.setBounds(0, 225, 222, 51);
					panel_4.add(panel_ventas);
					panel_ventas.addMouseListener(new MouseAdapter() {
						
						@Override
						public void mouseEntered(MouseEvent e) {
							

							panel_ventas.setBackground(Color.decode(colorHover));
							
							
							label_12.setOpaque(true);
							
							
						}
						@Override
						public void mouseExited(MouseEvent e) {
							
							panel_ventas.setBackground(Color.decode(colorMenu));
							label_12.setOpaque(false);
							
						}
					});
					panel_ventas.setBackground(Color.decode(colorMenu));
					panel_ventas.setOpaque(true);
					panel_ventas.setLayout(null);
					
					
					
					lblComercial = new JLabel("Ventas");
					lblComercial.setBounds(57, 0, 126, 51);
					
					panel_ventas.add(lblComercial);
					lblComercial.setFont(new Font("Arial", Font.PLAIN, 16));
					lblComercial.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							dktBody.removeAll();
							dktBody.repaint();
							FrmComercial01 venta=new FrmComercial01();
							dktBody.add(venta);
							try {
								venta.setMaximum(true);
								venta.setUI(null);  //<------------ QUITAR BORDE DE UN INTERNAL FRAME  
								venta.show(); 
							} catch (Exception e) {
								// TODO: handle exception
							}
						
							
						}
					});
					lblComercial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblComercial.setForeground(Color.WHITE);
					lblComercial.setBorder(null);
					lblComercial.setBackground(new Color(44, 57, 68));
					lblComercial.setHorizontalAlignment(SwingConstants.CENTER);
					lblComercial.setHorizontalTextPosition(SwingConstants.CENTER);
					
					label = new JLabel("");
					label.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/iconos/carrito1.png")));
					label.setHorizontalTextPosition(SwingConstants.CENTER);
					label.setHorizontalAlignment(SwingConstants.CENTER);
					label.setBounds(0, 0, 63, 51);
					panel_ventas.add(label);
					
					label_12 = new JLabel("");
					label_12.setOpaque(false);
					label_12.setBackground(Color.decode(colorCeleste));
					label_12.setBounds(212, 1, 10, 50);
					panel_ventas.add(label_12);
					
					
					panel_compras = new JPanel();
					panel_compras.setBounds(0, 308, 222, 51);
					panel_4.add(panel_compras);
					panel_compras.addMouseListener(new MouseAdapter() {
					
						@Override
						public void mouseEntered(MouseEvent e) {
							
							panel_compras.setBackground(Color.decode(colorHover));
							
							
							label_13.setOpaque(true);
							
							
						}
						@Override
						public void mouseExited(MouseEvent e) {
							
							panel_compras.setBackground(Color.decode(colorMenu));
							
							
							label_13.setOpaque(false);
							
						}
					});
					panel_compras.setBackground(Color.decode(colorMenu));
					panel_compras.setLayout(null);
					lblReportes = new JLabel("Compras");
					lblReportes.setBounds(70, 0, 98, 51);
					panel_compras.add(lblReportes);
					lblReportes.setFont(new Font("Arial", Font.PLAIN, 16));
					lblReportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblReportes.setForeground(new Color(255, 252, 254));
					lblReportes.setHorizontalAlignment(SwingConstants.CENTER);
					lblReportes.setBackground(new Color(44, 57, 68));
					
					label_4 = new JLabel("");
					label_4.setHorizontalTextPosition(SwingConstants.CENTER);
					label_4.setHorizontalAlignment(SwingConstants.CENTER);
					label_4.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/iconos/reporte.png")));
					label_4.setBounds(0, 0, 60, 51);
					panel_compras.add(label_4);
					
					label_13 = new JLabel("");
					label_13.setBounds(210, 0, 14, 51);
					label_13.setBackground(Color.decode(colorCeleste));
					label_13.setOpaque(false);
					panel_compras.add(label_13);
					
					panel_8 = new JPanel();
					panel_8.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {
							
							panel_8.setBackground(Color.decode(colorHover));
							
							
							label_14.setOpaque(true);
							
							
						}
						@Override
						public void mouseExited(MouseEvent e) {
							panel_8.setBackground(Color.decode(colorMenu));
							
							
							label_14.setOpaque(false);
							
						}
					});
					panel_8.setBounds(0, 417, 222, 51);
					panel_4.add(panel_8);
					panel_8.setLayout(null);
					panel_8.setBackground(Color.decode(colorMenu));
					
					lblAlmacen = new JLabel("Almacen");
					lblAlmacen.setBounds(71, 0, 98, 52);
					panel_8.add(lblAlmacen);
					lblAlmacen.setFont(new Font("Arial", Font.PLAIN, 16));
					lblAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
					lblAlmacen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblAlmacen.setForeground(new Color(255, 252, 254));
					lblAlmacen.setBackground(new Color(44, 57, 68));
					
					label_6 = new JLabel("");
					
					label_6.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/iconos/almacen.png")));
					label_6.setHorizontalTextPosition(SwingConstants.CENTER);
					label_6.setHorizontalAlignment(SwingConstants.CENTER);
					label_6.setBounds(2, 2, 59, 48);
					panel_8.add(label_6);
					
					label_14 = new JLabel("");
					label_14.setBounds(210, 0, 15, 52);
					label_14.setBackground(Color.decode(colorCeleste));
					label_14.setOpaque(false);
					panel_8.add(label_14);
					
					lblNewLabel_4 = new JLabel("___________________________________________________________________________");
					lblNewLabel_4.setBounds(0, 39, 244, 14);
					panel_4.add(lblNewLabel_4);
					lblNewLabel_4.setForeground(Color.WHITE);
				
			
				
				
			
				ImageIcon imagen3=new ImageIcon("img/user02.png");
		iniciaReloj();
	}
	void iniciaReloj() {
		
		//INSTANCIAMOS LA CLASE HILO RELOJ
		Hilo_Tiempo r = new Hilo_Tiempo();
		
		//INICIA EL HILO
		r.start();
	}
	}


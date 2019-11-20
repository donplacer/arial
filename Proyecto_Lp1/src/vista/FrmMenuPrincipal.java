package vista;


import java.awt.EventQueue;
import hilos.Hilo_Tiempo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

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
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Component;

public class FrmMenuPrincipal extends JFrame {

	private JPanel contentPane;
	public static JMenu mnReportesyEstadistica;
	public static JMenu mnAlmacen;
	private JMenuItem mnVentas;
	public static JMenuItem mnClientes;
	public static JMenu mnCompras;
	private JMenu ff;
	private JMenuItem mntmProductos;
	private JMenuItem mntmCategorias;
	public static JLabel lblFecha;
	public static JLabel lblReloj;
	public static JLabel lblCargo;
	public static JLabel lblUsuario;
	private JPanel jpanelMenu;
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
	private JMenu menu_1;
	private JMenu menu;
	private JMenu menu_2;
	private JMenu menu_3;
	private JMenu menu_4;
	private JLabel lblNewLabel;
	private Button btnPerfil;
	

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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(221, 42, 1230, 21);
		menuBar.setBorder(null);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 13));
		mnNewMenu.setBorder(null);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialog = JOptionPane.YES_NO_OPTION;
				int result = JOptionPane.showConfirmDialog(null, "Desea salir del Sistema?", "Salir", dialog);
				if (result == 0) {
					System.exit(0);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		ff = new JMenu("Ventas");
		ff.setHorizontalAlignment(SwingConstants.CENTER);
		ff.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(ff);
		
		mnVentas = new JMenuItem("Ventas");
		mnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntVenta v=new IntVenta();
				dktBody.add(v);
				v.show();
			}
		});
		
		ff.add(mnVentas);
		
		mnClientes = new JMenuItem("Clientes");
		
		
		mnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmClientes c=new FrmClientes();
				c.setLocationRelativeTo(null);
				c.setVisible(true);
				
			}
		});
		ff.add(mnClientes);
		
		mnCompras = new JMenu("Compras");
		mnCompras.setHorizontalAlignment(SwingConstants.CENTER);
		mnCompras.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(mnCompras);
		
		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addActionListener(new ActionListener() {
	    /*-----------------------------------------------------*/		
			public void actionPerformed(ActionEvent e) {
				FrmCompras compras=new FrmCompras();
				compras.setVisible(true);                     // <---------------- EVENTO ABRIR VENTANA COMPRAS
				compras.setLocationRelativeTo(null);
			}
		});
		mnCompras.add(mntmCompra);
		
		JMenuItem mntmProveedor = new JMenuItem("Proveedor");
		mntmProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmProveedores proveedores=new FrmProveedores();
				proveedores.setVisible(true);
				proveedores.setLocationRelativeTo(null);
			}
		});
		mnCompras.add(mntmProveedor);
		
		mnAlmacen = new JMenu("Almacen");
		mnAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		mnAlmacen.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(mnAlmacen);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmProductos f=new FrmProductos();
				f.setVisible(true);
				f.setLocationRelativeTo(null);
				
			}
		});
		
			mnAlmacen.add(mntmProductos);
			
			mntmCategorias = new JMenuItem("Categorias");
			mntmCategorias.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FrmCategorias c=new FrmCategorias();
					c.setLocationRelativeTo(null);
					c.setVisible(true);
					
				}
			});
			
				mnAlmacen.add(mntmCategorias);
				
				menu_1 = new JMenu("Finanzas");
				menuBar.add(menu_1);
				
				mnReportesyEstadistica = new JMenu("Reportes");
				mnReportesyEstadistica.setHorizontalAlignment(SwingConstants.CENTER);
				mnReportesyEstadistica.setFont(new Font("Arial", Font.PLAIN, 13));
				menuBar.add(mnReportesyEstadistica);
				
				JMenuItem mntmVentas = new JMenuItem("Ventas");
				mntmVentas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						FrmReporteVentas reporteVentas=new FrmReporteVentas();
								reporteVentas.setVisible(true);
						reporteVentas.setLocationRelativeTo(null);
					}
				});
				mnReportesyEstadistica.add(mntmVentas);
				
				menu = new JMenu("Ver");
				menuBar.add(menu);
				
				menu_2 = new JMenu("Herramientas");
				menuBar.add(menu_2);
				
				menu_3 = new JMenu("Ventana");
				menuBar.add(menu_3);
				
				menu_4 = new JMenu("Ayuda");
				menuBar.add(menu_4);
				
				JPanel jpanelHeader = new JPanel();
				jpanelHeader.setBackground(Color.DARK_GRAY);
				jpanelHeader.setBounds(201, 0, 1484, 39);
				contentPane.add(jpanelHeader);
				jpanelHeader.setLayout(null);
				
				lblCargo = new JLabel("");
				lblCargo.setForeground(Color.WHITE);
				lblCargo.setBounds(693, 11, 96, 14);
				jpanelHeader.add(lblCargo);
				
				lblFecha = new JLabel("");
				lblFecha.setForeground(Color.WHITE);
				lblFecha.setBounds(58, 11, 93, 14);
				jpanelHeader.add(lblFecha);
				
				lblReloj = new JLabel("");
				lblReloj.setForeground(Color.WHITE);
				lblReloj.setBounds(125, 11, 86, 14);
				jpanelHeader.add(lblReloj);
				
				lblUser2 = new JLabel("");
				lblUser2.setBounds(627, 4, 50, 31);
				jpanelHeader.add(lblUser2);
				
				jpanelMenu = new JPanel();
				jpanelMenu.setBounds(0, 0, 202, 913);
				jpanelMenu.setBackground(new Color(34, 43, 54));
				contentPane.add(jpanelMenu);
				jpanelMenu.setLayout(null);
				
				lblComercial = new JLabel("Comercial");
				lblComercial.setFont(new Font("Arial", Font.BOLD, 12));
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
				lblComercial.setOpaque(true);
				lblComercial.setBorder(null);
				lblComercial.setBackground(new Color(44, 57, 68));
				lblComercial.setHorizontalAlignment(SwingConstants.CENTER);
				lblComercial.setHorizontalTextPosition(SwingConstants.CENTER);
				lblComercial.setBounds(0, 35, 202, 39);
				jpanelMenu.add(lblComercial);
				
				lblReportes = new JLabel("Reportes");
				lblReportes.setFont(new Font("Arial", Font.BOLD, 12));
				lblReportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblReportes.setForeground(new Color(255, 252, 254));
				lblReportes.setHorizontalAlignment(SwingConstants.CENTER);
				lblReportes.setBackground(new Color(44, 57, 68));
				lblReportes.setBounds(0, 104, 202, 41);
				lblReportes.setOpaque(true);
				jpanelMenu.add(lblReportes);
				
				lblAlmacen = new JLabel("Almacen");
				lblAlmacen.setFont(new Font("Arial", Font.BOLD, 12));
				lblAlmacen.setOpaque(true);
				lblAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
				lblAlmacen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblAlmacen.setForeground(new Color(255, 252, 254));
				lblAlmacen.setBackground(new Color(44, 57, 68));
				lblAlmacen.setBounds(0, 167, 202, 41);
				
				jpanelMenu.add(lblAlmacen);
				
				panel_1 = new JPanel();
				panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
				panel_1.setBounds(201, 95, 1484, 816);
				contentPane.add(panel_1);
				panel_1.setLayout(new CardLayout(0, 0));
				
				dktBody = 	new JDesktopPane();
				dktBody.setBounds(new Rectangle(0, 0, 1490, 0));
				dktBody.setBackground(Color.decode("#f8f9fc"));
				dktBody.setBorder(new EmptyBorder(0, 0, 0, 0));
				panel_1.add(dktBody, "name_995467860582600");
				
				lblTablero = new JLabel("Tablero");
				lblTablero.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblTablero.setBounds(27, 0, 112, 37);
				dktBody.add(lblTablero);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(Color.WHITE);
				panel_6.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(78, 115, 223)));
				panel_6.setBounds(27, 48, 200, 61);
				dktBody.add(panel_6);
				panel_6.setLayout(null);
				
				JLabel label_1 = new JLabel("Clientes");
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				label_1.setForeground(new Color(78, 115, 223));
				label_1.setBounds(62, 11, 73, 14);
				panel_6.add(label_1);
				
				JLabel label_3 = new JLabel("2500");
				label_3.setBounds(72, 36, 46, 14);
				panel_6.add(label_3);
				
				lblNewLabel_2 = new JLabel("");
				
				lblNewLabel_2.setBounds(148, 16, 33, 25);
				panel_6.add(lblNewLabel_2);
				
				panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#1cc88a")));
				panel_2.setBackground(Color.WHITE);
				panel_2.setBounds(315, 48, 200, 61);
				dktBody.add(panel_2);
				
				label_8 = new JLabel("Ganancia");
				label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
				label_8.setBounds(71, 11, 80, 14);
				panel_2.add(label_8);
				label_8.setForeground(new Color(28, 200, 138));
				
				JLabel label_2 = new JLabel("2500");
				label_2.setBounds(81, 36, 46, 14);
				panel_2.add(label_2);
				
				panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#36ba9cc")));
				panel_3.setBackground(Color.WHITE);
				panel_3.setBounds(578, 48, 200, 61);
				dktBody.add(panel_3);
				
				label_5 = new JLabel("Ventas");
				label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
				label_5.setForeground(new Color(54, 185, 204));
				label_5.setBounds(73, 11, 74, 14);
				panel_3.add(label_5);
				
				label_7 = new JLabel("2500");
				label_7.setBounds(89, 36, 46, 14);
				panel_3.add(label_7);
				
				panel_7 = new JPanel();
				panel_7.setLayout(null);
				panel_7.setBorder(new MatteBorder(0, 2, 0, 0, (Color) Color.decode("#f6c23e")));
				panel_7.setBackground(Color.WHITE);
				panel_7.setBounds(874, 48, 200, 61);
				dktBody.add(panel_7);
				
				label_9 = new JLabel("Proveedores");
				label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
				label_9.setForeground(new Color(246, 194, 62));
				label_9.setBounds(59, 11, 86, 14);
				panel_7.add(label_9);
				
				label_10 = new JLabel("2500");
				label_10.setBounds(84, 36, 46, 14);
				panel_7.add(label_10);
				
				JLabel lblEstadisticasImportantesDe = new JLabel("Estadisticas importantes de la empresa");
				lblEstadisticasImportantesDe.setFont(new Font("Arial", Font.BOLD, 30));
				lblEstadisticasImportantesDe.setBounds(250, 265, 579, 100);
				dktBody.add(lblEstadisticasImportantesDe);
				/*boton perfill*/
				 btnPerfil=new Button("PERFIL");
					
					btnPerfil.setBounds(1508, 42, 100, 40);
					btnPerfil.setFont(new Font("Arial", Font.BOLD, 12));
					btnPerfil.setVisible(false);
					contentPane.add(btnPerfil);
				
				lblNewLabel = new JLabel("");
				
				lblNewLabel.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
						 btnPerfil.setVisible(true);
						super.mouseEntered(e);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						btnPerfil.setVisible(false);
						super.mouseExited(e);
					}
					
					
				});
				btnPerfil.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
						 btnPerfil.setVisible(true);
						super.mouseEntered(e);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						btnPerfil.setVisible(false);
						super.mouseExited(e);
					}
					
					
				});
				
				
				lblNewLabel.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/img/user.png")));
				lblNewLabel.setBounds(1608, 42, 33, 27);
				contentPane.add(lblNewLabel);
				
				lblUsuario = new JLabel("");
				lblUsuario.setBounds(1576, 70, 98, 14);
				contentPane.add(lblUsuario);
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


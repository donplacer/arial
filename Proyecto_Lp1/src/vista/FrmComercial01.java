package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class FrmComercial01 extends JInternalFrame {
	private JDesktopPane dk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmComercial01 frame = new FrmComercial01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmComercial01() {
		setBounds(100, 100, 1500, 898);
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 8, 596, 23);
		getContentPane().add(toolBar);
		
		JButton button = new JButton("Productos");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					IntGestionProducto p=new IntGestionProducto();
					
					dk.add(p);
					p.setMaximum(true);
					p.setVisible(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("Clientes");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					IntGestionCliente p=new IntGestionCliente();
					
					dk.add(p);
					p.setMaximum(true);
					p.setVisible(true);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		toolBar.add(button_1);
		
		JButton button_2 = new JButton("Cotizacion");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					IntGestionCotizacion p=new IntGestionCotizacion();
					
					dk.add(p);
					p.setMaximum(true);
					p.setVisible(true);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		toolBar.add(button_2);
		
		JButton button_3 = new JButton("Ventas");
		toolBar.add(button_3);
		
		JButton button_4 = new JButton("Compras");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					IntGestionCompra p=new IntGestionCompra();
					
					dk.add(p);
					p.setMaximum(true);
					p.setVisible(true);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolBar.add(button_4);
		
		JButton button_5 = new JButton("Caja");
		toolBar.add(button_5);
		
		dk = new JDesktopPane();
		dk.setBackground(Color.WHITE);
		dk.setBounds(10, 34, 1445, 817);
		getContentPane().add(dk);
		
		

	}
}

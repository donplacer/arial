package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;

public class IntGestionCompra extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntGestionCompra frame = new IntGestionCompra();
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
	public IntGestionCompra() {
		setBounds(100, 100, 1331, 731);
		getContentPane().setLayout(null);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento");
		lblTipoDocumento.setBounds(25, 31, 92, 14);
		getContentPane().add(lblTipoDocumento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 28, 158, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(397, 28, 71, 20);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(478, 28, 71, 20);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(693, 28, 102, 20);
		getContentPane().add(comboBox_3);
		
		JLabel lblPeriodo = new JLabel("periodo");
		lblPeriodo.setBounds(331, 31, 46, 14);
		getContentPane().add(lblPeriodo);
		
		JLabel lblMoneda = new JLabel("moneda");
		lblMoneda.setBounds(622, 31, 46, 14);
		getContentPane().add(lblMoneda);
		
		table = new JTable();
		table.setBounds(25, 95, 1342, 358);
		getContentPane().add(table);
		
		JButton button = new JButton("+");
		button.setBounds(1032, 25, 46, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(1091, 25, 46, 23);
		getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setBounds(1158, 26, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		table_1 = new JTable();
		table_1.setBounds(25, 478, 1342, 212);
		getContentPane().add(table_1);
	}

}

package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Constants;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Cursor;

public class frmPerfil extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmPerfil dialog = new frmPerfil();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmPerfil() {
		getContentPane().setFont(new Font("Dialog", Font.PLAIN, 15));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 409, 496);
		getContentPane().setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(frmPerfil.class.getResource("/iconos/userv.png")));
			label.setBounds(117, 11, 114, 91);
			getContentPane().add(label);
		}
		{
			JLabel lblAdmin = new JLabel("Admin");
			lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 18));
			lblAdmin.setBounds(138, 113, 93, 14);
			lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(lblAdmin);
		}
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblNombre.setBounds(10, 151, 66, 14);
			getContentPane().add(lblNombre);
		}
		{
			JLabel lblJuancito = new JLabel("Juancito");
			lblJuancito.setFont(new Font("Agency FB", Font.PLAIN, 15));
			lblJuancito.setBounds(86, 153, 125, 14);
			getContentPane().add(lblJuancito);
		}
		{
			JLabel lblNewLabel = new JLabel("Apellido");
			lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblNewLabel.setBounds(10, 192, 66, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblPerezLopez = new JLabel("perez lopez");
			lblPerezLopez.setFont(new Font("Agency FB", Font.PLAIN, 15));
			lblPerezLopez.setBounds(86, 192, 131, 14);
			getContentPane().add(lblPerezLopez);
		}
		{
			JLabel lblDireccion = new JLabel("Direccion");
			lblDireccion.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblDireccion.setBounds(10, 232, 66, 14);
			getContentPane().add(lblDireccion);
		}
		{
			JLabel lblAmatYJuniet = new JLabel("Amat y juniet 289 surco");
			lblAmatYJuniet.setFont(new Font("Agency FB", Font.PLAIN, 15));
			lblAmatYJuniet.setBounds(86, 232, 131, 14);
			getContentPane().add(lblAmatYJuniet);
		}
		{
			JLabel lblTelefono = new JLabel("Telefono");
			lblTelefono.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblTelefono.setBounds(10, 266, 66, 14);
			getContentPane().add(lblTelefono);
		}
		{
			JLabel label = new JLabel("123456789");
			label.setFont(new Font("Agency FB", Font.PLAIN, 15));
			label.setBounds(86, 266, 131, 14);
			getContentPane().add(label);
		}
		{
			JLabel lblCelular = new JLabel("Celular");
			lblCelular.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblCelular.setBounds(10, 304, 66, 14);
			getContentPane().add(lblCelular);
		}
		{
			JLabel label = new JLabel("123456789");
			label.setFont(new Font("Agency FB", Font.PLAIN, 15));
			label.setBounds(86, 304, 131, 14);
			getContentPane().add(label);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Usuario");
			lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 16));
			lblNewLabel_1.setBounds(10, 342, 66, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblGquilcaval = new JLabel("Gquilcaval");
			lblGquilcaval.setFont(new Font("Agency FB", Font.PLAIN, 15));
			lblGquilcaval.setBounds(86, 342, 131, 14);
			getContentPane().add(lblGquilcaval);
		}
		{
			JLabel lblGrabar = new JLabel("Grabar");
			lblGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblGrabar.setFont(new Font("Perpetua", Font.PLAIN, 25));
			lblGrabar.setBounds(105, 408, 86, 38);
			getContentPane().add(lblGrabar);
		}
		{
			JLabel lblSalir = new JLabel("Salir");
			lblSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblSalir.setFont(new Font("Perpetua", Font.PLAIN, 25));
			lblSalir.setBounds(210, 408, 86, 38);
			getContentPane().add(lblSalir);
		}
	}

}

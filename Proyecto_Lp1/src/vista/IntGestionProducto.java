package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import mantenimientos.GestionClientes;
import mantenimientos.GestionProductos;
import mantenimientos.GestionProveedor;
import model.Clientes;
import model.Producto;

import javax.swing.UIManager;
import javax.swing.JTable;
import java.awt.ScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.LineNumberInputStream;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class IntGestionProducto extends JInternalFrame {
	private JTextField txtBuscqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntGestionProducto frame = new IntGestionProducto();
					frame.setVisible(true);
					IntGestionProducto a=new IntGestionProducto();
					a.listar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	DefaultTableModel model = new DefaultTableModel();
	
	
	
	public IntGestionProducto() {
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameActivated(InternalFrameEvent arg0) {
				listar();
			}
		});
		
		listar();
		
		model.addColumn("codigo");
		model.addColumn("Proveedor");
		model.addColumn("Categoria");
		model.addColumn("Descripcion");
		model.addColumn("Precio Compra");
		model.addColumn("Precio Lista");
		model.addColumn("stock");
		model.addColumn("marca");
		model.addColumn("Codigo barra");
		model.addColumn("Codigo registro sanitario");
		
		
		
		
		setTitle("Gestion Productos");
		setBounds(100, 100, 1325, 731);
		getContentPane().setLayout(null);
		
		JLabel lblTiposDeExistencia = new JLabel("Tipos de existencia");
		lblTiposDeExistencia.setBounds(32, 36, 134, 14);
		getContentPane().add(lblTiposDeExistencia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(204, 33, 134, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(425, 33, 134, 20);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(629, 33, 134, 20);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(839, 34, 134, 20);
		getContentPane().add(comboBox_3);
		
		JLabel fdsfs = new JLabel("Tipo");
		fdsfs.setBounds(164, 36, 36, 14);
		getContentPane().add(fdsfs);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(369, 36, 58, 14);
		getContentPane().add(lblCategoria);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setBounds(599, 36, 44, 14);
		getContentPane().add(lblLinea);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(805, 36, 36, 14);
		getContentPane().add(lblMarca);
		
		txtBuscqueda = new JTextField();
		txtBuscqueda.setText("bUSCQUEDA");
		txtBuscqueda.setName("");
		txtBuscqueda.setToolTipText("");
		txtBuscqueda.setBounds(1142, 33, 98, 20);
		getContentPane().add(txtBuscqueda);
		txtBuscqueda.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(1013, 32, 44, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnOpciones = new JButton("opc");
		btnOpciones.setBounds(1248, 32, 51, 23);
		getContentPane().add(btnOpciones);
		
		JButton btnTodos = new JButton("Todos");
		btnTodos.setBounds(32, 107, 89, 23);
		getContentPane().add(btnTodos);
		
		JButton btnMercaderias = new JButton("Mercaderias");
		btnMercaderias.setBounds(32, 165, 89, 23);
		getContentPane().add(btnMercaderias);
		
		JButton btnProductosTerminados = new JButton("Productos terminados");
		btnProductosTerminados.setBounds(32, 199, 89, 23);
		getContentPane().add(btnProductosTerminados);
		
		JButton btnPrimas = new JButton("materias primas");
		btnPrimas.setBounds(32, 233, 89, 23);
		getContentPane().add(btnPrimas);
		
		JButton btnEnvases = new JButton("Envases");
		btnEnvases.setBounds(32, 267, 89, 23);
		getContentPane().add(btnEnvases);
		
		JButton btnMaterialesAuxiliares = new JButton("materiales auxiliares");
		btnMaterialesAuxiliares.setBounds(32, 301, 89, 23);
		getContentPane().add(btnMaterialesAuxiliares);
		
		JButton btnSuministros = new JButton("suministros");
		btnSuministros.setBounds(32, 329, 89, 20);
		getContentPane().add(btnSuministros);
		
		JButton btnRepuestos = new JButton("repuestos");
		btnRepuestos.setBounds(32, 360, 89, 23);
		getContentPane().add(btnRepuestos);
		
		JButton btnEmbalajes = new JButton("embalajes");
		btnEmbalajes.setBounds(32, 394, 89, 23);
		getContentPane().add(btnEmbalajes);
		
		JButton btnSubproductos = new JButton("subproductos");
		btnSubproductos.setBounds(32, 428, 89, 23);
		getContentPane().add(btnSubproductos);
		
		JButton btnDesechosYDesperdicios = new JButton("desechos y desperdicios");
		btnDesechosYDesperdicios.setBounds(32, 462, 89, 23);
		getContentPane().add(btnDesechosYDesperdicios);
		
		JButton btnOtros = new JButton("otros");
		btnOtros.setBounds(32, 496, 89, 23);
		getContentPane().add(btnOtros);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(28, 585, 112, 20);
		getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(28, 616, 112, 20);
		getContentPane().add(comboBox_5);
		
		JLabel lblVerMoviminetosDel = new JLabel("ver moviminetos del producto");
		lblVerMoviminetosDel.setBorder(UIManager.getBorder("TitledBorder.border"));
		lblVerMoviminetosDel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVerMoviminetosDel.setForeground(Color.BLUE);
		lblVerMoviminetosDel.setBounds(33, 660, 166, 14);
		getContentPane().add(lblVerMoviminetosDel);
		
		JButton button = new JButton("-");
		button.setBounds(1072, 32, 44, 23);
		getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 107, 1121, 529);
		getContentPane().add(scrollPane);
		
		JTable tblProductos = new JTable();
		tblProductos.setModel(model);
		scrollPane.setViewportView(tblProductos);
		
	}
	
	 void listar() {
		
		GestionProductos gc = new GestionProductos();
		ArrayList<Producto> lista = gc.listado();
		model.getDataVector().removeAllElements();
		
		for (Producto cl : lista) {
			Object datos[] = { cl.getCodigo(),cl.getIdproveedor(), cl.getDescripcion(), cl.getStock(),cl.getMarca(), cl.getPrecioProCompra(),cl.getPrecioProLista()
					,cl.getIdcategoria(),cl.getCodbarra(),cl.getCodregistrosani() };

			model.addRow(datos);

		}
		
	}
}

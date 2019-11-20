package model;



public class Producto {
	
	private int codigo;
	private String descripcion,marca;
	private int idproveedor;
	private String idcategoria,codbarra,codregistrosani ;
	
	private int stock ;
	public double precioProCompra,precioProLista;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodbarra() {
		return codbarra;
	}
	public void setCodbarra(String codbarra) {
		this.codbarra = codbarra;
	}
	public String getCodregistrosani() {
		return codregistrosani;
	}
	public void setCodregistrosani(String codregistrosani) {
		this.codregistrosani = codregistrosani;
	}
	public double getPrecioProCompra() {
		return precioProCompra;
	}
	public void setPrecioProCompra(double precioProCompra) {
		this.precioProCompra = precioProCompra;
	}
	public double getPrecioProLista() {
		return precioProLista;
	}
	public void setPrecioProLista(double precioProLista) {
		this.precioProLista = precioProLista;
	}
	

	
	
	
}

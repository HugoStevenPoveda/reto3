package reto3;

public class Productos {
	Integer codigo;
	String nombre;
	Double precio;
	Integer inventario;

	public Productos(Integer codigo, String nombre, Double precio, Integer inventario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;

	}

	public Productos(int codigo, String nombre, double precio, int inventario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;
	}

	public Integer mostrarId() {
		return codigo;

	}

	public Double mostrarPrecio() {
		return precio;
	}

	public Integer mostrarInventario() {
		return inventario;
	}
	
	public Object[] objetoProducto() {
		
		Object[] objetoProducto = {nombre,precio,inventario};
		return objetoProducto;
	}
		
		
		

	public String toString() {
		return nombre;
	}
	
	
}

package reto3;

public interface ProductosDao {
	
	public Object[] getAllProducts();
	public Productos getProducto ();
	public void agregarProducto();
	public void updateProducto();
	public void deleteProducto();
	public Object[] getProductosMayores();
	
	
	
	
}

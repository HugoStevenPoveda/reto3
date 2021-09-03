package reto3;

public class ProductosIniciales {
	
	//retorna una base de datos inicial

	public  BaseDatosProductos iniciarProductos() {
		BaseDatosProductos baseDatosProductos = new BaseDatosProductos();
		// construcion datos iniciales 
		Productos Manzanas = new Productos(1, "Manzanas", 8000.0, 65);
		Productos Limones = new Productos(2, "Limones", 2300.0, 15);
		Productos Granadilla = new Productos(3, "Granadilla", 2500.0, 38);
		Productos Arandanos = new Productos(4, "Arandanos", 9300.0, 55);
		Productos Tomates = new Productos(5, "Tomates", 2100.0, 42);
		Productos Fresas = new Productos(6, "Fresas", 4100.0, 3);
		Productos Helado = new Productos(7, "Helado", 4500.0, 41);
		Productos Galletas = new Productos(8, "Galletas", 500.0, 8);
		Productos Chocolates = new Productos(9, "Chocolates", 3500.0, 806);
		Productos Jamon = new Productos(10, "Jamon", 15000.0, 10);

		

		baseDatosProductos.agregar(Manzanas);
		baseDatosProductos.agregar(Limones);
		baseDatosProductos.agregar(Granadilla);
		baseDatosProductos.agregar(Arandanos);
		baseDatosProductos.agregar(Tomates);
		baseDatosProductos.agregar(Fresas);
		baseDatosProductos.agregar(Helado);
		baseDatosProductos.agregar(Galletas);
		baseDatosProductos.agregar(Chocolates);
		baseDatosProductos.agregar(Jamon);
		return baseDatosProductos;
		
	}
		
	
	


	
		 


}

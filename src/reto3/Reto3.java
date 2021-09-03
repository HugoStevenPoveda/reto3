package reto3;

import java.util.Scanner;

class Reto3 {

	private final Scanner scanner = new Scanner(System.in);

	public String read() {
		return this.scanner.nextLine();
	}

	public void run() {

		// construcion Base datos
		Productos manzanas = new Productos(1, "Manzanas", 8000.0, 65);
		Productos limones = new Productos(2, "Limones", 2300.0, 15);
		Productos granadilla = new Productos(3, "Granadilla", 2500.0, 38);
		Productos arandanos = new Productos(4, "Arandanos", 9300.0, 55);
		Productos tomates = new Productos(5, "Tomates", 2100.0, 42);
		Productos fresas = new Productos(6, "Fresas", 4100.0, 3);
		Productos helado = new Productos(7, "Helado", 4500.0, 41);
		Productos galletas = new Productos(8, "Galletas", 500.0, 8);
		Productos chocolates = new Productos(9, "Chocolates", 3500.0, 806);
		Productos jamon = new Productos(10, "Jamon", 15000.0, 10);

		BaseDatosProductos baseDatosProductos = new BaseDatosProductos();
		baseDatosProductos.agregar(manzanas);
		baseDatosProductos.agregar(limones);
		baseDatosProductos.agregar(granadilla);
		baseDatosProductos.agregar(arandanos);
		baseDatosProductos.agregar(tomates);
		baseDatosProductos.agregar(fresas);
		baseDatosProductos.agregar(helado);
		baseDatosProductos.agregar(galletas);
		baseDatosProductos.agregar(chocolates);
		baseDatosProductos.agregar(jamon);

		// fin de base datos

		String operacion = read();
		String datosProducto = read();
		String[] elementosProductos = datosProducto.split(" ");
		Integer codigoProducto = Integer.parseInt(elementosProductos[0]);
		String nombreProducto = elementosProductos[1];
		Double precioProducto = Double.parseDouble(elementosProductos[2]);
		Integer inventarioProducto = Integer.parseInt(elementosProductos[3]);
		Productos producto = new Productos(codigoProducto, nombreProducto, precioProducto, inventarioProducto);
		Boolean existenciaProducto = baseDatosProductos.verificarExistencia(producto);

		switch (operacion) {
		case "ACTUALIZAR":
			if (existenciaProducto) {
				baseDatosProductos.actualizar(producto);
				baseDatosProductos.generarInforme();
			}

			else {
				System.out.println("ERROR");
			}

			break;
		case "BORRAR":
			if (existenciaProducto) {
				baseDatosProductos.eliminar(producto);
				baseDatosProductos.generarInforme();
			} else {
				System.out.println("ERROR");
			}

			break;
		case "AGREGAR":
			if (!existenciaProducto) {

				baseDatosProductos.agregar(producto);
				baseDatosProductos.generarInforme();
			} else {
				System.out.println("ERROR");
			}

			break;
		default:
			System.out.println("ERROR INGRESAR OPERACION");
			break;

		}

	}
}

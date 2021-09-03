package reto3;

import java.util.Arrays;
import java.util.HashMap;

public class BaseDatosProductos {
	// agregar, actualizar y eliminar

	HashMap<Integer, Productos> listaProductos = new HashMap<Integer, Productos>();
	HashMap<Integer, Double> listaPrecios = new HashMap<Integer, Double>();

	public void crearListaPrecio() {
		for (Integer codigo : listaProductos.keySet()) {
			listaPrecios.put(codigo, listaProductos.get(codigo).mostrarPrecio());
		}
	}

	public Boolean verificarExistencia(Productos producto) {

		if (listaProductos.containsKey(producto.mostrarId())) {
			return true;
		} else {
			return false;
		}

	}

	public void agregar(Productos producto) {

		listaProductos.put(producto.mostrarId(), producto);

	}

	public void actualizar(Productos producto) {

		listaProductos.replace(producto.mostrarId(), producto);

	}

	public void eliminar(Productos producto) {

		listaProductos.remove(producto.mostrarId());

	}

	public Integer[] mayorMenor() {
		crearListaPrecio();
		// objeto me permite tener un aaray a agregarle un valor a mayor y menor
		Object[] preciosLista = listaPrecios.values().toArray();

		// almacena la llave producto mayor y la llave producto menor
		// primer llave mayor luego llave menor
		Integer[] KeysMayorMenor = new Integer[2];

		Double mayor;
		Double menor;
		Integer keyMayor = 0, keyMenor = 0;
		menor = (Double) preciosLista[0];
		mayor = (Double) preciosLista[0];

		for (Double precio : listaPrecios.values()) {
			if (precio > mayor)
				mayor = precio;
			if (precio < menor)
				menor = precio;
		}
		for (Integer key : listaPrecios.keySet()) {
			if (listaPrecios.get(key) == menor)
				keyMenor = key;
			if (listaPrecios.get(key) == mayor)
				keyMayor = key;
		}

		KeysMayorMenor[0] = keyMayor;
		KeysMayorMenor[1] = keyMenor;

		return KeysMayorMenor;

	}

	public void imprimeMayorMenor() {
		Integer[] mayorMenor = mayorMenor();
		System.out.print(listaProductos.get(mayorMenor[0]));
		System.out.print(" ");
		System.out.print(listaProductos.get(mayorMenor[1]));

	}

	public Double PromedioPrecio() {

		Double suma = (double) 0;
		Double promedio = (double) 0;
		int cantidaProductos = listaProductos.size();
		for (int key : listaProductos.keySet()) {
			suma += listaProductos.get(key).mostrarPrecio();
		}
		promedio = suma / cantidaProductos;
		// permite mostrar con solo un decimal
		String resultado = String.format("%.1f", promedio);
		resultado = resultado.replace(",", ".");
		promedio = Double.parseDouble(resultado);
		return promedio;
	}

	public void imprimirPromedio() {
		System.out.print(PromedioPrecio());

	}

	public Double totalInventario() {
		Double suma = (double) 0;
		Double precioProducto = (double) 0;
		Integer inventarioProducto = 0;
		Double producto = (double) 0;

		for (int key : listaProductos.keySet()) {
			precioProducto = listaProductos.get(key).mostrarPrecio();
			inventarioProducto = listaProductos.get(key).mostrarInventario();
			producto = precioProducto * inventarioProducto;
			suma += producto;
		}
		String resultado = String.format("%.1f", suma);
		resultado = resultado.replace(",", ".");
		suma = Double.parseDouble(resultado);

		return suma;
	}

	public void imprimirTotalInventario() {
		System.out.print(totalInventario());
	}

	public Integer[] ordenarPrecios() {
		crearListaPrecio();
		Integer[] keysProductosMayores = new Integer[3];
		Integer keyProductoUno = 0;
		Integer keyProductoDos = 0;
		Integer keyProductoTres = 0;
		Object[] preciosLista = listaPrecios.values().toArray();
		Arrays.sort(preciosLista);
		Double precioProductoUno = (Double) preciosLista[preciosLista.length - 1];
		Double precioProductoDos = (Double) preciosLista[preciosLista.length - 2];
		Double precioProductoTres = (Double) preciosLista[preciosLista.length - 3];

		for (Integer key : listaPrecios.keySet()) {
			if (listaPrecios.get(key) == precioProductoUno)
				keyProductoUno = key;
			if (listaPrecios.get(key) == precioProductoDos)
				keyProductoDos = key;
			if (listaPrecios.get(key) == precioProductoTres)
				keyProductoTres = key;
		}
		keysProductosMayores[0] = keyProductoUno;
		keysProductosMayores[1] = keyProductoDos;
		keysProductosMayores[2] = keyProductoTres;

		return keysProductosMayores;

	}

	public void inprimirOrdenarPrecios() {
		Integer[] listaPreciosMayores = ordenarPrecios();
		Integer precioUno = listaPreciosMayores[0];
		Integer precioDos = listaPreciosMayores[1];
		Integer precioTres = listaPreciosMayores[2];

		System.out.print(listaProductos.get(precioUno));
		System.out.print(" ");
		System.out.print(listaProductos.get(precioDos));
		System.out.print(" ");

		System.out.print(listaProductos.get(precioTres));

	}

	public Object[] crearObjetosListaProductos() {

		Object[] objetosProductos = new Object[listaProductos.size()];
		int i = 0;
		for (Integer key : listaProductos.keySet()) {
			objetosProductos[i] = listaProductos.get(key).objetoProducto();
			i++;
		}

		return objetosProductos;
	}

	public void mostrarObjetTabla() {
		Object[] objetos = crearObjetosListaProductos();

		for (Object index : objetos) {
			System.out.println(" " + index);

		}

	}

	public void generarInforme() {
//		imprimeMayorMenor();
//		System.out.print(" ");
//		imprimirPromedio();
//		System.out.print(" ");
//		imprimirTotalInventario();
		/// System.out.println(" ");
		inprimirOrdenarPrecios();

	}

}

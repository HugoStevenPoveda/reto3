package reto3;

import javax.swing.table.AbstractTableModel;

public class DatosProductos extends AbstractTableModel{

	
	private static final long serialVersionUID = 1L;
	
	// traer base de datos inicial
	
	ProductosIniciales hola = new ProductosIniciales();
	BaseDatosProductos dato = hola.iniciarProductos();
	Object[] datos = dato.crearObjetosListaProductos();
	
   
	
	
	//nombres de columnas
	private String[] nombreColumnas = {"Nombre","Precio","Imnventario"};
	
	private Object[][] datosFilasProductos = {
			(Object[]) datos[0],
			(Object[]) datos[1],
			(Object[]) datos[2],
			(Object[]) datos[3],
			(Object[]) datos[4],
			(Object[]) datos[5],
			(Object[]) datos[6],
			(Object[]) datos[7],
			(Object[]) datos[8],
			(Object[]) datos[9]
			
	};

	
//	private Object[][] datosFilasProductos = {
//			{"hola",412.5,8},
//			{"holsssa",412.5,8},
//			{"holaaaa",412.5,8},
//	};
    


	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datosFilasProductos.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nombreColumnas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return datosFilasProductos[rowIndex][columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		return nombreColumnas[column];}
}
	
	
	

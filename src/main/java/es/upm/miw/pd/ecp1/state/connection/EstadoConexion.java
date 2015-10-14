package es.upm.miw.pd.ecp1.state.connection;

public abstract class EstadoConexion {

	protected Conexion conexion;
	
	public EstadoConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	public void abrir() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void cerrar() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void parar() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void iniciar() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void enviar(String msg) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void recibir(int respuesta) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public abstract Estado getEstado();
}

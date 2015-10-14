package es.upm.miw.pd.ecp1.state.connection;

public class EstadoConexionCerrado extends EstadoConexion {
	
	public EstadoConexionCerrado(Conexion conexion) {
		super(conexion);
	}

	@Override
	public void abrir() throws UnsupportedOperationException {
		conexion.setEstadoConexion(new EstadoConexionPreparado(conexion));
	}

	@Override
	public void cerrar() throws UnsupportedOperationException {
	}

	@Override
	public Estado getEstado() {
		return Estado.CERRADO;
	}
}

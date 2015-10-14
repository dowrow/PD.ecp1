package es.upm.miw.pd.ecp1.state.connection;

public class EstadoConexionParado extends EstadoConexion {

	public EstadoConexionParado(Conexion conexion) {
		super(conexion);
	}

	@Override
	public void parar() throws UnsupportedOperationException {
	}

	@Override
	public void iniciar() throws UnsupportedOperationException {
		conexion.setEstadoConexion(new EstadoConexionPreparado(conexion));
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}
}

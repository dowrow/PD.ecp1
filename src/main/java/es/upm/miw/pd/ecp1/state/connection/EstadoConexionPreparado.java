package es.upm.miw.pd.ecp1.state.connection;

public class EstadoConexionPreparado extends EstadoConexion {

	public EstadoConexionPreparado(Conexion conexion) {
		super(conexion);
	}

	@Override
	public void abrir() throws UnsupportedOperationException {
	}

	@Override
	public void cerrar() throws UnsupportedOperationException {
		conexion.setEstadoConexion(new EstadoConexionCerrado(conexion));
	}

	@Override
	public void parar() throws UnsupportedOperationException {
		conexion.setEstadoConexion(new EstadoConexionParado(conexion));
	}

	@Override
	public void iniciar() throws UnsupportedOperationException {
	}

	@Override
	public void enviar(String msg) throws UnsupportedOperationException {
		conexion.getLink().enviar(msg);
		conexion.setEstadoConexion(new EstadoConexionEsperando(conexion));
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}
}

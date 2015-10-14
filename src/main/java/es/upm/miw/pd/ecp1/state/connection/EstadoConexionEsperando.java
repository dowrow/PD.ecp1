package es.upm.miw.pd.ecp1.state.connection;

public class EstadoConexionEsperando extends EstadoConexion {

	public EstadoConexionEsperando(Conexion conexion) {
		super(conexion);
	}

	@Override
	public void recibir(int respuesta) throws UnsupportedOperationException {
		if (respuesta == 0) {
			conexion.setEstadoConexion(new EstadoConexionPreparado(conexion));
		} 
		if (respuesta > 0) {
			conexion.setEstadoConexion(new EstadoConexionCerrado(conexion));
		}
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}
}

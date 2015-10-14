package es.upm.miw.pd.ecp1.state.connection;

public class Conexion {
	
    private EstadoConexion estadoConexion;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estadoConexion = new EstadoConexionCerrado(this);
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estadoConexion.getEstado();
    }

    public void abrir() {
    	this.estadoConexion.abrir();
    }

    public void cerrar() {
    	this.estadoConexion.cerrar();
    }

    public void parar() {
    	this.estadoConexion.parar();
    }

    public void iniciar() {
    	this.estadoConexion.iniciar();
    }

    public void enviar(String msg) {
    	this.estadoConexion.enviar(msg);
    }

    public void recibir(int respuesta) {
    	this.estadoConexion.recibir(respuesta);
    }

	public void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}

}

package es.upm.miw.pd.ecp1.text;

public abstract class Componente {
	public abstract String dibujar(boolean mayusculas);
	public abstract void add(Componente componente) throws UnsupportedOperationException;
}

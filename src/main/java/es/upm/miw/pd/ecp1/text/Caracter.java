package es.upm.miw.pd.ecp1.text;

public class Caracter extends Componente {
	private char valor;
	
	public Caracter(char valor) {
		this.setValor(valor);
	}
	
	@Override
	public String dibujar(boolean mayusculas) {
		if (mayusculas) {
			return Character.toUpperCase(valor) + "";
		} else {
			return valor + "";	
		}
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
	}

	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

}

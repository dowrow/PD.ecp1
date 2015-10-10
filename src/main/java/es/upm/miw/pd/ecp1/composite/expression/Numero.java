package es.upm.miw.pd.ecp1.composite.expression;

public class Numero extends Expresion {
	private int value;
	
	public Numero(int value) {
		this.value = value;
	}
	
	@Override
	public int operar() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}

}

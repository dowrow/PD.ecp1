package es.upm.miw.pd.ecp1.composite.expression;

public abstract class ComposedExpresion extends Expresion {
	protected Expresion operador1;
	protected Expresion operador2;
	protected String operator;
	
	public ComposedExpresion (Expresion operador1, Expresion operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	

	@Override
	public String toString() {
		return "(" + this.operador1.toString() + this.operator + this.operador2.toString() + ")";
	}
}

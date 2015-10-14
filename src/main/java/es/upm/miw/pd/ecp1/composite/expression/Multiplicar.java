package es.upm.miw.pd.ecp1.composite.expression;

public class Multiplicar extends ComposedExpresion {

	public Multiplicar(Expresion operador1, Expresion operador2) {
		super(operador1, operador2);
		this.operator = "*";
	}

	@Override
	public int operar() {
		return this.operador1.operar() * this.operador2.operar();
	}
}

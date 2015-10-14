package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

    public NaturalNumberFr(int value) {
		super(value);
		String[] textValues = {"zéro", "un", "deux", "trois", "quatre", "cinq"};
		setTextValue(textValues);
	}
	
}

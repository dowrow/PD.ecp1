package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    public NaturalNumberEs(int value) {
		super(value);
		String[] textValue = {"zero", "one", "two", "three", "four", "five"};
		setTextValue(textValue);
	}
	
}

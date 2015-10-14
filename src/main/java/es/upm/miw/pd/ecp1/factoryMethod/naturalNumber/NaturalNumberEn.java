package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	
    public NaturalNumberEn(int value) {
		super(value);
		String[] textValues = {"zero", "one", "two", "three", "four", "five"}; 
		setTextValue(textValues);
	}
	
}

package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    public NaturalNumberEs(int value) {
		super(value);
		String[] textValues = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
		setTextValue(textValues);
	}
	
}

package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEn(int value) {
		super(value);
	}
	
    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return NaturalNumberEn.textValue[this.getValue()];
        } else {
            return "???";
        }
    }
}

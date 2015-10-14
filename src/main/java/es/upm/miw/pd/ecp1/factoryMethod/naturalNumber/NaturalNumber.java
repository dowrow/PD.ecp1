package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public abstract class NaturalNumber {
	
	private String[] textValue;
	
    private int value;

    public NaturalNumber(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }
    
    public void setTextValue(String[] textValue){
    	this.textValue = textValue;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return textValue[this.getValue()];
        } else {
            return "???";
        }
    }
}

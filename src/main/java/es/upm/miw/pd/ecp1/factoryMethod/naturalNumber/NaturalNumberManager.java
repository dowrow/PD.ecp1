package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	NaturalNumberFactory factory;
	
	public void setNaturalNumberFactory(NaturalNumberFactory factory){
		this.factory = factory;
	}
	
	public NaturalNumber createNaturalNumber(int value) {
		return this.factory.createNaturalNumber(value);
	}

}

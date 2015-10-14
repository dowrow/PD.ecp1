package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEnFactory extends NaturalNumberFactory {

	@Override
	public NaturalNumberEn createNaturalNumber(int value) {
		return new NaturalNumberEn(value);
	}

}

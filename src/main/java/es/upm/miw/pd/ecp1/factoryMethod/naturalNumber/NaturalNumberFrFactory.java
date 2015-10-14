package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberFrFactory extends NaturalNumberFactory {

	@Override
	public NaturalNumberFr createNaturalNumber(int value) {
		return new NaturalNumberFr(value);
	}

}

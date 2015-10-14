package es.upm.miw.pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEsFactory extends NaturalNumberFactory {

	@Override
	public NaturalNumberEs createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}

}

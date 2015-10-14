package factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumber;
import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumberEnFactory;
import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumberEsFactory;
import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumberFactory;
import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumberFrFactory;
import es.upm.miw.pd.ecp1.factoryMethod.naturalNumber.NaturalNumberManager;

public class NaturalNumberManagerTest {
	
	NaturalNumberManager manager;
	
	NaturalNumberFactory factory;
	
	NaturalNumber number;
	
	public NaturalNumberManagerTest() {
		manager = new NaturalNumberManager();
	}
	
	@Test
	public void testNaturalNumberEs() {
		factory = new NaturalNumberEsFactory();
		manager.setNaturalNumberFactory(factory);
		number = manager.createNaturalNumber(0);
		assertEquals("cero", number.getTextValue());
		number = manager.createNaturalNumber(1);
		assertEquals("uno", number.getTextValue());
		number = manager.createNaturalNumber(2);
		assertEquals("dos", number.getTextValue());
		number = manager.createNaturalNumber(3);
		assertEquals("tres", number.getTextValue());
		number = manager.createNaturalNumber(4);
		assertEquals("cuatro", number.getTextValue());
		number = manager.createNaturalNumber(5);
		assertEquals("cinco", number.getTextValue());
	}

	@Test
	public void testNaturalNumberEn() {
		factory = new NaturalNumberEnFactory();
		manager.setNaturalNumberFactory(factory);
		number = manager.createNaturalNumber(0);
		assertEquals("zero", number.getTextValue());
		number = manager.createNaturalNumber(1);
		assertEquals("one", number.getTextValue());
		number = manager.createNaturalNumber(2);
		assertEquals("two", number.getTextValue());
		number = manager.createNaturalNumber(3);
		assertEquals("three", number.getTextValue());
		number = manager.createNaturalNumber(4);
		assertEquals("four", number.getTextValue());
		number = manager.createNaturalNumber(5);
		assertEquals("five", number.getTextValue());
	}

	@Test
	public void testNaturalNumberFr() {
		factory = new NaturalNumberFrFactory();
		manager.setNaturalNumberFactory(factory);
		number = manager.createNaturalNumber(0);
		assertEquals("zéro", number.getTextValue());
		number = manager.createNaturalNumber(1);
		assertEquals("un", number.getTextValue());
		number = manager.createNaturalNumber(2);
		assertEquals("deux", number.getTextValue());
		number = manager.createNaturalNumber(3);
		assertEquals("trois", number.getTextValue());
		number = manager.createNaturalNumber(4);
		assertEquals("quatre", number.getTextValue());
		number = manager.createNaturalNumber(5);
		assertEquals("cinq", number.getTextValue());
	}
}

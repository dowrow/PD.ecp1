package es.upm.miw.pd.ecp1.visitor.figure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
	
	private FiguresManager manager;
	
	public FiguresManagerTest() {
		manager = new FiguresManager();
	}
	
	@Before
	public void before() {
		Circle circle = new Circle("Circle", 10);
		Triangle triangle = new Triangle("Triangle", 10, 10);
		Square square = new Square("Square", 10);
		manager.add(circle);
		manager.add(triangle);
		manager.add(square);
	}
	
	@Test
	public void testTotalArea() {
		assertEquals(manager.totalArea(), 464.16, 10e-2);
	}
	
	@Test
	public void testTotalNumberOfSides() {
		assertEquals(manager.totalNumberOfSides(), Double.POSITIVE_INFINITY, 10e-2);
	}
}

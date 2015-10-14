package es.upm.miw.pd.ecp1.visitor.figure;

public class TotalNumberOfSidesFigureVisitor extends FigureVisitor {
	
	private double sides;
	
	public TotalNumberOfSidesFigureVisitor() {
		sides = 0;
	}
	
	@Override
	public void visit(Circle circle) {
		sides += circle.numberOfSides();
	}

	@Override
	public void visit(Square square) {
		sides += square.numberOfSides();
	}

	@Override
	public void visit(Triangle triangle) {
		sides += triangle.numberOfSides();
	}
	
	public double getTotalNumberOfSides() {
		return sides;
	}

}

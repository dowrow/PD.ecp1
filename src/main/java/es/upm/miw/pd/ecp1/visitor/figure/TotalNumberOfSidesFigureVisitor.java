package es.upm.miw.pd.ecp1.visitor.figure;

public class TotalNumberOfSidesFigureVisitor extends FigureVisitor {
	
	private double sides;
	
	public TotalNumberOfSidesFigureVisitor() {
		sides = 0;
	}
	
	@Override
	public void visit(Circle circle) {
		sides += Double.POSITIVE_INFINITY;
	}

	@Override
	public void visit(Square square) {
		sides += 4;
	}

	@Override
	public void visit(Triangle triangle) {
		sides += 3;
	}
	
	public double getTotalNumberOfSides() {
		return sides;
	}

}

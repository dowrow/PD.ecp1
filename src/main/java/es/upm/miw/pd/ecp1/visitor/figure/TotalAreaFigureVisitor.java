package es.upm.miw.pd.ecp1.visitor.figure;

public class TotalAreaFigureVisitor extends FigureVisitor {
	
	private double totalArea;
	
	public TotalAreaFigureVisitor() {
		totalArea = 0.0;
	}

	@Override
	public void visit(Circle circle) {
		totalArea += circle.area();
	}

	@Override
	public void visit(Square square) {
		totalArea += square.area();
	}

	@Override
	public void visit(Triangle triangle) {
		totalArea += triangle.area();
	}
	
	public double getTotalArea() {
		return totalArea;
	}

}

package es.upm.miw.pd.ecp1.visitor.figure;

public class TotalAreaFigureVisitor extends FigureVisitor {
	
	private double totalArea;
	
	public TotalAreaFigureVisitor() {
		totalArea = 0.0;
	}

	@Override
	public void visit(Circle circle) {
		totalArea += Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public void visit(Square square) {
		totalArea += square.getSide() * square.getSide();
	}

	@Override
	public void visit(Triangle triangle) {
		totalArea += triangle.getBase() * triangle.getHeight() * 0.5;
	}
	
	public double getTotalArea() {
		return totalArea;
	}

}

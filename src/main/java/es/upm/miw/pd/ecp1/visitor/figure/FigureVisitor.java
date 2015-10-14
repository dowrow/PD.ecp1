package es.upm.miw.pd.ecp1.visitor.figure;

public abstract class FigureVisitor {

	public abstract void visit(Circle circle);
	
	public abstract void visit(Square square);
	
	public abstract void visit(Triangle triangle);

}

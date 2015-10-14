package es.upm.miw.pd.ecp1.visitor.figure;

public class FiguresManager {

	private TotalAreaFigureVisitor areaVisitor;
    private TotalNumberOfSidesFigureVisitor sidesVisitor;
    
    public FiguresManager() {
        areaVisitor = new TotalAreaFigureVisitor();
        sidesVisitor = new TotalNumberOfSidesFigureVisitor();
    }

    public void add(Figure figure) {
    	figure.accept(areaVisitor);
    	figure.accept(sidesVisitor);
    }

    public double totalArea() {
    	return areaVisitor.getTotalArea();
    }

    public double totalNumberOfSides() {
    	return sidesVisitor.getTotalNumberOfSides();
    }

}

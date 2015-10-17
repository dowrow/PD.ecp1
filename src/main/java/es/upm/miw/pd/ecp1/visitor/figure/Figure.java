package es.upm.miw.pd.ecp1.visitor.figure;

public abstract class Figure {

    public Figure(String description) {
    }
    
    public abstract double numberOfSides();

    public abstract void accept(FigureVisitor visitor);
    
}

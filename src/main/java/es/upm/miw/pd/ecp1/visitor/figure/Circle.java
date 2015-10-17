package es.upm.miw.pd.ecp1.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.setRadius(radius);
    }

	@Override
	public void accept(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}

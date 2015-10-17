package es.upm.miw.pd.ecp1.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.setSide(side);
    }

    @Override
    public double numberOfSides() {
        return 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}

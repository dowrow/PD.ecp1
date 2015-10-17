package es.upm.miw.pd.ecp1.visitor.figure;

public class Triangle extends Figure {
   
	private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.setBase(base);
        this.setHeight(height);
    }

    @Override
    public double numberOfSides() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(FigureVisitor visitor) {
		visitor.visit(this);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}

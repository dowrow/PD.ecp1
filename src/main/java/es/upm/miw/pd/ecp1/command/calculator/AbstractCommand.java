package es.upm.miw.pd.ecp1.command.calculator;

public abstract class AbstractCommand implements Command {
	
	private Calculator calculator;
	
	private String name;
	
	public AbstractCommand(Calculator calculator) {
		this.setCalculator(calculator);
	}
	
	public String name() {
		return getName();
	}
	
	public abstract void execute();

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
}

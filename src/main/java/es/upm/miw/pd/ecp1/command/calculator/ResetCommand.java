package es.upm.miw.pd.ecp1.command.calculator;

public class ResetCommand extends AbstractCommand {

	public ResetCommand(Calculator calculator) {
		super(calculator);
		setName("Reset");
	}

	@Override
	public void execute() {
		getCalculator().reset();
	}

}

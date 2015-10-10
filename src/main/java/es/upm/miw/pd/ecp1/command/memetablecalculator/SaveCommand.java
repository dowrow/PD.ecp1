package es.upm.miw.pd.ecp1.command.memetablecalculator;

import es.upm.miw.pd.ecp1.command.calculator.AbstractCommand;
import es.upm.miw.pd.ecp1.command.calculator.Calculator;

public class SaveCommand extends AbstractCommand {

	public SaveCommand(Calculator calculator) {
		super(calculator);
		setName("Save");
	}

	@Override
	public void execute() {
		((MementableCalculator)getCalculator()).save();
	}

}

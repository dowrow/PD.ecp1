package es.upm.miw.pd.ecp1.command.memetableCalculator;

import es.upm.miw.pd.ecp1.command.calculator.AbstractCommand;
import es.upm.miw.pd.ecp1.command.calculator.Calculator;

public class UndoCommand extends AbstractCommand {

	public UndoCommand(Calculator calculator) {
		super(calculator);
		setName("Undo");
	}

	@Override
	public void execute() {
		((MementableCalculator)getCalculator()).undo();
	}

}

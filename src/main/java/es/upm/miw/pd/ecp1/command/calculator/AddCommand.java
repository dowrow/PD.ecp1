package es.upm.miw.pd.ecp1.command.calculator;

import upm.jbb.IO;

public class AddCommand extends AbstractCommand {

	public AddCommand(Calculator calculator) {
		super(calculator);
		this.setName("Add");
	}

	@Override
	public void execute() {
		int operando = IO.getIO().readInt();
		this.getCalculator().add(operando);
	}
}

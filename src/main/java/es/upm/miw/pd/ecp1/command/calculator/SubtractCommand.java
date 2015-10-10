package es.upm.miw.pd.ecp1.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends AbstractCommand {
	
	public SubtractCommand(Calculator calculator) {
		super(calculator);
		this.setName("Substract");
	}

	@Override
	public void execute() {
		int operando = IO.getIO().readInt();
		this.getCalculator().subtract(operando);
	}

}

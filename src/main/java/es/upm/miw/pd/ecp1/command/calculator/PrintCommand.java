package es.upm.miw.pd.ecp1.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends AbstractCommand {

	public PrintCommand(Calculator calculator) {
		super(calculator);
		setName("Print");
	}

	@Override
	public void execute() {
		IO.getIO().print(getCalculator().getTotal());
	}
	
}

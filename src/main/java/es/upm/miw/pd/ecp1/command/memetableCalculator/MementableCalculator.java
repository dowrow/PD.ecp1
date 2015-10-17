package es.upm.miw.pd.ecp1.command.memetableCalculator;

import es.upm.miw.pd.ecp1.command.calculator.Calculator;

public class MementableCalculator extends Calculator {
	
	MementoCalculator memento;
	
	public void save() {
		memento = new MementoCalculator(getTotal());
	}
	
	public void undo() {
		setTotal(memento.getTotal());
	}
}

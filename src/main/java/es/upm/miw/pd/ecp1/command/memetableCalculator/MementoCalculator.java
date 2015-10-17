package es.upm.miw.pd.ecp1.command.memetableCalculator;

public class MementoCalculator {
	
	private int total;
	
	public MementoCalculator (int total) {
		this.setTotal(total);
	}

	public int getTotal() {
		return total;
	}

	private void setTotal(int total) {
		this.total = total;
	}
}

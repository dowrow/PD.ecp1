package es.upm.miw.pd.ecp1.text;

public class Texto extends TextoCompuesto {
	
	@Override
	public void add(Componente componente) {
		if (componente.isCaracter()) {
			throw new UnsupportedOperationException();
		} else {
			componentes.add(componente);
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String texto = "";
		for (Componente componente : componentes) {
			texto += componente.dibujar(mayusculas);
		}
		return texto + "---o---\n";
	}

	@Override
	public boolean isCaracter() {
		return false;
	}
}

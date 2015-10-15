package es.upm.miw.pd.ecp1.text;

import java.util.ArrayList;

public class Parrafo extends TextoCompuesto {
	
	public Parrafo() {
		this.componentes = new ArrayList<>();
	}
	
	@Override
	public String dibujar(boolean mayusculas) {
		String texto = "";
		for (Componente componente : componentes) {
			texto += componente.dibujar(mayusculas);
		}		
		return texto + "\n"; 
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		if (componente.isCaracter()) {
			componentes.add(componente);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean isCaracter() {
		return false;
	}	
}

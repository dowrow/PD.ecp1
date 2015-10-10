package es.upm.miw.pd.ecp1.text;

import java.util.ArrayList;

public class Parrafo extends TextoCompuesto {
	
	ArrayList<Componente> componentes;
	
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
	
	public void add(Caracter c) {
		this.componentes.add(c);
	}
	
	public void add(TextoCompuesto t) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
}

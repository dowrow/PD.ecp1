package es.upm.miw.pd.ecp1.text;

import java.util.ArrayList;

public abstract class TextoCompuesto extends Componente {

	protected ArrayList<Componente> componentes;
	
	public TextoCompuesto() {
		componentes = new ArrayList<>();
	}
}

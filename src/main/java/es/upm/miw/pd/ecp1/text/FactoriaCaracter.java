package es.upm.miw.pd.ecp1.text;

import java.util.HashMap;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factoria = null;
	
	private HashMap<Character, Caracter> map;
	
	private FactoriaCaracter() {
		this.map = new HashMap<>();
	}
	
	public static FactoriaCaracter getFactoria() {
		if (factoria == null) {
			factoria = new FactoriaCaracter();
		}
		return factoria;
	}
	
	public Caracter get(char valor) {
		if (map.containsKey(valor)) {
			return this.map.get(valor);	
		} else {
			Caracter nuevoCaracter = new Caracter(valor);
			this.map.put(valor,  nuevoCaracter);
			return nuevoCaracter;
		}
	}
}

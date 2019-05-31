package it.makeit.fatturazione.commons.configuration;

import java.util.HashMap;
import java.util.Map;

public class GestionepagamentiConfiguration {
	
	private Map<String,Pagamento> gestionepagamenti = new HashMap<String, Pagamento>();

	public static class Pagamento{
		private String id;
		private String causale;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getCausale() {
			return causale;
		}
		public void setCausale(String causale) {
			this.causale = causale;
		}
	}

	public Map<String, Pagamento> getGestionepagamenti() {
		return gestionepagamenti;
	}

	public void setGestionepagamenti(Map<String, Pagamento> gestionepagamenti) {
		this.gestionepagamenti = gestionepagamenti;
	}

	

}

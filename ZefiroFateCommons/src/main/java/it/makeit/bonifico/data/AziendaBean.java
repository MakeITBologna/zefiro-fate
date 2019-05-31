package it.makeit.bonifico.data;

public class AziendaBean {

	private String codiceCuc;
	private boolean codiceCUCIsModified = false;
	private String codiceSIA;
	private boolean codiceSIAIsModified = false;
	private String denominazione;
	private boolean denominazioneIsModified = false;
	private String codiceFiscale;
	private boolean codiceFiscaleIsModified = false;

	public AziendaBean() {

	}

	public String getCodiceSIA() {
		return codiceSIA;
	}

	public void setCodiceSIA(String codiceSIA) {
		this.codiceSIA = codiceSIA;
		this.codiceSIAIsModified = true;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
		this.denominazioneIsModified = true;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		this.codiceFiscaleIsModified = true;
	}

	/**
	 * Restituisce <tt>true</tt> se uno dei campi del bean si trova nello stato
	 * 'modificato', <tt>false</tt> altrimenti.
	 * 
	 * @return <tt>true</tt> se uno dei campi del bean si trova nello stato
	 *         'modificato', <tt>false</tt> altrimenti.
	 */
	public boolean isModified() {
		return codiceSIAIsModified || denominazioneIsModified
				|| codiceFiscaleIsModified || codiceCUCIsModified;
	}

	/**
	 * Ritorna una clonazione del bean corrente.
	 * 
	 * @return clone del bean.
	 */
	public AziendaBean clone() {
		AziendaBean lAziendaBean = new AziendaBean();
		lAziendaBean.setCodiceSIA(this.getCodiceSIA());
		lAziendaBean.setDenominazione(this.getDenominazione());
		lAziendaBean.setCodiceFiscale(this.getCodiceFiscale());
		lAziendaBean.setCodiceCuc(this.getCodiceCuc());

		return lAziendaBean;
	}

	public String getCodiceCuc() {
		return codiceCuc;
	}

	public void setCodiceCuc(String codiceCuc) {
		this.codiceCuc = codiceCuc.toUpperCase();
		this.codiceCUCIsModified = true;
	}
}

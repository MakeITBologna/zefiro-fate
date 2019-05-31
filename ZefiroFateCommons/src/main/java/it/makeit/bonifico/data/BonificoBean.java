package it.makeit.bonifico.data;

public class BonificoBean {

	private BankBean banca;
	private boolean bancaIsModified = false;
	private ContropartiBean controparte;
	private boolean controparteIsModified = false;
	private Double importo;
	private boolean importoIsModified = false;
	private String causale;
	private boolean causaleIsModified = false;
	
	public BonificoBean() {

	}

	public BankBean getBanca() {
		return banca;
	}

	public void setBanca(BankBean banca) {
		this.banca = banca;
		this.bancaIsModified = true;
	}

	public ContropartiBean getControparte() {
		return controparte;
	}

	public void setControparte(ContropartiBean controparte) {
		this.controparte = controparte;
		this.controparteIsModified = true;
	}

	public Double getImporto() {
		return importo;
	}

	public void setImporto(Double importo) {
		this.importo = importo;
		this.importoIsModified = true;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
		this.causaleIsModified = true;
	}

	/**
	 * Restituisce <tt>true</tt> se uno dei campi del bean si trova nello stato
	 * 'modificato', <tt>false</tt> altrimenti.
	 * 
	 * @return <tt>true</tt> se uno dei campi del bean si trova nello stato
	 *         'modificato', <tt>false</tt> altrimenti.
	 */
	public boolean isModified() {
		return this.bancaIsModified || this.controparteIsModified || this.importoIsModified || this.causaleIsModified;
	}

	/**
	 * Ritorna una clonazione del bean corrente.
	 * 
	 * @return clone del bean.
	 */
	public BonificoBean clone() {
		BonificoBean lBonificoBean = new BonificoBean();
		lBonificoBean.setBanca(this.getBanca());
		lBonificoBean.setControparte(this.getControparte());
		lBonificoBean.setImporto(this.getImporto());
		lBonificoBean.setCausale(this.causale);

		return lBonificoBean;
	}

}


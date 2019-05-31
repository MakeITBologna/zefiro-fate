package it.makeit.bonifico.data;

public class BankBean {

	private String IBAN;
	private boolean IBANIsModified = false;

	public BankBean() {

	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		this.IBAN = iBAN;
		this.IBANIsModified = true;
	}

	/**
	 * Restituisce <tt>true</tt> se uno dei campi del bean si trova nello stato
	 * 'modificato', <tt>false</tt> altrimenti.
	 * 
	 * @return <tt>true</tt> se uno dei campi del bean si trova nello stato
	 *         'modificato', <tt>false</tt> altrimenti.
	 */
	public boolean isModified() {
		return IBANIsModified;
	}

	/**
	 * Ritorna una clonazione del bean corrente.
	 * 
	 * @return clone del bean.
	 */
	public BankBean clone() {
		BankBean lBancaBean = new BankBean();
		lBancaBean.setIBAN(this.getIBAN());

		return lBancaBean;
	}

}

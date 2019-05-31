package it.makeit.bonifico.data;

public abstract class ContropartiBean {

	private String fullname;
	protected boolean fullnameIsModified = false;
	private String iban;
	protected boolean ibanIsModified = false;

	public ContropartiBean() {
		super();
	}

	/**
	 * Restituisce il valore del campo Fullname.
	 * <br>
	 * Meta Data:
	 * <ul>
	 * <li>nome colonna: dipendenti.fullname
	 * <li>dimensione colonna: 100
	 * <li>jdbc type restituito dal driver: Types.VARCHAR
	 * </ul>
	 *
	 * @return il valore del campo Cognome.
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * Assegna il valore passato in input al campo Fullname.
	 * <br>
	 * Il nuovo valore � assegnato solo se il nuovo valore da
	 * assegnare e il valore corrente del campo sono differenti.
	 * <br>
	 * Meta Data:
	 * <ul>
	 * <li>nome colonna: dipendenti.fullname
	 * <li>dimensione colonna: 100
	 * <li>jdbc type restituito dal driver: Types.VARCHAR
	 * </ul>
	 *
	 * @param pStrCognome valore da assegnare al campo Cognome.
	 */
	public void setFullname(String pStrFullname) {
		fullname = pStrFullname;
		fullnameIsModified = true;
	}

	/**
	 * Indica se il campo Fullname � stato modificato.
	 *
	 * @return <tt>true</tt> se il campo Cognome � stato modificato, <tt>false</tt> se il campo Cognome non � stato modificato.
	 */
	public boolean isFullnameModified() {
		return fullnameIsModified;
	}

	/**
	 * Restituisce il valore del campo Iban.
	 * <br>
	 * Meta Data:
	 * <ul>
	 * <li>nome colonna: dipendenti.IBAN
	 * <li>dimensione colonna: 27
	 * <li>jdbc type restituito dal driver: Types.VARCHAR
	 * </ul>
	 *
	 * @return il valore del campo Iban.
	 */
	public String getIban() {
	    return iban;
	}

	/**
	* Assegna il valore passato in input al campo Iban.
	* <br>
	* Il nuovo valore � assegnato solo se il nuovo valore da
	* assegnare e il valore corrente del campo sono differenti.
	* <br>
	* Meta Data:
	* <ul>
	* <li>nome colonna: dipendenti.IBAN
	* <li>dimensione colonna: 27
	* <li>jdbc type restituito dal driver: Types.VARCHAR
	* </ul>
	*
	* @param pStrIban valore da assegnare al campo Iban.
	*/
	public void setIban(String pStrIban) {
	    iban = pStrIban;
	    ibanIsModified = true;
	}

	/**
	 * Indica se il campo Iban � stato modificato.
	 *
	 * @return <tt>true</tt> se il campo Iban � stato modificato, <tt>false</tt> se il campo Iban non � stato modificato.
	 */
	public boolean isIbanModified() {
	    return ibanIsModified;
	}

}
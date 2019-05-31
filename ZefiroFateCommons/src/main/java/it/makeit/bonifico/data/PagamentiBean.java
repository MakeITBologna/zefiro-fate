package it.makeit.bonifico.data;

import java.util.List;

public class PagamentiBean {

	private AziendaBean azienda;
	private boolean aziendaIsModified = false;
	private List<BonificoBean> bonifici;
	private boolean bonificiIsModified = false;

	public PagamentiBean() {

	}

	public AziendaBean getAzienda() {
		return azienda;
	}

	public void setAzienda(AziendaBean azienda) {
		this.azienda = azienda;
		this.aziendaIsModified = true;
	}

	public List<BonificoBean> getBonifici() {
		return bonifici;
	}

	public void setBonifici(List<BonificoBean> bonifici) {
		this.bonifici = bonifici;
		this.bonificiIsModified = true;
	}

	/**
	 * Restituisce <tt>true</tt> se uno dei campi del bean si trova nello stato
	 * 'modificato', <tt>false</tt> altrimenti.
	 * 
	 * @return <tt>true</tt> se uno dei campi del bean si trova nello stato
	 *         'modificato', <tt>false</tt> altrimenti.
	 */
	public boolean isModified() {
		return this.bonificiIsModified || this.aziendaIsModified;
	}

	/**
	 * Ritorna una clonazione del bean corrente.
	 * 
	 * @return clone del bean.
	 */
	public PagamentiBean clone() {
		PagamentiBean lStipendiDipendentiBean = new PagamentiBean();
		lStipendiDipendentiBean.setAzienda(this.getAzienda());
		lStipendiDipendentiBean.setBonifici(this.getBonifici());

		return lStipendiDipendentiBean;
	}
}

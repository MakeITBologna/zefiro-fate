package it.makeit.fatturazione.commons.cliente;

public class Cliente {
	
	String ragioneSociale;
	String partitaIVA;
	String codFiscale;
	String CAP;
	String citta;
	String indirizzo;
	String email_1;
	String email_2;
	String codiceDestinatario;
	String splitPayment;
	String provincia;
	String numeroCivico;
	String tipo;
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String getCAP() {
		return CAP;
	}
	public void setCAP(String cAP) {
		CAP = cAP;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail_1() {
		return email_1;
	}
	public void setEmail_1(String email_1) {
		this.email_1 = email_1;
	}
	public String getEmail_2() {
		return email_2;
	}
	public void setEmail_2(String email_2) {
		this.email_2 = email_2;
	}
	public String getCodiceDestinatario() {
		return codiceDestinatario;
	}
	public void setCodiceDestinatario(String codiceDestinatario) {
		this.codiceDestinatario = codiceDestinatario;
	}
	public String getSplitPayment() {
		return splitPayment;
	}
	public void setSplitPayment(String splitPayment) {
		this.splitPayment = splitPayment;
	}
	public String getCodFiscale() {
		return codFiscale;
	}
	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

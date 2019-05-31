package it.makeit.fatturazione.commons.banca;

public class Banca{
	
	String abi;
	String beneficiario;
	String bic;
	String cab;
	String iban;
	String istitutoFinanziario;
	//String tipologiaIntestatario;

	public String getAbi() {
		return abi;
	}
	public void setAbi(String abi) {
		this.abi = abi;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getCab() {
		return cab;
	}
	public void setCab(String cab) {
		this.cab = cab;
	}

	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getIstitutoFinanziario() {
		return istitutoFinanziario;
	}
	public void setIstitutoFinanziario(String istitutoFinanziario) {
		this.istitutoFinanziario = istitutoFinanziario;
	}
	/*public String getTipologiaIntestatario() {
		return tipologiaIntestatario;
	}
	public void setTipologiaIntestatario(String tipologiaIntestatario) {
		this.tipologiaIntestatario = tipologiaIntestatario;
	}*/

}

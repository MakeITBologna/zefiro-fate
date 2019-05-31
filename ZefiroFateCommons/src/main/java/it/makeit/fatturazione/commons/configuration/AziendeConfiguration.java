package it.makeit.fatturazione.commons.configuration;

import java.util.HashMap;
import java.util.Map;

public class AziendeConfiguration{
		private Map<String,Azienda> aziende = new HashMap<>();

		public Map<String,Azienda> getAziende() {
			return aziende;
		}

		public void setAziende(Map<String,Azienda> aziende) {
			this.aziende = aziende;
		}
	
		
		public static class Azienda {
			private String nome;
			private String alfrescopath;
			private String unimaticapath;
			
			private String idpaesefiscale;
			private String idcodicefiscale;
			private String anagraficaNome;
			private String anagraficaCognome;
			private String anagraficaDenominazione;
			private String regimeFiscale;
			
			private String sedeIndirizzo;
			private String sedeCivico;
			private String sedeCAP;
			private String sedeComune;
			private String sedeProvincia;
			private String sedeNazione;
			
			private String divisa;
			
			private String codiceCuc;
		
			

			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getAlfrescopath() {
				return alfrescopath;
			}
			public void setAlfrescopath(String alfrescopath) {
				this.alfrescopath = alfrescopath;
			}
			public String getUnimaticapath() {
				return unimaticapath;
			}
			public void setUnimaticapath(String unimaticapath) {
				this.unimaticapath = unimaticapath;
			}
			public String getIdpaesefiscale() {
				return idpaesefiscale;
			}
			public void setIdpaesefiscale(String idpaesefiscale) {
				this.idpaesefiscale = idpaesefiscale;
			}
			public String getIdcodicefiscale() {
				return idcodicefiscale;
			}
			public void setIdcodicefiscale(String idcodicefiscale) {
				this.idcodicefiscale = idcodicefiscale;
			}
			public String getAnagraficaNome() {
				return anagraficaNome;
			}
			public void setAnagraficaNome(String anagraficaNome) {
				this.anagraficaNome = anagraficaNome;
			}
			public String getAnagraficaCognome() {
				return anagraficaCognome;
			}
			public void setAnagraficaCognome(String anagraficaCognome) {
				this.anagraficaCognome = anagraficaCognome;
			}
			public String getAnagraficaDenominazione() {
				return anagraficaDenominazione;
			}
			public void setAnagraficaDenominazione(String anagraficaDenominazione) {
				this.anagraficaDenominazione = anagraficaDenominazione;
			}
			public String getRegimeFiscale() {
				return regimeFiscale;
			}
			public void setRegimeFiscale(String regimeFiscale) {
				this.regimeFiscale = regimeFiscale;
			}
			public String getSedeIndirizzo() {
				return sedeIndirizzo;
			}
			public void setSedeIndirizzo(String sedeIndirizzo) {
				this.sedeIndirizzo = sedeIndirizzo;
			}
			public String getSedeCivico() {
				return sedeCivico;
			}
			public void setSedeCivico(String sedeCivico) {
				this.sedeCivico = sedeCivico;
			}
			public String getSedeCAP() {
				return sedeCAP;
			}
			public void setSedeCAP(String sedeCAP) {
				this.sedeCAP = sedeCAP;
			}
			public String getSedeComune() {
				return sedeComune;
			}
			public void setSedeComune(String sedeComune) {
				this.sedeComune = sedeComune;
			}
			public String getSedeProvincia() {
				return sedeProvincia;
			}
			public void setSedeProvincia(String sedeProvincia) {
				this.sedeProvincia = sedeProvincia;
			}
			public String getSedeNazione() {
				return sedeNazione;
			}
			public void setSedeNazione(String sedeNazione) {
				this.sedeNazione = sedeNazione;
			}
			public String getDivisa() {
				return divisa;
			}
			public void setDivisa(String divisa) {
				this.divisa = divisa;
			}
			public String getCodiceCuc() {
				return codiceCuc;
			}
			
			public void setCodiceCuc(String codiceCuc) {
				this.codiceCuc=codiceCuc;
			}
		}
		
		
	}
	
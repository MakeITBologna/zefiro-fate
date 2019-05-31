package it.makeit.bonifico.data;

/**
 * Bean che rappresenta un record della tabella dipendenti.
 *
 * @author MAKE IT
 */
public class DipendentiBean extends ContropartiBean {
    private Integer idDipendente;
    private boolean idDipendenteIsModified = false;
    private Integer numeroMatricola;
    private boolean numeroMatricolaIsModified = false;
    private String nome;
    private boolean nomeIsModified = false;
    private String cognome;
    private boolean cognomeIsModified = false;
    private String codiceFiscale;
    private boolean codiceFiscaleIsModified = false;
    private java.sql.Timestamp dataNascita;
    private boolean dataNascitaIsModified = false;
    private java.sql.Timestamp dataNascitato;
    private boolean dataNascitatoIsModified = false;
    private java.sql.Timestamp dataAssunzione;
    private boolean dataAssunzioneIsModified = false;
    private java.sql.Timestamp dataAssunzioneto;
    private boolean dataAssunzionetoIsModified = false;
    private java.sql.Timestamp dataCessazione;
    private boolean dataCessazioneIsModified = false;
    private java.sql.Timestamp dataCessazioneto;
    private boolean dataCessazionetoIsModified = false;
    private Integer livelloAttuale;
    private boolean livelloAttualeIsModified = false;
    private java.sql.Timestamp dataLivelloAttuale;
    private boolean dataLivelloAttualeIsModified = false;
    private java.sql.Timestamp dataLivelloAttualeto;
    private boolean dataLivelloAttualetoIsModified = false;
    private Integer livelloPrecedente;
    private boolean livelloPrecedenteIsModified = false;
    private java.sql.Timestamp dataLivelloPrecedente;
    private boolean dataLivelloPrecedenteIsModified = false;
    private java.sql.Timestamp dataLivelloPrecedenteto;
    private boolean dataLivelloPrecedentetoIsModified = false;
    private Integer scattiAnzianita;
    private boolean scattiAnzianitaIsModified = false;
    private java.sql.Timestamp dataProssimoScatto;
    private boolean dataProssimoScattoIsModified = false;
    private java.sql.Timestamp dataProssimoScattoto;
    private boolean dataProssimoScattotoIsModified = false;
    private String tfr;
    private boolean tfrIsModified = false;
    private Integer familiariCarico;
    private boolean familiariCaricoIsModified = false;
    private java.sql.Timestamp inizioCongedo;
    private boolean inizioCongedoIsModified = false;
    private java.sql.Timestamp inizioCongedoto;
    private boolean inizioCongedotoIsModified = false;
    private java.sql.Timestamp fineCongedo;
    private boolean fineCongedoIsModified = false;
    private java.sql.Timestamp fineCongedoto;
    private boolean fineCongedotoIsModified = false;
    private Integer idTitoloStudio;
    private boolean idTitoloStudioIsModified = false;
    private String luogoNascita;
    private boolean luogoNascitaIsModified = false;
    private String indirizzoResidenza;
    private boolean indirizzoResidenzaIsModified = false;
    private String luogoResidenza;
    private boolean luogoResidenzaIsModified = false;
    private String indirizzoDomicilio;
    private boolean indirizzoDomicilioIsModified = false;
    private String luogoDomicilio;
    private boolean luogoDomicilioIsModified = false;
    private String cellulare;
    private boolean cellulareIsModified = false;
    private Integer telefonoCasa;
    private boolean telefonoCasaIsModified = false;

    /**
     * Crea una istanza di DipendentiBean.
     */
    public DipendentiBean() {
    }

    /**
     * Restituisce il valore del campo IdDipendente.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.id_dipendente
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo IdDipendente.
     */
    public Integer getIdDipendente() {
        return idDipendente;
    }

    /**
    * Assegna il valore passato in input al campo IdDipendente.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.id_dipendente
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntIdDipendente valore da assegnare al campo IdDipendente.
    */
    public void setIdDipendente(Integer pIntIdDipendente) {
        idDipendente = pIntIdDipendente;
        idDipendenteIsModified = true;
    }

    /**
     * Indica se il campo IdDipendente � stato modificato.
     *
     * @return <tt>true</tt> se il campo IdDipendente � stato modificato, <tt>false</tt> se il campo IdDipendente non � stato modificato.
     */
    public boolean isIdDipendenteModified() {
        return idDipendenteIsModified;
    }

    /**
     * Restituisce il valore del campo NumeroMatricola.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.numero_matricola
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo NumeroMatricola.
     */
    public Integer getNumeroMatricola() {
        return numeroMatricola;
    }

    /**
    * Assegna il valore passato in input al campo NumeroMatricola.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.numero_matricola
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntNumeroMatricola valore da assegnare al campo NumeroMatricola.
    */
    public void setNumeroMatricola(Integer pIntNumeroMatricola) {
        numeroMatricola = pIntNumeroMatricola;
        numeroMatricolaIsModified = true;
    }

    /**
     * Indica se il campo NumeroMatricola � stato modificato.
     *
     * @return <tt>true</tt> se il campo NumeroMatricola � stato modificato, <tt>false</tt> se il campo NumeroMatricola non � stato modificato.
     */
    public boolean isNumeroMatricolaModified() {
        return numeroMatricolaIsModified;
    }

    /**
     * Restituisce il valore del campo Nome.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.nome
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo Nome.
     */
    public String getNome() {
        return nome;
    }

    /**
    * Assegna il valore passato in input al campo Nome.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.nome
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrNome valore da assegnare al campo Nome.
    */
    public void setNome(String pStrNome) {
        nome = pStrNome;
        nomeIsModified = true;
    }

    /**
     * Indica se il campo Nome � stato modificato.
     *
     * @return <tt>true</tt> se il campo Nome � stato modificato, <tt>false</tt> se il campo Nome non � stato modificato.
     */
    public boolean isNomeModified() {
        return nomeIsModified;
    }

    /**
     * Restituisce il valore del campo Cognome.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.cognome
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo Cognome.
     */
    public String getCognome() {
        return cognome;
    }

    /**
    * Assegna il valore passato in input al campo Cognome.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.cognome
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrCognome valore da assegnare al campo Cognome.
    */
    public void setCognome(String pStrCognome) {
        cognome = pStrCognome;
        cognomeIsModified = true;
    }

    /**
     * Indica se il campo Cognome � stato modificato.
     *
     * @return <tt>true</tt> se il campo Cognome � stato modificato, <tt>false</tt> se il campo Cognome non � stato modificato.
     */
    public boolean isCognomeModified() {
        return cognomeIsModified;
    }
    
    /**
     * Restituisce il valore del campo CodiceFiscale.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.codice_fiscale
     * <li>dimensione colonna: 16
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo CodiceFiscale.
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
    * Assegna il valore passato in input al campo CodiceFiscale.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.codice_fiscale
    * <li>dimensione colonna: 16
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrCodiceFiscale valore da assegnare al campo CodiceFiscale.
    */
    public void setCodiceFiscale(String pStrCodiceFiscale) {
        codiceFiscale = pStrCodiceFiscale;
        codiceFiscaleIsModified = true;
    }

    /**
     * Indica se il campo CodiceFiscale � stato modificato.
     *
     * @return <tt>true</tt> se il campo CodiceFiscale � stato modificato, <tt>false</tt> se il campo CodiceFiscale non � stato modificato.
     */
    public boolean isCodiceFiscaleModified() {
        return codiceFiscaleIsModified;
    }

    /**
     * Restituisce il valore del campo DataNascita.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_nascita
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataNascita.
     */
    public java.sql.Timestamp getDataNascita() {
        return dataNascita;
    }

    public java.sql.Timestamp getDataNascitato() {
        return dataNascitato;
    }

    /**
    * Assegna il valore passato in input al campo DataNascita.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_nascita
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataNascita valore da assegnare al campo DataNascita.
    */
    public void setDataNascita(java.sql.Timestamp pTimestampDataNascita) {
        dataNascita = pTimestampDataNascita;
        dataNascitaIsModified = true;
    }

    public void setDataNascitato(java.sql.Timestamp pTimestampDataNascita) {
        dataNascitato = pTimestampDataNascita;
        dataNascitatoIsModified = true;
    }

    /**
     * Indica se il campo DataNascita � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataNascita � stato modificato, <tt>false</tt> se il campo DataNascita non � stato modificato.
     */
    public boolean isDataNascitaModified() {
        return dataNascitaIsModified;
    }

    public boolean isDataNascitatoModified() {
        return dataNascitatoIsModified;
    }

    /**
     * Restituisce il valore del campo DataAssunzione.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_assunzione
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataAssunzione.
     */
    public java.sql.Timestamp getDataAssunzione() {
        return dataAssunzione;
    }

    public java.sql.Timestamp getDataAssunzioneto() {
        return dataAssunzioneto;
    }

    /**
    * Assegna il valore passato in input al campo DataAssunzione.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_assunzione
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataAssunzione valore da assegnare al campo DataAssunzione.
    */
    public void setDataAssunzione(java.sql.Timestamp pTimestampDataAssunzione) {
        dataAssunzione = pTimestampDataAssunzione;
        dataAssunzioneIsModified = true;
    }

    public void setDataAssunzioneto(java.sql.Timestamp pTimestampDataAssunzione) {
        dataAssunzioneto = pTimestampDataAssunzione;
        dataAssunzionetoIsModified = true;
    }

    /**
     * Indica se il campo DataAssunzione � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataAssunzione � stato modificato, <tt>false</tt> se il campo DataAssunzione non � stato modificato.
     */
    public boolean isDataAssunzioneModified() {
        return dataAssunzioneIsModified;
    }

    public boolean isDataAssunzionetoModified() {
        return dataAssunzionetoIsModified;
    }

    /**
     * Restituisce il valore del campo DataCessazione.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_cessazione
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataCessazione.
     */
    public java.sql.Timestamp getDataCessazione() {
        return dataCessazione;
    }

    public java.sql.Timestamp getDataCessazioneto() {
        return dataCessazioneto;
    }

    /**
    * Assegna il valore passato in input al campo DataCessazione.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_cessazione
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataCessazione valore da assegnare al campo DataCessazione.
    */
    public void setDataCessazione(java.sql.Timestamp pTimestampDataCessazione) {
        dataCessazione = pTimestampDataCessazione;
        dataCessazioneIsModified = true;
    }

    public void setDataCessazioneto(java.sql.Timestamp pTimestampDataCessazione) {
        dataCessazioneto = pTimestampDataCessazione;
        dataCessazionetoIsModified = true;
    }

    /**
     * Indica se il campo DataCessazione � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataCessazione � stato modificato, <tt>false</tt> se il campo DataCessazione non � stato modificato.
     */
    public boolean isDataCessazioneModified() {
        return dataCessazioneIsModified;
    }

    public boolean isDataCessazionetoModified() {
        return dataCessazionetoIsModified;
    }

    /**
     * Restituisce il valore del campo LivelloAttuale.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.livello_attuale
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo LivelloAttuale.
     */
    public Integer getLivelloAttuale() {
        return livelloAttuale;
    }

    /**
    * Assegna il valore passato in input al campo LivelloAttuale.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.livello_attuale
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntLivelloAttuale valore da assegnare al campo LivelloAttuale.
    */
    public void setLivelloAttuale(Integer pIntLivelloAttuale) {
        livelloAttuale = pIntLivelloAttuale;
        livelloAttualeIsModified = true;
    }

    /**
     * Indica se il campo LivelloAttuale � stato modificato.
     *
     * @return <tt>true</tt> se il campo LivelloAttuale � stato modificato, <tt>false</tt> se il campo LivelloAttuale non � stato modificato.
     */
    public boolean isLivelloAttualeModified() {
        return livelloAttualeIsModified;
    }

    /**
     * Restituisce il valore del campo DataLivelloAttuale.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_livello_attuale
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataLivelloAttuale.
     */
    public java.sql.Timestamp getDataLivelloAttuale() {
        return dataLivelloAttuale;
    }

    public java.sql.Timestamp getDataLivelloAttualeto() {
        return dataLivelloAttualeto;
    }

    /**
    * Assegna il valore passato in input al campo DataLivelloAttuale.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_livello_attuale
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataLivelloAttuale valore da assegnare al campo DataLivelloAttuale.
    */
    public void setDataLivelloAttuale(
        java.sql.Timestamp pTimestampDataLivelloAttuale) {
        dataLivelloAttuale = pTimestampDataLivelloAttuale;
        dataLivelloAttualeIsModified = true;
    }

    public void setDataLivelloAttualeto(
        java.sql.Timestamp pTimestampDataLivelloAttuale) {
        dataLivelloAttualeto = pTimestampDataLivelloAttuale;
        dataLivelloAttualetoIsModified = true;
    }

    /**
     * Indica se il campo DataLivelloAttuale � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataLivelloAttuale � stato modificato, <tt>false</tt> se il campo DataLivelloAttuale non � stato modificato.
     */
    public boolean isDataLivelloAttualeModified() {
        return dataLivelloAttualeIsModified;
    }

    public boolean isDataLivelloAttualetoModified() {
        return dataLivelloAttualetoIsModified;
    }

    /**
     * Restituisce il valore del campo LivelloPrecedente.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.livello_precedente
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo LivelloPrecedente.
     */
    public Integer getLivelloPrecedente() {
        return livelloPrecedente;
    }

    /**
    * Assegna il valore passato in input al campo LivelloPrecedente.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.livello_precedente
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntLivelloPrecedente valore da assegnare al campo LivelloPrecedente.
    */
    public void setLivelloPrecedente(Integer pIntLivelloPrecedente) {
        livelloPrecedente = pIntLivelloPrecedente;
        livelloPrecedenteIsModified = true;
    }

    /**
     * Indica se il campo LivelloPrecedente � stato modificato.
     *
     * @return <tt>true</tt> se il campo LivelloPrecedente � stato modificato, <tt>false</tt> se il campo LivelloPrecedente non � stato modificato.
     */
    public boolean isLivelloPrecedenteModified() {
        return livelloPrecedenteIsModified;
    }

    /**
     * Restituisce il valore del campo DataLivelloPrecedente.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_livello_precedente
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataLivelloPrecedente.
     */
    public java.sql.Timestamp getDataLivelloPrecedente() {
        return dataLivelloPrecedente;
    }

    public java.sql.Timestamp getDataLivelloPrecedenteto() {
        return dataLivelloPrecedenteto;
    }

    /**
    * Assegna il valore passato in input al campo DataLivelloPrecedente.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_livello_precedente
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataLivelloPrecedente valore da assegnare al campo DataLivelloPrecedente.
    */
    public void setDataLivelloPrecedente(
        java.sql.Timestamp pTimestampDataLivelloPrecedente) {
        dataLivelloPrecedente = pTimestampDataLivelloPrecedente;
        dataLivelloPrecedenteIsModified = true;
    }

    public void setDataLivelloPrecedenteto(
        java.sql.Timestamp pTimestampDataLivelloPrecedente) {
        dataLivelloPrecedenteto = pTimestampDataLivelloPrecedente;
        dataLivelloPrecedentetoIsModified = true;
    }

    /**
     * Indica se il campo DataLivelloPrecedente � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataLivelloPrecedente � stato modificato, <tt>false</tt> se il campo DataLivelloPrecedente non � stato modificato.
     */
    public boolean isDataLivelloPrecedenteModified() {
        return dataLivelloPrecedenteIsModified;
    }

    public boolean isDataLivelloPrecedentetoModified() {
        return dataLivelloPrecedentetoIsModified;
    }

    /**
     * Restituisce il valore del campo ScattiAnzianita.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.scatti_anzianita
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo ScattiAnzianita.
     */
    public Integer getScattiAnzianita() {
        return scattiAnzianita;
    }

    /**
    * Assegna il valore passato in input al campo ScattiAnzianita.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.scatti_anzianita
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntScattiAnzianita valore da assegnare al campo ScattiAnzianita.
    */
    public void setScattiAnzianita(Integer pIntScattiAnzianita) {
        scattiAnzianita = pIntScattiAnzianita;
        scattiAnzianitaIsModified = true;
    }

    /**
     * Indica se il campo ScattiAnzianita � stato modificato.
     *
     * @return <tt>true</tt> se il campo ScattiAnzianita � stato modificato, <tt>false</tt> se il campo ScattiAnzianita non � stato modificato.
     */
    public boolean isScattiAnzianitaModified() {
        return scattiAnzianitaIsModified;
    }

    /**
     * Restituisce il valore del campo DataProssimoScatto.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.data_prossimo_scatto
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo DataProssimoScatto.
     */
    public java.sql.Timestamp getDataProssimoScatto() {
        return dataProssimoScatto;
    }

    public java.sql.Timestamp getDataProssimoScattoto() {
        return dataProssimoScattoto;
    }

    /**
    * Assegna il valore passato in input al campo DataProssimoScatto.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.data_prossimo_scatto
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampDataProssimoScatto valore da assegnare al campo DataProssimoScatto.
    */
    public void setDataProssimoScatto(
        java.sql.Timestamp pTimestampDataProssimoScatto) {
        dataProssimoScatto = pTimestampDataProssimoScatto;
        dataProssimoScattoIsModified = true;
    }

    public void setDataProssimoScattoto(
        java.sql.Timestamp pTimestampDataProssimoScatto) {
        dataProssimoScattoto = pTimestampDataProssimoScatto;
        dataProssimoScattotoIsModified = true;
    }

    /**
     * Indica se il campo DataProssimoScatto � stato modificato.
     *
     * @return <tt>true</tt> se il campo DataProssimoScatto � stato modificato, <tt>false</tt> se il campo DataProssimoScatto non � stato modificato.
     */
    public boolean isDataProssimoScattoModified() {
        return dataProssimoScattoIsModified;
    }

    public boolean isDataProssimoScattotoModified() {
        return dataProssimoScattotoIsModified;
    }

    /**
     * Restituisce il valore del campo Tfr.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.TFR
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo Tfr.
     */
    public String getTfr() {
        return tfr;
    }

    /**
    * Assegna il valore passato in input al campo Tfr.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.TFR
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrTfr valore da assegnare al campo Tfr.
    */
    public void setTfr(String pStrTfr) {
        tfr = pStrTfr;
        tfrIsModified = true;
    }

    /**
     * Indica se il campo Tfr � stato modificato.
     *
     * @return <tt>true</tt> se il campo Tfr � stato modificato, <tt>false</tt> se il campo Tfr non � stato modificato.
     */
    public boolean isTfrModified() {
        return tfrIsModified;
    }

    /**
     * Restituisce il valore del campo FamiliariCarico.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.familiari_carico
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo FamiliariCarico.
     */
    public Integer getFamiliariCarico() {
        return familiariCarico;
    }

    /**
    * Assegna il valore passato in input al campo FamiliariCarico.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.familiari_carico
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntFamiliariCarico valore da assegnare al campo FamiliariCarico.
    */
    public void setFamiliariCarico(Integer pIntFamiliariCarico) {
        familiariCarico = pIntFamiliariCarico;
        familiariCaricoIsModified = true;
    }

    /**
     * Indica se il campo FamiliariCarico � stato modificato.
     *
     * @return <tt>true</tt> se il campo FamiliariCarico � stato modificato, <tt>false</tt> se il campo FamiliariCarico non � stato modificato.
     */
    public boolean isFamiliariCaricoModified() {
        return familiariCaricoIsModified;
    }

    /**
     * Restituisce il valore del campo InizioCongedo.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.inizio_congedo
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo InizioCongedo.
     */
    public java.sql.Timestamp getInizioCongedo() {
        return inizioCongedo;
    }

    public java.sql.Timestamp getInizioCongedoto() {
        return inizioCongedoto;
    }

    /**
    * Assegna il valore passato in input al campo InizioCongedo.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.inizio_congedo
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampInizioCongedo valore da assegnare al campo InizioCongedo.
    */
    public void setInizioCongedo(java.sql.Timestamp pTimestampInizioCongedo) {
        inizioCongedo = pTimestampInizioCongedo;
        inizioCongedoIsModified = true;
    }

    public void setInizioCongedoto(java.sql.Timestamp pTimestampInizioCongedo) {
        inizioCongedoto = pTimestampInizioCongedo;
        inizioCongedotoIsModified = true;
    }

    /**
     * Indica se il campo InizioCongedo � stato modificato.
     *
     * @return <tt>true</tt> se il campo InizioCongedo � stato modificato, <tt>false</tt> se il campo InizioCongedo non � stato modificato.
     */
    public boolean isInizioCongedoModified() {
        return inizioCongedoIsModified;
    }

    public boolean isInizioCongedotoModified() {
        return inizioCongedotoIsModified;
    }

    /**
     * Restituisce il valore del campo FineCongedo.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.fine_congedo
     * <li>dimensione colonna: 23
     * <li>jdbc type restituito dal driver: Types.TIMESTAMP
     * </ul>
     *
     * @return il valore del campo FineCongedo.
     */
    public java.sql.Timestamp getFineCongedo() {
        return fineCongedo;
    }

    public java.sql.Timestamp getFineCongedoto() {
        return fineCongedoto;
    }

    /**
    * Assegna il valore passato in input al campo FineCongedo.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.fine_congedo
    * <li>dimensione colonna: 23
    * <li>jdbc type restituito dal driver: Types.TIMESTAMP
    * </ul>
    *
    * @param pTimestampFineCongedo valore da assegnare al campo FineCongedo.
    */
    public void setFineCongedo(java.sql.Timestamp pTimestampFineCongedo) {
        fineCongedo = pTimestampFineCongedo;
        fineCongedoIsModified = true;
    }

    public void setFineCongedoto(java.sql.Timestamp pTimestampFineCongedo) {
        fineCongedoto = pTimestampFineCongedo;
        fineCongedotoIsModified = true;
    }

    /**
     * Indica se il campo FineCongedo � stato modificato.
     *
     * @return <tt>true</tt> se il campo FineCongedo � stato modificato, <tt>false</tt> se il campo FineCongedo non � stato modificato.
     */
    public boolean isFineCongedoModified() {
        return fineCongedoIsModified;
    }

    public boolean isFineCongedotoModified() {
        return fineCongedotoIsModified;
    }

    /**
     * Restituisce il valore del campo IdTitoloStudio.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.id_titolo_studio
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo IdTitoloStudio.
     */
    public Integer getIdTitoloStudio() {
        return idTitoloStudio;
    }

    /**
    * Assegna il valore passato in input al campo IdTitoloStudio.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.id_titolo_studio
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntIdTitoloStudio valore da assegnare al campo IdTitoloStudio.
    */
    public void setIdTitoloStudio(Integer pIntIdTitoloStudio) {
        idTitoloStudio = pIntIdTitoloStudio;
        idTitoloStudioIsModified = true;
    }

    /**
     * Indica se il campo IdTitoloStudio � stato modificato.
     *
     * @return <tt>true</tt> se il campo IdTitoloStudio � stato modificato, <tt>false</tt> se il campo IdTitoloStudio non � stato modificato.
     */
    public boolean isIdTitoloStudioModified() {
        return idTitoloStudioIsModified;
    }

    /**
     * Restituisce il valore del campo LuogoNascita.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.luogo_nascita
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo LuogoNascita.
     */
    public String getLuogoNascita() {
        return luogoNascita;
    }

    /**
    * Assegna il valore passato in input al campo LuogoNascita.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.luogo_nascita
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrLuogoNascita valore da assegnare al campo LuogoNascita.
    */
    public void setLuogoNascita(String pStrLuogoNascita) {
        luogoNascita = pStrLuogoNascita;
        luogoNascitaIsModified = true;
    }

    /**
     * Indica se il campo LuogoNascita � stato modificato.
     *
     * @return <tt>true</tt> se il campo LuogoNascita � stato modificato, <tt>false</tt> se il campo LuogoNascita non � stato modificato.
     */
    public boolean isLuogoNascitaModified() {
        return luogoNascitaIsModified;
    }

    /**
     * Restituisce il valore del campo IndirizzoResidenza.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.indirizzo_residenza
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo IndirizzoResidenza.
     */
    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    /**
    * Assegna il valore passato in input al campo IndirizzoResidenza.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.indirizzo_residenza
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrIndirizzoResidenza valore da assegnare al campo IndirizzoResidenza.
    */
    public void setIndirizzoResidenza(String pStrIndirizzoResidenza) {
        indirizzoResidenza = pStrIndirizzoResidenza;
        indirizzoResidenzaIsModified = true;
    }

    /**
     * Indica se il campo IndirizzoResidenza � stato modificato.
     *
     * @return <tt>true</tt> se il campo IndirizzoResidenza � stato modificato, <tt>false</tt> se il campo IndirizzoResidenza non � stato modificato.
     */
    public boolean isIndirizzoResidenzaModified() {
        return indirizzoResidenzaIsModified;
    }

    /**
     * Restituisce il valore del campo LuogoResidenza.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.luogo_residenza
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo LuogoResidenza.
     */
    public String getLuogoResidenza() {
        return luogoResidenza;
    }

    /**
    * Assegna il valore passato in input al campo LuogoResidenza.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.luogo_residenza
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrLuogoResidenza valore da assegnare al campo LuogoResidenza.
    */
    public void setLuogoResidenza(String pStrLuogoResidenza) {
        luogoResidenza = pStrLuogoResidenza;
        luogoResidenzaIsModified = true;
    }

    /**
     * Indica se il campo LuogoResidenza � stato modificato.
     *
     * @return <tt>true</tt> se il campo LuogoResidenza � stato modificato, <tt>false</tt> se il campo LuogoResidenza non � stato modificato.
     */
    public boolean isLuogoResidenzaModified() {
        return luogoResidenzaIsModified;
    }

    /**
     * Restituisce il valore del campo IndirizzoDomicilio.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.indirizzo_domicilio
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo IndirizzoDomicilio.
     */
    public String getIndirizzoDomicilio() {
        return indirizzoDomicilio;
    }

    /**
    * Assegna il valore passato in input al campo IndirizzoDomicilio.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.indirizzo_domicilio
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrIndirizzoDomicilio valore da assegnare al campo IndirizzoDomicilio.
    */
    public void setIndirizzoDomicilio(String pStrIndirizzoDomicilio) {
        indirizzoDomicilio = pStrIndirizzoDomicilio;
        indirizzoDomicilioIsModified = true;
    }

    /**
     * Indica se il campo IndirizzoDomicilio � stato modificato.
     *
     * @return <tt>true</tt> se il campo IndirizzoDomicilio � stato modificato, <tt>false</tt> se il campo IndirizzoDomicilio non � stato modificato.
     */
    public boolean isIndirizzoDomicilioModified() {
        return indirizzoDomicilioIsModified;
    }

    /**
     * Restituisce il valore del campo LuogoDomicilio.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.luogo_domicilio
     * <li>dimensione colonna: 50
     * <li>jdbc type restituito dal driver: Types.VARCHAR
     * </ul>
     *
     * @return il valore del campo LuogoDomicilio.
     */
    public String getLuogoDomicilio() {
        return luogoDomicilio;
    }

    /**
    * Assegna il valore passato in input al campo LuogoDomicilio.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.luogo_domicilio
    * <li>dimensione colonna: 50
    * <li>jdbc type restituito dal driver: Types.VARCHAR
    * </ul>
    *
    * @param pStrLuogoDomicilio valore da assegnare al campo LuogoDomicilio.
    */
    public void setLuogoDomicilio(String pStrLuogoDomicilio) {
        luogoDomicilio = pStrLuogoDomicilio;
        luogoDomicilioIsModified = true;
    }

    /**
     * Indica se il campo LuogoDomicilio � stato modificato.
     *
     * @return <tt>true</tt> se il campo LuogoDomicilio � stato modificato, <tt>false</tt> se il campo LuogoDomicilio non � stato modificato.
     */
    public boolean isLuogoDomicilioModified() {
        return luogoDomicilioIsModified;
    }

    /**
     * Restituisce il valore del campo Cellulare.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.cellulare
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo Cellulare.
     */
    public String getCellulare() {
        return cellulare;
    }

    /**
    * Assegna il valore passato in input al campo Cellulare.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.cellulare
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pStrCellulare valore da assegnare al campo Cellulare.
    */
    public void setCellulare(String pStrCellulare) {
        cellulare = pStrCellulare;
        cellulareIsModified = true;
    }

    /**
     * Indica se il campo Cellulare � stato modificato.
     *
     * @return <tt>true</tt> se il campo Cellulare � stato modificato, <tt>false</tt> se il campo Cellulare non � stato modificato.
     */
    public boolean isCellulareModified() {
        return cellulareIsModified;
    }

    /**
     * Restituisce il valore del campo TelefonoCasa.
     * <br>
     * Meta Data:
     * <ul>
     * <li>nome colonna: dipendenti.telefono_casa
     * <li>dimensione colonna: 10
     * <li>jdbc type restituito dal driver: Types.INTEGER
     * </ul>
     *
     * @return il valore del campo TelefonoCasa.
     */
    public Integer getTelefonoCasa() {
        return telefonoCasa;
    }

    /**
    * Assegna il valore passato in input al campo TelefonoCasa.
    * <br>
    * Il nuovo valore � assegnato solo se il nuovo valore da
    * assegnare e il valore corrente del campo sono differenti.
    * <br>
    * Meta Data:
    * <ul>
    * <li>nome colonna: dipendenti.telefono_casa
    * <li>dimensione colonna: 10
    * <li>jdbc type restituito dal driver: Types.INTEGER
    * </ul>
    *
    * @param pIntTelefonoCasa valore da assegnare al campo TelefonoCasa.
    */
    public void setTelefonoCasa(Integer pIntTelefonoCasa) {
        telefonoCasa = pIntTelefonoCasa;
        telefonoCasaIsModified = true;
    }

    /**
     * Indica se il campo TelefonoCasa � stato modificato.
     *
     * @return <tt>true</tt> se il campo TelefonoCasa � stato modificato, <tt>false</tt> se il campo TelefonoCasa non � stato modificato.
     */
    public boolean isTelefonoCasaModified() {
        return telefonoCasaIsModified;
    }

    /**
     * Restituisce <tt>true</tt> se uno dei campi del bean si trova nello stato 'modificato',
     * <tt>false</tt> altrimenti.
     *
     * @return <tt>true</tt> se uno dei campi del bean si trova nello stato 'modificato',
     * <tt>false</tt> altrimenti.
     */
    public boolean isModified() {
        return idDipendenteIsModified || numeroMatricolaIsModified ||
        nomeIsModified || cognomeIsModified || fullnameIsModified || codiceFiscaleIsModified ||
        dataNascitaIsModified || dataAssunzioneIsModified ||
        dataCessazioneIsModified || livelloAttualeIsModified ||
        dataLivelloAttualeIsModified || livelloPrecedenteIsModified ||
        dataLivelloPrecedenteIsModified || scattiAnzianitaIsModified ||
        dataProssimoScattoIsModified || tfrIsModified || ibanIsModified ||
        familiariCaricoIsModified || inizioCongedoIsModified ||
        fineCongedoIsModified || idTitoloStudioIsModified ||
        luogoNascitaIsModified || indirizzoResidenzaIsModified ||
        luogoResidenzaIsModified || indirizzoDomicilioIsModified ||
        luogoDomicilioIsModified || cellulareIsModified ||
        telefonoCasaIsModified;
    }

    /**
     * Ritorna una clonazione del bean corrente.
     *
     * @return clone del bean.
     */
    public DipendentiBean clone() {
        DipendentiBean lDipendentiBean = new DipendentiBean();
        lDipendentiBean.setIdDipendente(this.getIdDipendente());
        lDipendentiBean.setNumeroMatricola(this.getNumeroMatricola());
        lDipendentiBean.setNome(this.getNome());
        lDipendentiBean.setCognome(this.getCognome());
        lDipendentiBean.setCodiceFiscale(this.getCodiceFiscale());
        lDipendentiBean.setDataNascita(this.getDataNascita());
        lDipendentiBean.setDataAssunzione(this.getDataAssunzione());
        lDipendentiBean.setDataCessazione(this.getDataCessazione());
        lDipendentiBean.setLivelloAttuale(this.getLivelloAttuale());
        lDipendentiBean.setDataLivelloAttuale(this.getDataLivelloAttuale());
        lDipendentiBean.setLivelloPrecedente(this.getLivelloPrecedente());
        lDipendentiBean.setDataLivelloPrecedente(this.getDataLivelloPrecedente());
        lDipendentiBean.setScattiAnzianita(this.getScattiAnzianita());
        lDipendentiBean.setDataProssimoScatto(this.getDataProssimoScatto());
        lDipendentiBean.setTfr(this.getTfr());
        lDipendentiBean.setIban(this.getIban());
        lDipendentiBean.setFamiliariCarico(this.getFamiliariCarico());
        lDipendentiBean.setInizioCongedo(this.getInizioCongedo());
        lDipendentiBean.setFineCongedo(this.getFineCongedo());
        lDipendentiBean.setIdTitoloStudio(this.getIdTitoloStudio());
        lDipendentiBean.setLuogoNascita(this.getLuogoNascita());
        lDipendentiBean.setIndirizzoResidenza(this.getIndirizzoResidenza());
        lDipendentiBean.setLuogoResidenza(this.getLuogoResidenza());
        lDipendentiBean.setIndirizzoDomicilio(this.getIndirizzoDomicilio());
        lDipendentiBean.setLuogoDomicilio(this.getLuogoDomicilio());
        lDipendentiBean.setCellulare(this.getCellulare());
        lDipendentiBean.setTelefonoCasa(this.getTelefonoCasa());

        return lDipendentiBean;
    }

   
}
